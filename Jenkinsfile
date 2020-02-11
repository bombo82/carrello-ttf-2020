node{
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
    docker.build("carrello-ttf:${env.BUILD_ID}")
  }
}
