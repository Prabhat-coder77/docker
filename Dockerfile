FROM openjdk:17

COPY target/SpringBoot-docker.jar  /usr/app/

WORKDIR /usr/app/

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "SpringBoot-docker.jar"]
