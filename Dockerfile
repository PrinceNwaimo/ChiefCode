FROM maven:3.8.7 as build
COPY . .
RUN mvn -B clean package -DskipTests

FROM openjdk:17
COPY --from=build target/*.jar app.jar

# Set a default value for the PROFILE environment variable
ENV PROFILE=dev
ENV PORT=8080

ENTRYPOINT ["java", "-jar", "-Dserver.port=${PORT}", "-Dspring.profiles.active=${PROFILE}", "app.jar"]