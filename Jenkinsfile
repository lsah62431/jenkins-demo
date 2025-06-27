pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo '🔧 بناء الكود'
                sh 'javac Main.java'
            }
        }

        stage('Test') {
            steps {
                echo '🧪 اختبار الكود'
                sh 'javac MainTest.java'
                sh 'java MainTest'
            }
        }

        stage('Deploy to AWS') {
            steps {
                echo '🚀 نشر إلى سيرفر AWS'
                sh '''
                    scp -o StrictHostKeyChecking=no -i /var/jenkins_home/.ssh/jenkins.pem Main.jar ubuntu@ec2-18-197-11-40.eu-central-1.compute.amazonaws.com:/home/ubuntu/deployments/
                '''
            }
        }
    }
}
