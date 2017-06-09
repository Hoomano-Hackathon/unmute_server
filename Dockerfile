FROM hypriot/rpi-java

COPY ./target/demo-0.0.1-SNAPSHOT.jar ./

EXPOSE 80

ENTRYPOINT ["java", "-jar", "demo-0.0.1-SNAPSHOT.jar"]