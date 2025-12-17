FROM govardhandocker123/springbootdocker:1.0
WORKDIR /app
COPY target/dockerpractice-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8090
ENTRYPOINT ["java", "-jar", "app.jar"]
