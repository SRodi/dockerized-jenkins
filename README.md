Build docker image
`docker build . -t jenkins-java-img`

Run docker
`docker run -ti --name test-groovy -v /var/run/docker.sock:/var/run/docker.sock -p 8080:8080 jenkins-java-img`