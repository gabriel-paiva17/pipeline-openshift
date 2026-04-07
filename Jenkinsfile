node('maven') {
    stage 'Checkout'
    checkout scm

    stage 'Build'
    sh 'cd helloworld && mvn clean'
    sh 'cd helloworld && mvn compile'

    stage 'Run Unit Tests'
    sh 'cd helloworld && mvn test'

    stage 'Package'
    sh 'cd helloworld && mvn package'

    stage 'Archive artifact'
    sh 'mkdir -p artifacts/deployments && cp helloworld/target/*.war artifacts/deployments'
    archive 'helloworld/target/*.war'

    stage 'Create Image'
    sh 'oc login https://kubernetes.default -u admin -p admin --insecure-skip-tls-verify=true'
    sh 'oc new-project helloworldproject'
    sh 'oc project helloworldproject'
    sh 'oc process -f helloworld/jboss-eap70-binary-build.json | oc create -f -'
    sh 'oc start-build eap-helloworld-app --from-dir=artifacts/'

    stage 'Deploy'
    sh 'oc new-app helloworld/jboss-eap70-deploy.json' }
