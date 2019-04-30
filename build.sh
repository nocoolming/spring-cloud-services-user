#!/usr/bin/env bash

# docker image version
VERSION=2.9

echo maven packaging
chmod +x mvnw
./mvnw -B -DskipTests clean package

echo remove old docker image
docker rmi nocoolming/service-user:$VERSION

echo build new docker
docker build -t nocoolming/service-user:$VERSION .


#push
echo login to aliyun docker registry
cat password.txt | docker login --username=nocoolming@aliyun.com registry.cn-shanghai.aliyuncs.com --password-stdin

echo remove docker image on local
docker rmi registry.cn-shanghai.aliyuncs.com/nocoolming/service-user:$VERSION

echo tag docker image
docker tag nocoolming/service-user:$VERSION registry.cn-shanghai.aliyuncs.com/nocoolming/service-user:$VERSION

echo pushing to aliyun docker registry
docker push registry.cn-shanghai.aliyuncs.com/nocoolming/service-user:$VERSION


# Deploy
# project path
PROJECT_PATH=~/projects/spring-cloud/service-user/


echo uploading latest version service-user.yaml
scp service-user.yaml root@192.168.1.171:$PROJECT_PATH/service-user.yaml

echo upgrade service on kubernetes
ssh root@192.168.1.171 $PROJECT_PATH/upgrade.sh $VERSION

