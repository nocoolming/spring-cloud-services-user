#!/usr/bin/env bash

# docker image version
VERSION=1.6

echo login to aliyun docker registry
cat password.txt | docker login --username=nocoolming@aliyun.com registry.cn-shanghai.aliyuncs.com --password-stdin

echo remove docker image on local
docker rmi registry.cn-shanghai.aliyuncs.com/nocoolming/service-user:$VERSION

echo tag docker image
docker tag nocoolming/service-user:$VERSION registry.cn-shanghai.aliyuncs.com/nocoolming/service-user:$VERSION

echo pushing to aliyun docker registry
docker push registry.cn-shanghai.aliyuncs.com/nocoolming/service-user:$VERSION