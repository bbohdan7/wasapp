pipeline {

  agent any

  stages {
    
    stage('Checkout SCM') {
            steps {
                checkout([
                 $class: 'GitSCM',
                 branches: [[name: 'master']],
                 userRemoteConfigs: [[
                    url: 'https://github.com/zbogdan7/wasapp',
                    credentialsId: '',
                 ]]
                ])
            }
        }
    
    stage('Checkout Source') {
      steps {
        git 'https://github.com/zbogdan7/wasapp'
      }
    }


    stage('Deploy App') {
      steps {
        script {
          sh 'echo First Step'
        }
      }
    }

    stage('Test App') {
      steps {
        script {
            kubernetesDeploy(configs: "nginx.yaml", kubeconfigId: "kubeconfig")
        }
      }
    }

  }

}
