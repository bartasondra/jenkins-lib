// vars/evenOrOdd.groovy
def call(int buildNumber, name) {
  if (buildNumber % 2 == 0) {
    pipeline {
      agent any
      stages {
        stage("Even $name Stage") {
          steps {
            echo "The build number is even"
          }
        }
      }
    }
  } else {
    pipeline {
      agent any
      stages {
        stage("Odd $name Stage") {
          steps {
            echo "The build number is odd"
          }
        }
      }
    }
  }
}