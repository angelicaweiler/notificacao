FROM gradle:7.5-jdk17 as build
WORKDIR /app
copy . .
run gradle build --no-daemon

FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
COPY --from=build /app/build/libs/notificacao-0.0.1-SNAPSHOT.jar  app.jar

EXPOSE 8082

CMD ["java", "-jar", "app.jar"]
