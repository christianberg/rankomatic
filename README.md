rankomatic
==========

Work in progress.

## Development Setup (on Mac OS X)

* Install VirtualBox
* Install Docker client binary from
  http://test.docker.io/builds/Darwin/x86_64/docker-0.7.6.tgz
  (put it somewhere on your PATH)
* Start boot2docker VM:

```
  $ cd vm
  $ ./boot2docker init
  $ ./boot2docker up
```

Now you can use the local Docker client to manage containers running
inside the VM:

```
$ docker version
Client version: 0.7.6
Go version (client): go1.2
Git commit (client): bc3b2ec
Server version: 0.7.5
Git commit (server): c348c04
Go version (server): go1.2
```

## Copyright and License

© 2014 Christian Berg

Published under the MIT License (see the file LICENSE).

The boot2docker script is copied from
https://github.com/steeve/boot2docker and licensed under the Apache
License 2.0.
