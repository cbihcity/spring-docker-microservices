FROM java:8
ADD simple-jpa-ap-0.0.1-SNAPSHOT.jar app.jar
RUN sh -c 'touch /app.jar'
EXPOSE 8090
ENTRYPOINT ["java","-jar","/app.jar"]