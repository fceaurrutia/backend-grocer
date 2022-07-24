FROM eclipse-temurin:17-jdk-focal
WORKDIR /app

COPY .mvn/ ./mvn

COPY mvnw pom.xml ./

WORKDIR /app/build
ENTRYPOINT java -jar app.jar