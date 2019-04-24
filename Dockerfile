FROM openjdk:11
MAINTAINER Mingming Li  "21374618@qq.com"

WORKDIR /app
COPY target/service-user-1.7.jar /app

ENTRYPOINT ["java", "-jar", "/app/service-user-1.7.jar"]