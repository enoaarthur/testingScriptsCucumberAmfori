@SmokeFeature
Feature: feature to add sites to a Member Company profile
   @SmokeTest
   Scenario: check if the sites are added successfully to the Member Profile
   Given a browser is open
    And member is on login page
    When member enters username as "<username>" and password as "<password>"
    And clicks on login button
    When member is logged in 
    And member clicks on Bounded Context Admin
    And member clicks on SubItem My Sites
    And member clicks on button Add Site
    And member enters the Legal Name "<legalName>", the "<Address>" and the "<City>"
    And Member selects the country and the Province
    And Member selects the Sector, the Industry Group, the Industry and the Sub Industry
    And Member clicks the the button Add Site
    Then the message "The site is added." should be displayed
    
    Examples: 
      | username        | password     | legalName                   | Address                             | City      | 
      | marc.memberadmin| mArc0123456! | Diogo F. C. Silva Unipessoal| Centro Comercial Venezuelano, loja 2| Silveiros |

