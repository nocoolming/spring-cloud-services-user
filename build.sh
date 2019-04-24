#!/usr/bin/env bash

# docker image version
VERSION=1.8

echo maven packaging
chmod +x mvnw
./mvnw -B -DskipTests clean package

echo remove old docker image
docker rmi nocoolming/service-user:$VERSION

echo build new docker
docker build -t nocoolming/service-user:$VERSION .
