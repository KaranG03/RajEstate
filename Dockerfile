FROM openjdk:17
COPY target/spring-docker.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]