@SmokeFeature
Feature: feature to test monitoring request

  @SmokeTest
  Scenario Outline: Check monitoring request is successful by Member
  
    Given a browser is open
    And member is on login page
    When member enters username as "<username>" and password as "<password>"
    And clicks on login button
    When member is logged in 
    And member clicks on Bounded Context Monitoring
    And member clicks on button Request Monitoring
    And member selects the Business Partner he wants to audit and Member clicks on Next Step
    And Member selects the site and clicks next
    And Member selects the initiative, the activity, the announcement type, the time window and clicks on Next Step twice
    And Member selects the Monitoring Party and clicks on Request
    Then the message "The monitoring is requested" should be displayed
    
    Examples: 
      | username        | password     |# Role
      | marc.memberadmin| mArc0123456! |#Member admin
    