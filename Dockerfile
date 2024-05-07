FROM amazoncorretto:17.0.7-alpine
EXPOSE 8080
ADD target/spring-data-jpa-pagination-images.jar spring-data-jpa-pagination-images.jar
ENTRYPOINT ["java", "-jar", "/spring-data-jpa-pagination-images.jar"]