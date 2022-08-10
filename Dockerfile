FROM openjdk:15
ADD target/samplemongoapp.jar samplemongoapp.jar
ENTRYPOINT ["java", "-jar", "samplemongoapp.jar"]