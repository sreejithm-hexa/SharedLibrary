package com.app
class MavenUtil implements Serializable {
  def steps
  MavenUtil(steps) {this.steps = steps}
  def mvn(args) {
    steps.sh "${steps.tool 'Maven_home'}/bin/mvn -o ${args}"
  }
}


// /opt/apache-maven-3.6.3
