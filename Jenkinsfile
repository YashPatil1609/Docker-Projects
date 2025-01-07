pipeline{
  agent any
  environment{
    NEW_VERSION = '1.0'
  }
  stages{
    stage("build"){
      when{
        expression{
          NEW_VERSION == '2.0'
        }
      }
      steps{
        echo "Building the application, Version : ${NEW_VERSION}"
      }
    }
    stage("test"){
      steps{
        echo "Testing the application, Version : ${NEW_VERSION}"
      }
    }
    stage("deploy"){
      steps{
        echo "Deploying the application, Version : ${NEW_VERSION}"
      }
    }
}
}
