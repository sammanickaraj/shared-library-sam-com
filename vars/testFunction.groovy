def call(Map<String, String> config = [:] ) {
    stage('Configuration Setup') {
        echo "Hello Configuration setup"
        if (config.name == 'sam') {
           node {
               label 'labelname'
               checkout scm
           } 
           
        }
        else {
            echo "name did not match"
        }
    }
    stage('Random Stage') {
        echo "Random Stage"
    }
}

// def collectSourceCode() {
//         node(any) {
            
//         }
// }
