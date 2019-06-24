#### Dockerized Jenkins with pre-installed:
- NodeJs 
- Docker (single docker deamon on host machine) 

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

### Run docker from latest image on DockerHub

```
docker run -ti --name dockerized-jenkins -v /var/run/docker.sock:/var/run/docker.sock -p 8080:8080 srodi/jenkins:latest
```

### Build local docker image

`docker build . -t dockerized-jenkins-img`

### Run docker from local image

`docker run -ti --name dockerized-jenkins -v /var/run/docker.sock:/var/run/docker.sock -p 8080:8080 dockerized-jenkins-img`
