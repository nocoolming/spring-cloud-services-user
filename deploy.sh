#!/usr/bin/env bash

# docker image version
VERSION=1.8
# project path
PROJECT_PATH=~/projects/spring-cloud/service-user/


echo uploading latest version service-user.yaml
scp service-user.yaml root@192.168.1.171:$PROJECT_PATH/service-user.yaml

echo upgrade service on kubernetes
ssh root@192.168.1.171 $PROJECT_PATH/upgrade.sh $VERSION