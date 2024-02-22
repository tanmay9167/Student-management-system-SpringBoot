FROM openjdk:17-jdk-slim 
ADD *.jar app1.jar 
RUN apt-get update && apt-get install -y stress && rm -rf /var/lib/apt/lists/*
ENTRYPOINT ["sh","-c","java -jar /app1.jar"] 
EXPOSE 8080