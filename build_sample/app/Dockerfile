FROM openjdk:17-alpine

ARG JAR_FILE_PATH=./build/libs/app-0.0.1-SNAPSHOT.jar

COPY ${JAR_FILE_PATH} /app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]