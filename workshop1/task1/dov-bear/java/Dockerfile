# build
FROM openjdk:17-alpine AS build
ARG APP_DIR=/app
WORKDIR ${APP_DIR}

#ADD mvnw .
#ADD .mvn .mvn
ADD pom.xml .
ADD src src

RUN apk add --no-cache maven
RUN mvn package

# deploy and run

FROM openjdk:17-alpine
ENV APP_DIR=/app 
ENV PORT=3000

COPY --from=build ${APP_DIR}/target /${APP_DIR}/

WORKDIR ${APP_DIR}
EXPOSE ${PORT}

ENTRYPOINT ["java","-jar","dovbear-0.0.1-SNAPSHOT.jar"]