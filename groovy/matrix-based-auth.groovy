import jenkins.model.*
import hudson.security.*
import java.lang.*;

def jenkins = Jenkins.getInstance()
// Get environment variables.
def jenkins_user = System.getenv("JENKINS_USER")
def jenkins_pass = System.getenv("JENKINS_PASS")

// Set security realm if not set.
if (!(jenkins.getSecurityRealm() instanceof HudsonPrivateSecurityRealm)) {
  jenkins.setSecurityRealm(new HudsonPrivateSecurityRealm(false))
}
// Set auth strategy if not set.
if (!(jenkins.getAuthorizationStrategy() instanceof GlobalMatrixAuthorizationStrategy)) {
  jenkins.setAuthorizationStrategy(new GlobalMatrixAuthorizationStrategy())
}

// Create default admin user if not exists.
def currentUsers = jenkins.getSecurityRealm().getAllUsers().collect { it.getId() }
if (!(jenkins_user in currentUsers)) {
  def user = jenkins.getSecurityRealm().createAccount(jenkins_user, jenkins_pass)
  user.save()
  // Set Administer permissions.
  jenkins.getAuthorizationStrategy().add(Jenkins.ADMINISTER, jenkins_user)
}

jenkins.save()