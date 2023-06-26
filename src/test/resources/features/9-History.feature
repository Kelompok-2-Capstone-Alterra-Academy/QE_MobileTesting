Feature: History

  Scenario: User view history transaction with complete take course
    Given I am already login at the application
    When I clicked "transaction button" on bottom
    Then I clicked either of "e-receipt" courses

  Scenario: User view history transaction through account button in the bottom
    Given I am already login at the application
    When I clicked "account button" on bottom
    And I clicked "my transaction" button
    Then I clicked either of "e-receipt" courses

  Scenario: User view history transaction through profile button in the top right corner
    Given I am already login at the application
    When I clicked profile button in the top right corner
    And I clicked "my transaction" button
    Then I clicked either of "e-receipt" courses