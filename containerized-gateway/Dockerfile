FROM openjdk:11-jdk-slim
MAINTAINER Taner Diler <taner.diler@gmail.com>
ADD target/containerized-gateway-*.jar containerized-gateway.jar
ENV LOGSTASH_DEST localhost:5000
ENTRYPOINT ["java", "-jar", "/containerized-gateway.jar", "--spring.logstash.dest=${LOGSTASH_DEST}"]
EXPOSE 8761
