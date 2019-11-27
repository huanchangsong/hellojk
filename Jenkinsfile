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

        stage('Deliver') {
            steps {
            
               //  chmod 754 ./scripts/deliver.sh              
                
               //  ./scripts/deliver.sh
              sh 'BUILD_ID=dontKillMe nohup java -jar target/hellojk-0.0.1-SNAPSHOT.jar &'
             
            }
        }
    }
}
