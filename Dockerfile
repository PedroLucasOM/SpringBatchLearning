# Multi stage Dockerfile inspired by https://github.com/justiandre/justiandre-exemplo-kotlin-paineltarefas/blob/master/Dockerfile

####################################################################################
# Imagem base das demais
####################################################################################

FROM azul/zulu-openjdk-alpine:11 AS base

WORKDIR /app

COPY property/ /app/property
COPY files/ /app/files

####################################################################################
# Imagem de build com maven
####################################################################################

FROM maven:3.6-jdk-11-slim as build

WORKDIR /build

COPY pom.xml .
RUN mvn dependency:go-offline

COPY src/ /build/src/

ARG ADDITIONAL_TASK_MAVEN

RUN \
    mvn clean install -Dmaven.test.skip=true ${ADDITIONAL_TASK_MAVEN} && \
    mv /build/target/*.jar app.jar

####################################################################################
# Imagem da execução da aplicação
####################################################################################

FROM base AS exec

COPY --from=build /build/app.jar app.jar

ARG PROFILES
ARG PORTs
ARG SPRING_PROFILES_ACTIVE
ARG JAVA_OPTS
ARG SERVER_PORT
ARG PATH_JAR

ENV SPRING_PROFILES_ACTIVE ${SPRING_PROFILES_ACTIVE:-${PROFILES:-default}}
ENV JAVA_OPTS ${JAVA_OPTS:-'-Xmx2g'}
ENV SERVER_PORT ${SERVER_PORT:-${PORT:-8080}}

EXPOSE ${SERVER_PORT}

CMD java ${JAVA_OPTS} -Dspring.batch.job.names=helloWorld -Djava.security.egd=file:/dev/./urandom -jar app.jar