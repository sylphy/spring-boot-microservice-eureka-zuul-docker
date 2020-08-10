FROM openjdk:11-jdk-slim
MAINTAINER Takayoshi SHIRAKI <tasiraki77@gmail.com>
ADD target/containerized-scgateway-*.jar containerized-scgateway.jar
ENV HOST_NAME gateway
ENV PORT 8763
ENV DISCOVERY http://localhost:3001/eureka/
ENTRYPOINT ["java", "-jar", "/containerized-scgateway.jar"]
