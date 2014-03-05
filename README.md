rankomatic
==========

Work in progress.

## Development Setup (on Mac OS X)

* Install [VirtualBox](https://www.virtualbox.org/)
* Install [boot2docker](https://github.com/boot2docker/boot2docker): `brew install boot2docker`
* Install [Docker](https://www.docker.io/) client binary: `brew install docker` 
* Initialize and start boot2docker VM:

```
  $ boot2docker init
  $ boot2docker up
```

Now you can use the local Docker client to manage containers running
inside the VM:

```
$ export DOCKER_HOST=tcp://localhost:4243
$ docker version
Client version: 0.8.1
Go version (client): go1.2.1
Git commit (client): a1598d1
Server version: 0.8.1
Git commit (server): a1598d1
Go version (server): go1.2
Last stable version: 0.8.1
```

## Copyright and License

© 2014 Christian Berg

Published under the MIT License (see the file LICENSE).
