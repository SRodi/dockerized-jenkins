import jenkins.model.*
import hudson.security.*

def instance = Jenkins.getInstance()

def realm = new HudsonPrivateSecurityRealm(false)
instance.setSecurityRealm(realm)

def strategy = new hudson.security.GlobalMatrixAuthorizationStrategy()
strategy.add(Jenkins.ADMINISTER, 'authenticated')
instance.setAuthorizationStrategy(strategy)

instance.save()