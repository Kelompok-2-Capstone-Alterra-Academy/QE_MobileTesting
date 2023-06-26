Feature: Live Session

  Scenario: User join live session in the course
    Given I am already login in the application
    When I clicked on the courses button in the bottom
    And I clicked either of courses
    And I clicked live session button
    And I clicked "joined not yet" button
    And I clicked "joined not yet class meeting" schedule
    Then I click join meeting button

  Scenario: User join live session in the courses that has already followed
    Given I am already login in the application
    When I clicked on the courses button in the bottom
    And I clicked either of courses
    And I clicked live session button
    And I clicked "joined already" button
    And I clicked "joined already class meeting" schedule
    Then Unable to join live session in course