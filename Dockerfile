FROM eclipse-temurin:17-jdk-jammy

WORKDIR /app

COPY . .

RUN ./mvnw clean package -DskipTests

EXPOSE 8081

CMD ["java", "-jar", "target/CourseRegistration-0.0.1-SNAPSHOT.jar"]