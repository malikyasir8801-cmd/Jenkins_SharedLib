def call(){
  dependencyCheck(
    additionalArguments: '''
      --scan ./
      --data /var/lib/jenkins/.dependency-check
      --format XML
    ''',
    odcInstallation: 'OWASP'
  )

  dependencyCheckPublisher pattern: '**/dependency-check-report.xml'
}
