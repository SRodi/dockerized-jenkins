import jenkins.model.JenkinsLocationConfiguration
import java.lang.*;
// Get environment variables.
def url = System.getenv("JENKINS_ROOT_URL")
// Change location configuration Jenkins URL.
// This will override settings changed via Jenkins UI.
jlc = JenkinsLocationConfiguration.get()
jlc.setUrl(url)
jlc.save()
