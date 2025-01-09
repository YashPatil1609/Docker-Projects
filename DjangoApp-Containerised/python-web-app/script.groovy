def buildImage(String imageName){
    echo "BUILDING IMAGE..."
    sh "docker build -t $imageName ./DjangoApp-Containerised/python-web-app"
}

def pushImage(String imageName){
    echo "PUSHING THE BUILT IMAGE TO DOCKERHUB..."
    withCredentials([usernamePassword(credentialsId: 'dockerhub-credentials', usernameVariable: 'USER', passwordVariable: 'PASS')]){
        sh "echo $PASS | docker login -u $USER --password-stdin"
        sh "docker push $imageName" 
    }
}
return this