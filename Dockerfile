FROM openjdk:11.0.12-jdk-slim
ADD target/jenkins_docker_demo.jar jenkins_docker_demo.jar
ENTRYPOINT ["sh","-c","java -jar /jenkins_docker_demo.jar"]
EXPOSE 8080
