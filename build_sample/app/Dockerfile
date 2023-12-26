FROM openjdk:17-alpine

ARG JAR_FILE_PATH=./app/build/libs/app.jar

COPY ${JAR_FILE_PATH} ./app.jar

ENTRYPOINT ["java", "-jar", "/app-0.0.1-SNAPSHOT.jar"]