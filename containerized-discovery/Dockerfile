FROM openjdk:11-jdk-slim
MAINTAINER Takayoshi SHIRAKI <tasiraki77@gmail.com>
ADD target/containerized-discovery-*.jar containerized-discovery.jar
ENV HOST_NAME discovery
ENV PORT 8761
ENV ZONE http://localhost:8761/eureka
ENTRYPOINT ["java", "-jar", "/containerized-discovery.jar"]
