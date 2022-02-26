FROM openjdk:11
ARG JAR_FILE=java-cicd/*.jar
COPY ${JAR_FILE} java-cicd.jar
ENTRYPOINT ["java","-jar","/java-cicd.jar"]