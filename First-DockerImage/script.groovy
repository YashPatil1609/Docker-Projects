def buildImage(){
    echo "Building Image.."
    sh "docker build -t yashpatil16/firstimage:1.0 ."
   
}

def pushImage(){
    withCredentials([usernamePassword(credentialsId: 'dockerhub-credentials', usernameVariable: 'USERNAME', passwordVariable: 'PASSWORD')]){
        sh "echo $PASSWORD | docker login -u $USERNAME -password-stdin"
        sh "docker push yashpatil16/firstimage:1.0"
    }
}
return this
