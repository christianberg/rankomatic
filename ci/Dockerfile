# Installs Jenkins

FROM stackbrew/ubuntu:precise
MAINTAINER Christian Berg <berg.christian@gmail.com>

ENV DEBIAN_FRONTEND noninteractive

RUN echo deb http://get.docker.io/ubuntu docker main > /etc/apt/sources.list.d/docker.list
RUN apt-key adv --keyserver keyserver.ubuntu.com --recv-keys 36A1D7869245C8950F966E92D8576A8BA88D21E9

RUN apt-get update
RUN apt-get install -y openjdk-7-jre-headless git wget ca-certificates lxc-docker

RUN mkdir /jenkins

WORKDIR /jenkins
RUN wget -q http://mirrors.jenkins-ci.org/war/1.553/jenkins.war

RUN mkdir /jenkins/plugins
WORKDIR /jenkins/plugins
RUN wget -q http://mirrors.jenkins-ci.org/plugins/git/2.0.3/git.hpi
RUN wget -q http://mirrors.jenkins-ci.org/plugins/git-client/1.6.3/git-client.hpi
RUN wget -q http://mirrors.jenkins-ci.org/plugins/scm-api/0.2/scm-api.hpi

ENV JENKINS_HOME /jenkins
EXPOSE 8080
CMD ["java", "-Xmx512M", "-jar", "/jenkins/jenkins.war"]