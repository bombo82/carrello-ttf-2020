FROM tomcat:9-jdk8 
COPY . /carrellottf
WORKDIR / 
#RUN apt update -y 
RUN apt install -y wget 
RUN wget -O maven.tgz https://www-eu.apache.org/dist/maven/maven-3/3.6.3/binaries/apache-maven-3.6.3-bin.tar.gz 
RUN tar -xzf maven.tgz 
WORKDIR /carrellottf 
RUN /apache-maven-3.6.3/bin/mvn clean package
RUN cp target/carrellottf-1.0-SNAPSHOT.war /usr/local/tomcat/webapps
