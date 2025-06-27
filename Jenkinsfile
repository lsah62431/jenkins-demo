pipeline {
    agent any

    stages {
        stage('تثبيت المتطلبات') {
            steps {
                sh 'pip3 install -r requirements.txt'
            }
        }

        stage('تحقق من الكود') {
            steps {
                echo 'تشغيل الكود بدون بناء'
                sh 'python3 main.py'
            }
        }

        stage('Build') {
            steps {
                echo 'تحويل سكربت بايثون إلى ملف تنفيذي'
                sh 'pyinstaller --onefile main.py'
            }
        }

        stage('Test') {
            steps {
                echo 'تشغيل اختبارات الوحدة'
                sh 'pytest test_main.py'
            }
        }

        stage('Deploy') {
            steps {
                echo 'نشر الملف التنفيذي إلى سيرفر AWS'
                sh '''
                scp -o StrictHostKeyChecking=no -i ~/.ssh/id_rsa dist/main ec2-user@your-aws-ip:/home/ec2-user/
                '''
            }
        }
    }
}
