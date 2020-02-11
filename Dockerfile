FROM tomcat:9-jdk8
COPY target/carrellottf-1.0-SNAPSHOT.war /usr/local/tomcat/webapps
