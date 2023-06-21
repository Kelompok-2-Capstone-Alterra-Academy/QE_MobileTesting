#Feature: Profile
#
#  Scenario: Check functionality of profile button in the top right corner
#    Given I am already login on to the application
#    When I will be redirected to the homepage
#    Then I click on the profile button in the "top" right corner
#
#  Scenario: Check functionality of profile button in the bottom right corner
#    Given I am already login on to the application
#    When I will be redirected to the homepage
#    Then I click on the profile button in the "bottom" right corner
#
#  Scenario: User can change full name
#    Given I already logged in application
#    When I clicked the profile button in the top right corner
#    And I click edit profile button
#    Then I change a "full name" field
#
#  Scenario: User change full name with unicode characters emoji
#    Given I already logged in application
#    When I clicked the profile button in the top right corner
#    And I click edit profile button
#    Then I change a "full name with unicode characters emoji" field
#
#  Scenario: User fill birth of date
#    Given I already logged in application
#    When I clicked the profile button in the top right corner
#    And I click edit profile button
#    Then I fill on "birth of date" field
#
#  Scenario: User fill hometown
#    Given I already logged in application
#    When I clicked the profile button in the top right corner
#    And I click edit profile button
#    Then I fill a "hometown" field
#
#  Scenario: User fill hometown with using unconventional characters
#    Given I already logged in application
#    When I clicked the profile button in the top right corner
#    And I click edit profile button
#    Then I fill a "hometown field with unconventional characters" field
#
#  Scenario: User change telephone number
#    Given I already logged in application
#    When I clicked the profile button in the top right corner
#    And I click edit profile button
#    Then I change "telephone number" field
#
#  Scenario: User change telephone number with using parentheses
#    Given I already logged in application
#    When I clicked the profile button in the top right corner
#    And I click edit profile button
#    Then I change "telephone number with using parentheses" field
#
#  Scenario: User select gender
#    Given I already logged in application
#    When I clicked the profile button in the top right corner
#    And I click edit profile button
#    Then I select "gender" field
#
#  Scenario: User fill school name
#    Given I already logged in application
#    When I clicked the profile button in the top right corner
#    And I click edit profile button
#    Then I fill the "school name" field
#
#  Scenario: User fill school name with using unconventional characters
#    Given I already logged in application
#    When I clicked the profile button in the top right corner
#    And I click edit profile button
#    Then I fill the "school name with unconventional characters" field
#
#  Scenario: User fill class level
#    Given I already logged in application
#    When I clicked the profile button in the top right corner
#    And I click edit profile button
#    Then I fill in "class level" field
#
#  Scenario: User fill class level with text
#    Given I already logged in application
#    When I clicked the profile button in the top right corner
#    And I click edit profile button
#    Then I fill in "class level with text" field
#
#  Scenario: User fill major
#    Given I already logged in application
#    When I clicked the profile button in the top right corner
#    And I click edit profile button
#    Then I fill one "major" field
#
#  Scenario: User save change
#    Given I already logged in application
#    When I clicked the profile button in the top right corner
#    And I click edit profile button
#    And I change a "full name" field
#    And I fill on "birth of date" field
#    And I fill a "hometown" field
#    And I change "telephone number" field
#    And I select "gender" field
#    And I fill the "school name" field
#    And I fill in "class level" field
#    And I fill one "major" field
#    Then I click save change button
#
#  Scenario: User save changes with invalid input to any placeholder
#    Given I already logged in application
#    When I clicked the profile button in the top right corner
#    And I click edit profile button
#    And I clear all fields
#    Then I click save change button
