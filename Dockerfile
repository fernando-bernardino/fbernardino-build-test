FROM java:8
MAINTAINER Fernando Bernardino <tony.bernardino@gmail.com>

COPY target/app.jar /

EXPOSE 9123

ENTRYPOINT ["java", "-jar", "/app.jar"]