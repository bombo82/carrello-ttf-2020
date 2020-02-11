node{
  env.DOCKER_HOME = "${tool 'docker'}"
  env.PATH="${env.DOCKER_HOME}/bin:${env.PATH}"


  stage ('Checkout') {
    checkout scm
  }

  stage ('Build') {
    withMaven(maven: 'maven-3'){

      // Run the maven build
      sh "mvn clean package"

    }
  }

  stage ('Delivery') {
    tool 'docker'
    sh "docker -H tcp://192.168.50.95:2375 image build -t carrello-ttf:${env.BUILD_ID} ."
  }
}
