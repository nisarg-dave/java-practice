FROM openjdk:latest

WORKDIR /app

COPY . .

RUN javac Main.java

CMD ["java", "Main"]