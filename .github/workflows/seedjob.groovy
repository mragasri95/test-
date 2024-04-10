def helloWorldExample = {
    pipeline {
        agent any
        stages {
            stage('Say Hello') {
                steps {
                    script {
                        echo "Hello world!"
                    }
                }
            }
            stage('Do stuff') {
                steps {
                    script {
                        echo "welcome to the"
                        echo "world of"
                        echo "github actions migrate"
                    }
                }
            }
            stage('Say Goodbye') {
                steps {
                    script {
                        echo "Goodbye world!"
                    }
                }
            }
        }
    }
}

helloWorldExample()
