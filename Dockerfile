FROM eclipse-temurin:17-jre-alpine

WORKDIR /app

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]