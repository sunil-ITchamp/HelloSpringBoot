pipeline {
    agent any
    
	triggers{
		pollSCM 'H/2 * * * *'
	}
    
	stages {
        stage('Build') {
            steps {
                echo "Building..pipeline script from GIT"
                echo "doing build stuff.."
            }
        }
        stage('Test') {
            steps {
                echo "Testing.."
                echo "doing test stuff..pipeline script from GIT"
            }
        }
        stage('Deliver') {
            steps {
                echo 'Deliver....'
                echo "doing delivery stuff..pipeline script from GIT"
            }
        }
    }
}