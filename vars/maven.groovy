   /* public static final String MVN = "mvn"
    public static final String SEPARATOR = " "
    public static final String CLEAN = "clean"
    public static final String PACKAGE = "package"
    public static final String TEST = "test"
    public static final String INSTALL = "install"
    public static final String DEPLOY = "deploy" */

    def call(String CLEAN, String INSTALL) {
         //def String MVN = "mvn"
         //def String SEPERATOR = " "
        // def String CLEAN = "clean"
        // def String INSTALL = "install"
      if("clean" == ${CLEAN})
        if ("install" ==${INSTALL})
          sh "/opt/apache-maven-3.6.3/bin/mvn ${CLEAN} ${INSTALL}"
        break
}

return "error"
//-f /var/lib/jenkins/workspace/PetClinic
//sh "mvn ${options}"
//sh "/opt/apache-maven-3.6.3/bin/mvn ${options}"
