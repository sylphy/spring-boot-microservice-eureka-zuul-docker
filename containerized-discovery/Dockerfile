FROM openjdk:11-jdk-slim
MAINTAINER Taner Diler <taner.diler@gmail.com>
ADD target/containerized-discovery-*.jar containerized-discovery.jar
ENV LOGSTASH_DEST localhost:5000
ENTRYPOINT ["java", "-jar", "/containerized-discovery.jar", "--spring.logstash.dest=${LOGSTASH_DEST}"]
EXPOSE 8761
