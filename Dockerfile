FROM openjdk:15
ADD target/demoapp.jar demoapp.jar
ENTRYPOINT ["java", "-jar", "demoapp.jar"]