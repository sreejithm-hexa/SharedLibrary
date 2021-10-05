package com.app
class MavenUtil implements Serializable {
  def steps
  MavenUtil(steps) {this.steps = steps}
  def mvn(args) {
    steps.sh "/opt/apache-maven-3.6.3/bin/mvn -o ${args}"
  }
}
