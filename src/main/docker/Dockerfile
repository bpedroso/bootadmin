LABEL maintainer="pedroso.bruno@gmail.com"
LABEL platformbuilders="http://platformbuilders.io/"

ARG CODE_VERSION=8-jre-alpine
FROM openjdk:${CODE_VERSION}

ADD bootadmin.jar bootadmin.jar

ENV JAVA_OPTS=""
ENTRYPOINT ["java","$JAVA_OPTS","-Dspring.profiles.active=docker","-jar","/bootadmin.jar"]
