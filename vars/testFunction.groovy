def call(Map<String, String> config = [:] ) {
    stage('Configuration Setup') {
        echo "Hello Configuration setup"
        if (config.name == 'sam') {
           node('built-in') {
               checkout scm
               stash includes: '*', name: 'codebase'
               def versionpom=readMavenPom(file: 'pom.xml').version
               echo "${versionpom}"
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
    node('agent1') {
        unstash 'codebase'
        sh "mvn clean install"
    } 
        
    }
}