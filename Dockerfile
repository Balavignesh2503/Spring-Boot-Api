# Use Java 17
FROM eclipse-temurin:17-jdk-alpine

# Set working directory
WORKDIR /app

# Copy Gradle files
COPY . .

# Build the app
RUN ./gradlew build -x test

# Expose port
EXPOSE 8080

# Run the app
CMD ["java", "-jar", "build/libs/demo-0.0.1-SNAPSHOT.jar"]