# How to deploy nginx based application into Kubernetes via Jenkins Pipeline

Do this simple steps:

* Loggin into Jenkins Web App
* Go to Manage "Jenkins"->"Credentials"->"Jenkins"->"Global Credentials" click "Add Credential"
* Choose kind "Kubernetes configuration"
* Enter ID kubeconfig
* Pick radiobutton "Enter Directly" and paste content of kube config file which you can find by following these steps:
  * on Master node go to ~/.kube/ and cat file config
  * use copy printed result to the text area of the kubeconfig inside Jenkins Web form.
  * click OK
* Inside pipeline script use these script command inside Deploy stage `kubernetesDeploy(configs: "nginx.yaml", kubeconfigId: "kubeconfig")`
* Notice that kubeconfig must be the name you've assigned to the credential of Jenkins and nginx.yaml is the file within the root of your GitHub repository given inside Jenkins Pipeline script.
* Enjoy!
