package com
class MavenUtil implements Serializable {
  def steps
  MavenUtil(steps) {this.steps = steps}
  def mvn(args) {
    steps.sh "${steps.tool 'Maven'}/bin/mvn -o ${args}"
  }
}
