FROM openjdk:11
MAINTAINER Mingming Li  "21374618@qq.com"

WORKDIR /app
COPY target/service-user-1.7.jar /app
COPY agent ./agent

ENV JAVA_OPTS="-XX:+UseG1GC"

RUN echo 'Asia/Shanghai' > /etc/timezone

ENTRYPOINT ["java", "-Duser.timezone=Asia/Shanghai", "-javaagent:/app/agent/skywalking-agent.jar","-jar", "/app/service-user-1.7.jar"]