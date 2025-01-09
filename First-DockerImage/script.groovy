def buildImage(String imageName){
    echo "Building Image.."
        sh "docker build -t $imageName ./First-DockerImage/"
}

def pushImage(String imageName){
    echo "Pushing Image to DockerHub..."
    withCredentials([usernamePassword(credentialsId: 'dockerhub-credentials', usernameVariable: 'USERNAME', passwordVariable: 'PASSWORD')]){
        sh "echo $PASSWORD | docker login -u $USERNAME --password-stdin"
        sh "docker push $imageName"
    }
}
   
   
return this