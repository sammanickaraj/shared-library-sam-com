def call(Map<String, String> config = [:] ) {
    stage('Configuration Setup') {
        echo "Hello Configuration setup"
        if (config.name == 'sam') {
           node {
               label 'labelname'
               checkout([$class: 'GitSCM', branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/sammanickaraj/helloworld.git']]])
           } 
           
        }
        else {
            echo "name did not match"
        }
    }
    stage('Random Stage') {
        echo "Random Stage"
    }
    stage('Build') {
        sh "mvn clean install"
    }
}

// def collectSourceCode() {
//         node(any) {
            
//         }
// }
