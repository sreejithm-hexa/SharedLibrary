def call(String options = 'test') {
  //sh "mvn ${options}"
  sh "/opt/apache-maven-3.6.3/bin/mvn ${options}"
}
//-f /var/lib/jenkins/workspace/PetClinic