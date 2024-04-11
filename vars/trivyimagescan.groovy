def call() {
    sh 'trivy image devopsraju6/youtube:latest > trivyimage.txt'
}