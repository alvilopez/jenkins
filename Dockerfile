FROM openjdk:11-jre
COPY target/h2sample-0.0.1-SNAPSHOT.jar webapp.jar
EXPOSE 8088
CMD ["java", "-jar", "webapp.jar" ]
