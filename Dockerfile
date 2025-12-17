# Use Java 17
FROM eclipse-temurin:17-jdk-alpine

# Set working directory
WORKDIR /app

# Copy all project files
COPY . .

# Make gradlew executable
RUN chmod +x gradlew

# Build the app (skip tests)
RUN ./gradlew build -x test

# Expose port
EXPOSE 8080

# Run the app
CMD ["java", "-jar", "build/libs/demo-0.0.1-SNAPSHOT.jar"]
