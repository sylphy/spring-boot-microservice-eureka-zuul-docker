FROM openjdk:11-jdk-slim
MAINTAINER Taner Diler <taner.diler@gmail.com>
ADD target/containerized-accounts-*.jar containerized-accounts.jar
ENV HOST_NAME localhost
ENV PORT 2000
ENV DISCOVERY=http://localhost:8761/eureka/
ENTRYPOINT ["java", "-jar", "/containerized-accounts.jar"]
