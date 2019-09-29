FROM centos

RUN yum install -y java

VOLUME /tmp

ADD target/search-opportunity-api-0.0.1-SNAPSHOT.jar search-opportunity-api.jar

RUN sh -c 'touch search-opportunity-api.jar'

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/search-opportunity-api.jar"]
