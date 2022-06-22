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
    Then the message "The monitoring is requested" should be displayed
    
    Examples: 
      | username        | password             |# Role
      | RK@self.be      | QT5vNXe6qWxF@$Y6RvM5 |# Auditor
    