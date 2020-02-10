# BUILD
FROM maven:3-jdk-8 AS builder
COPY . /carrellottf
WORKDIR /carrellottf 
RUN mvn clean package

# DEPLOY DELL'ARTEFATTO
FROM tomcat:9-jdk8
COPY --from=builder carrellottf/target/carrellottf-1.0-SNAPSHOT.war /usr/local/tomcat/webapps
