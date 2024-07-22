FROM maven:3.8.5-openjdk-17-slim AS build

RUN apt-get update && apt-get install -y curl
RUN curl -sSfL https://raw.githubusercontent.com/infracost/infracost/master/scripts/install.sh | sh

COPY target/AzurePfe-0.0.1-SNAPSHOT.jar .

EXPOSE 8093

ENTRYPOINT ["java", "-jar", "AzurePfe-0.0.1-SNAPSHOT.jar"]
