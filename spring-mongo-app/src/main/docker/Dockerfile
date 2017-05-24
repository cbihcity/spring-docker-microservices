FROM java:8
ADD simple-mongo-app-0.0.1-SNAPSHOT.jar app.jar
RUN sh -c 'touch /app.jar'
EXPOSE 1111
ENTRYPOINT ["java","-jar","/app.jar"]