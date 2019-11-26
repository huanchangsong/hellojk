pipeline {
    agent {
        docker {
            image 'maven:3-alpine'
            args '-v /root/.m2:/root/.m2'
        }
    }
    stages {
        stage('Build') {
            steps {
                sh 'mvn -B -DskipTests clean package'
            }
        }

        stage('Deploy') {
            steps {
                //sh 'chmod 754 ./scripts/deliver.sh'                
                //sh './scripts/deliver.sh'
                sh 'java -jar target/hellojk-0.0.1-SNAPSHOT.jar &'
            }
        }
    }
}
