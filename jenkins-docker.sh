
# run docker from jenkins image
docker run -ti -v /var/run/docker.sock:/var/run/docker.sock -p 8080:8080 -u root jenkins/jenkins

# todo install plugins on Dockerfile
COPY plugins.txt /usr/share/jenkins/ref/plugins.txt
RUN xargs /usr/local/bin/install-plugins.sh < /usr/share/jenkins/ref/plugins.txt

# todo activate node in global tools

# access docker cli
docker exec -it -u root 5c bash

# within docker
apt-get update && \
apt-get -y install apt-transport-https \
     ca-certificates \
     curl \
     gnupg2 \
     software-properties-common && \
curl -fsSL https://download.docker.com/linux/$(. /etc/os-release; echo "$ID")/gpg > /tmp/dkey; apt-key add /tmp/dkey && \
add-apt-repository \
   "deb [arch=amd64] https://download.docker.com/linux/$(. /etc/os-release; echo "$ID") \
   $(lsb_release -cs) \
   stable" && \
apt-get update && \
apt-get -y install docker-ce

# set up pipeline project

# github user credentials in jenkin

# start docker 
docker start 028b1836f45d

# todo give privileges to jenkins user to run docker commands
# sudo usermod -a -G docker $USER