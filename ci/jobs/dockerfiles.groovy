import jenkins.*
import jenkins.model.*
import groovy.util.FileNameFinder

new FileNameFinder().getFileNames("${WORKSPACE}", '**/Dockerfile').each {
  dockerfile ->
    println dockerfile

    dockerDir = dockerfile.replaceAll("${WORKSPACE}/", '')
                          .replaceAll('/Dockerfile', '')
    imageName = dockerDir.replaceAll('/', '-')

    job {
      name "docker-build-${imageName}"

      scm {
        git('https://github.com/christianberg/rankomatic.git')
      }

      steps {
        shell("""
export DOCKER_HOST=tcp://172.17.42.1:4243
docker build -t rankomatic/${imageName} ${dockerDir}
""")
      }
    }
}
