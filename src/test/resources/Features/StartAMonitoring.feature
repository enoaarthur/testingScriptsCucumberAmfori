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
    And Auditor clicks on button Request Monitoring
    And Auditor selects the Business Partner he wants to audit and Member clicks on Next Step
    And Auditor selects the site and clicks next
    And Auditor selects the initiative, the activity, the announcement type, the time window and clicks on Next Step twice
    And auditor selects the Monitoring Party and clicks on Request
    Then the message "The monitoring is requested" should be displayed
    
    Examples: 
      | username        | password             |# Role
      | RK@self.be      | QT5vNXe6qWxF@$Y6RvM5 |# Auditor
    