FROM amazoncorretto:11-alpine-jdk
LABEL app=tour-service-app
MAINTAINER tareltos@gmail.com
COPY build/libs/tour-service-1.0.1-RELEASE.jar /usr/local/image/tour-service-1.0.1-RELEASE.jar
