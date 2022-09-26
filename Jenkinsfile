pipeline{
    agent any
    tools{
        maven "maven"
    }
    stages{
        stage("Build Maven Project"){
            steps{
                checkout([$class: 'GitSCM', branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[credentialsId: 'Github_credentials', url: 'https://github.com/saikumarjd/demoCICD']]])
                bat 'mvn clean install'
            }
        }
        stage("Build docker image "){
            steps{
                script{
                    bat 'docker build -t sai96266/democicd .'
                }
            }
        }
        stage("pushing docker image to docker hub"){
            steps{
                script{
                    // withCredentials([string(credentialsId: 'docker.pwd', variable: 'docker.pwd')]) {
                    //   bat ' echo ${docker.pwd} | docker login -u sai96266 --password-stdin'
                    // }
                    bat 'docker login -u sai96266 -p Tsunami9@'
                    bat 'docker push sai96266/democicd'
                }
            }
        }
    }
}