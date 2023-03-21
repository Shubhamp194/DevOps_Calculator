pipeline {
    environment{
        imageName = ""
    }
    agent any

    stages {
        stage('Git pull') {
            steps {
                git branch: 'main', url: 'https://github.com/Shubhamp194/DevOps_Calculator'
            }
        }
        stage('Maven Build') {
            steps {
                sh 'mvn clean install'
            }
        }
        stage('Docker build to images') {
            steps {
                script{
                    imageName = docker.build "shubhamp194/devops-calculator:latest"
                }
            }
        }
        stage('Login to dockerhub and push image') {
            steps {
                script{
                    docker.withRegistry('', 'docker-jenkins'){
                        imageName.push()
                    }
                }
                sh "docker rmi shubhamp194/devops-calculator:latest"                
            }
        }
        stage('Ansible pull docker image') {
            steps {
                ansiblePlaybook colorized: true, credentialsId: 'shubham', disableHostKeyChecking: true, installation: 'Ansible', inventory: 'inventory', playbook: 'deploy-playbook.yml'
            }
        }
    }
}
