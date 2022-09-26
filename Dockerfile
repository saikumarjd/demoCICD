FROM openjdk:17
EXPOSE 8080
ADD target/demoCICD.jar demoCICD.jar
ENTRYPOINT ["java","-jar","demoCICD.jar"]