FROM openjdk:17
WORKDIR /app
COPY target/pdv-bebidas.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
