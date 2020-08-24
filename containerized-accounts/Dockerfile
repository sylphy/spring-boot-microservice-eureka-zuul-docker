FROM openjdk:11-jdk-slim
MAINTAINER Taner Diler <taner.diler@gmail.com>
ADD target/containerized-accounts-*.jar containerized-accounts.jar
ENV HOST_NAME localhost
ENV PORT 2000
ENV DISCOVERY http://localhost:8761/eureka/
ENV OPTS_ARGS=''
ENTRYPOINT ["/bin/sh", "-c","java -jar /containerized-accounts.jar ${OPTS_ARGS}"]
