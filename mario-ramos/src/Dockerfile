FROM adoptopenjdk/openjdk11:x86_64-alpine-jdk-11.0.4_11
COPY ./java/target/demo-0.0.1-SNAPSHOT.jar /usr/app/myapp.jar
WORKDIR /usr/app
RUN sh -c 'touch myapp.jar'
ENTRYPOINT ["java","-jar","myapp.jar"]
