FROM openjdk:17-slim-bullseye AS build
RUN apt-get update && apt-get install -y curl \
    && curl -sSfL https://raw.githubusercontent.com/infracost/infracost/master/scripts/install.sh | sh
# Set Infracost API Key
ENV INFRACOST_API_KEY=ico-WLVZ2zQzkAi5Kn4KknpT5bsDOvTpBpKG
# Configure Infracost API Key
RUN infracost configure set api_key $INFRACOST_API_KEY
COPY target/AzurePfe-0.0.1-SNAPSHOT.jar .
EXPOSE 8093
ENTRYPOINT ["java", "-jar", "AzurePfe-0.0.1-SNAPSHOT.jar"]
