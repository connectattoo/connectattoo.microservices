FROM alpine:latest

ARG USER_HOME_DIR="/root"

RUN wget -O /etc/apk/keys/amazoncorretto.rsa.pub  https://apk.corretto.aws/amazoncorretto.rsa.pub

RUN echo "https://apk.corretto.aws/" >> /etc/apk/repositories

RUN apk update

RUN apk add amazon-corretto-17

RUN apk add curl unzip gcompat

RUN curl -LO https://github.com/protocolbuffers/protobuf/releases/download/v29.0/protoc-29.0-linux-x86_64.zip

RUN unzip protoc-29.0-linux-x86_64.zip -d "/usr/local"

ENV PATH="$PATH:/usr/local/bin"

RUN curl -LO https://dlcdn.apache.org/maven/maven-3/3.9.9/binaries/apache-maven-3.9.9-bin.zip

RUN unzip apache-maven-3.9.9-bin.zip -d "/usr/local"

ENV PATH="$PATH:/usr/local/apache-maven-3.9.9/bin"

COPY . ./api

WORKDIR ./api

RUN rm -rf ./target

RUN mvn clean install

# CMD [ "mvn spring-boot:run" ]

CMD [ "/bin/sh" ]