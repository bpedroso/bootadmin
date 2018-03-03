![alt text](spring-boot-logo.png)

# bootadmin

# Description
 [![Build Status](https://travis-ci.org/bpedroso/bootadmin.svg?branch=master)](https://travis-ci.org/bpedroso/bootadmin)
 
Service expose with codecentric code for spring boot admin server. This simple code is use tovalidade some services and is deployed on heroku.

 [![Spring Boot Admin by Codecentric]](http://codecentric.github.io/spring-boot-admin/1.5.7/)


# Docker Hub
docker pull bpedroso/bootadmin

--> Because hub.docker.com is the default registry, you do not need to set the registry URL value.

# Running on Maven

## 1 - build a docker image and get the image id

mvn docker:build -X |grep 'Successfully built'|awk '{print $NF}'


## 2 - Use the image id to tag an image

docker tag \[OPTIONS\] <IMAGE> \[REGISTRYHOST/\]\[USERNAME/\]NAME\[:TAG\]  # Tag <image> for upload to registry

docker tag 05ef89eb5c42 bpedroso/bootadmin:latest


## 3 - Login on your registry

docker login -u $REGISTRY_USERNAME -p $REGISTRY_PASSWORD \[REGISTRYHOST\]


## 4 - Push the image to your registry

docker push hub.docker.com/r/bpedroso/bootadmin:latest


# Heroku

## ?
