FROM openjdk:21-jdk

WORKDIR /app

COPY ./src/ ./src/
COPY ./.mvn/ ./.mvn/
COPY pom.xml mvnw ./

RUN ./mvnw package

CMD ["java", "-jar", "target/api-plataforma-curso-0.0.1-SNAPSHOT.jar"]