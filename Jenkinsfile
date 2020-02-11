node{
  stage ('Checkout') {
    scm checkout
  }

  stage ('Build') {
    withMaven(maven: 'maven-3'){

      // Run the maven build
      sh "mvn clean package"

    }
  }
}
