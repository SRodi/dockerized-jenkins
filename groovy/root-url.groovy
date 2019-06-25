import jenkins.model.JenkinsLocationConfiguration
def url = build.getBuildVariables().get('JENKINS_ROOT_URL')
jlc = JenkinsLocationConfiguration.get()
jlc.setUrl(url) 
jlc.save()