#Author: arthur.enoa@amfori.org
#Keywords Summary :This script will be run to start an audit

@SmokeFeature
Feature: feature to start a monitoring 

  @SmokeTest
  Scenario Outline: Check if a monitoring is successful submitted by the auditor
  
    Given a browser is open
    And auditor is on login page
    When auditor enters username as "<username>" and password as "<password>"
    And clicks on login button
    When auditor is logged in 
    And auditor clicks on Bounded Context Monitoring
    Then the auditor searh the audit to start by "<monitoringID>" 
    And Open the Monitoring to start
    
    Examples: 
      | username        | password             | monitoringID |# Role
      | RK@self.be      | QT5vNXe6qWxF@$Y6RvM5 | 22-0007076   |# Auditor
    