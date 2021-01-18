FROM openjdk:15
EXPOSE 8080
ADD target/jenkins-1.0.0.1-SNAPSHOT.jar jenkins-1.0.0.1-SNAPSHOT.jar
ENTRYPOINT ["JAVA", "-jar", "/jenkins-1.0.0.1-SNAPSHOT.jar"]
