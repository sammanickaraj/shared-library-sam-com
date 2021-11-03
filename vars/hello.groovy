def hello() {
node {
        stage('Configuration Setup') {
            echo "Configuration setup"
        }
        stage('Testing Setup') {
            echo "Testing Setup"
        }
        stage('SonarQube scan') {
            echo "SonarQube Scan in progress"
            echo "SonarQube scan"
        }
        stage('Copy Image') {
            echo "Copy Image"
            sh "mkdir /tmp/test_unique"
        }
         stage('Stage Image') {
            echo "Staging image"
        }
    }
}