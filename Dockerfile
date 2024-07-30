FROM openjdk:17-alpine
EXPOSE 9086
ADD /target/employee-service.jar employee-service.jar
ENTRYPOINT ["java","-jar","/employee-service.jar"]