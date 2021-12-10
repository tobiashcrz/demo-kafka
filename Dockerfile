FROM adoptopenjdk/openjdk8:alpine-slim
VOLUME /tmp
COPY target/*.jar app.jar
CMD java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar
EXPOSE 8080