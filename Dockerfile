FROM amazoncorretto:17.0.7-alpine
ADD target/springboot-mysql-docker.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]