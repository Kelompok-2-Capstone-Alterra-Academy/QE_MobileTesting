Feature: Mentor

  Scenario: User view the best mentors
    Given I already login into application
    When I click see all the best mentor in the StarEdu
    Then I view list mentor in the StarEdu

  Scenario: Users contact mentor through button chat in the bottom
    Given I already login into application
    When I click "chat button" in the bottom
    And I click on "search mentor" to look up the mentor name
    Then I click icon whatsapp to contact mentor

 Scenario: Users contact mentors through either courses
   Given I already login into application
   When I click "courses button through courses" in the bottom
   And I click either at the courses
   And I click "ask mentor either courses" button
   And I click on "search mentor either courses" to look up the mentor name
   Then I click icon whatsapp to contact mentor

  Scenario: Users contact mentors through video courses
    Given I already login into application
    When I click "courses button through video" in the bottom
    And I click either at the courses
    And I click into "video section" courses
    And I click "ask mentor video course" button
    And I click on "search mentor video courses" to look up the mentor name
    Then I click icon whatsapp to contact mentor

  Scenario: Users contact mentors through material courses
    Given I already login into application
    When I click "courses button through material" in the bottom
    And I click either at the courses
    And I click into "material section" courses
    And I click "ask mentor material courses" button
    And I click on "search mentor material courses" to look up the mentor name
    Then I click icon whatsapp to contact mentor