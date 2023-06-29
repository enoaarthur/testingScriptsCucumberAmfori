
@SmokeFeature
Feature: feature to test login functionality

  
  Scenario Outline: Check login is successful with valid credentials
  
    Given a browser is open
    And user is on login page "https://platform.tst.amfori.org/ui/"
    When user enters username as "<username>" and password as "<password>"
    And clicks on login button
    And clicks on user button to logout
    And user clicks on logout button
    Then user is navigated to the homepage
    
    
    Examples: 
      | username                         | password     |# Role
      | nadine.sustainabilityadmin       | nAdInE01234! |#Sustainability Admin
      | marc.memberadmin                 | mArc0123456! |#Member admin
      | arnaud.membershipsupport         | Password!123 |#Membershipsupport
      | erika.sustainabilitysupport      | Password!123 |#Sustainability Support
      | julliette.communicationsupport   | Password!123 |#Communicationsupport
      | dominique.capacitybuildingsupport| Password!123 |#Capacitybuildingsupport
      | kevin.helpdesksupport            | Password!123 |#HelpdeskSupport
      | fabian.legacymigrator            | Password!123 |#LegecyMigrator
      | christian.sustainabilityviewer   | Password!123 |#SustainabilityViewer
      | stephanie.zerotoleranceofficer   | Password!123 |#ZeroToleranceOfficer
      | doris.schememanager              | dOrIs012345! |#SchemeManager
      | ruud.krol                        | Password123! |#QualifiedMonitoringPerson
      | maarten.monitoringreviewer       | Password!123 |#MonitoringReviewer
      | ben.member                       | bEn01234567! |#Member
      | richard.memberbuyer              | Password!123 |#MemberBuyer
      | jenny@inno-essentials.cn         | Password123! |#BusinessPartner

    

  #Scenario Outline: Check login is successful with valid credentials
   # Given user is on login page
    #When user enters <username> and <password>
    #And clicks on login button
    #Then user is navigated to the homepage

    #Examples: 
     # | username                     | password     |
      #| nadine.sustainabilityadmin   | nAdInE01234! |
      #| monika.praetorius@galeria.de | Password123! |
