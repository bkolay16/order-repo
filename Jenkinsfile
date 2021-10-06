pipeline {
    agent any

    stages {
		stage ("build") {
        	steps {
        	echo 'Executing gradle'
        	withGradle(){
        	gradlew.bat clean build
        	}

            }
        }
    }
}