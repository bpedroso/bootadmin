FROM java:8
ADD /target/bootadmin.jar bootadmin.jar
ENV JAVA_OPTS=""
ENTRYPOINT exec java $JAVA_OPTS -jar bootadmin.jar