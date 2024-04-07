pipeline {
    agent any
    
    stages {
        stage('Build') {
            steps {
                echo "Building.."
                echo "doing build stuff.."
            }
        }
        stage('Test') {
            steps {
                echo "Testing.."
                sh '''
                echo "doing test stuff.."
                '''
            }
        }
        stage('Deliver') {
            steps {
                echo 'Deliver....'
                echo "doing delivery stuff.."
            }
        }
    }
}