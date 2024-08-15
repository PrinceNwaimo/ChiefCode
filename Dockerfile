# Stage 1: Build stage
FROM maven:3.8.7 AS build
COPY . .
RUN mvn -B clean package -DskipTests

# Stage 2: Runtime stage
FROM openjdk:17
COPY --from=build target/*.jar chiefcode.jar

ENV SPRING_PROFILES_ACTIVE=${PROFILE}

ENTRYPOINT ["java", "-jar", "-Dserver.port=8080", "chiefcode.jar"]
