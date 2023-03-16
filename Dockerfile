FROM openjdk:8
COPY ./target/Calculator-1.0-SNAPSHOT.jar ./
ENV LANG C.UTF-8
ENV LC_ALL C.UTF-8
WORKDIR ./
CMD ["java", "-jar", "Calculator-1.0-SNAPSHOT.jar"]