FROM openjdk:21-jdk
WORKDIR /app
COPY target/yandex-report-service-0.0.1-SNAPSHOT.jar /app/yandex-report-service.jar
EXPOSE 8090
ENTRYPOINT ["java", "-jar", "/app/yandex-report-service.jar", "--server.port=8090"]