[![Build Status](http://159.65.143.184:8080/buildStatus/icon?job=dockerized-jenkins)](http://159.65.143.184:8080/job/dockerized-jenkins/)
#### Dockerized Jenkins with pre-installed:
- NodeJs
- Maven
- Docker (single docker deamon on host machine) 

#### Jenkins configuration:
- user authentication setup on first lauch
- authorize project
- matrix-based-authentication
- CSRF protection

#### Jenkins Global Tools:
- jdk7
- jdk8

#### Jenkins plugins:
- git
- github-integration
- authorize-project
- matrix-auth
- embeddable-build-status
- pipeline 

### Run docker from latest srodi/jenkins image on DockerHub

```
docker run -ti --name dockerized-jenkins -v /var/run/docker.sock:/var/run/docker.sock -p 8080:8080 srodi/jenkins:latest
```

### Build local docker image

`docker build . -t dockerized-jenkins-img`

### Run docker from local image

`docker run -ti --name dockerized-jenkins -v /var/run/docker.sock:/var/run/docker.sock -p 8080:8080 dockerized-jenkins-img`
