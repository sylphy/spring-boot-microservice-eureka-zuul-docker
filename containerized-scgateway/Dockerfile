FROM openjdk:11-jdk-slim
MAINTAINER Taner Diler <taner.diler@gmail.com>
ADD target/containerized-scgateway-*.jar containerized-scgateway.jar
ENV LOGSTASH_DEST localhost:5000
ENTRYPOINT ["java", "-jar", "/containerized-scgateway.jar", "--spring.logstash.dest=${LOGSTASH_DEST}"]
EXPOSE 8763
