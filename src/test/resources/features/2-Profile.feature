Feature: Profile

  Scenario: Check functionality of profile button in the top right corner
    Given I am already login on to the application
    When I will be redirected to the homepage
    Then I click on the profile button in the "top" right corner

  Scenario: Check functionality of profile button in the bottom right corner
    Given I am already login on to the application
    When I will be redirected to the homepage
    Then I click on the profile button in the "bottom" right corner

  Scenario: User change full name
    Given I am already login on to the application
    When I clicked the profile button in the top right corner
    And I click edit profile button
    And I change a "full name" field
    Then I click save change button

  Scenario: User change full name with empty
    Given I am already login on to the application
    When I clicked the profile button in the top right corner
    And I click edit profile button
    And I change a "empty" field
    Then I click save change button

  Scenario: User fill birth of date
    Given I am already login on to the application
    When I clicked the profile button in the top right corner
    And I click edit profile button
    And I fill on "birth of date" field
    Then I click save change button

  Scenario: User fill hometown
    Given I am already login on to the application
    When I clicked the profile button in the top right corner
    And I click edit profile button
    And I fill a "hometown" field
    Then I click save change button

  Scenario: User fill hometown with length < 6
    Given I am already login on to the application
    When I clicked the profile button in the top right corner
    And I click edit profile button
    And I fill a "hometown field with length < 6" field
    Then I click save change button

  Scenario: User change telephone number
    Given I am already login on to the application
    When I clicked the profile button in the top right corner
    And I click edit profile button
    And I change "telephone number" field
    Then I click save change button

  Scenario: User change telephone number with length < 10
    Given I am already login on to the application
    When I clicked the profile button in the top right corner
    And I click edit profile button
    And I change "telephone number with length < 10" field
    Then I click save change button

  Scenario: User change telephone number with empty
    Given I am already login on to the application
    When I clicked the profile button in the top right corner
    And I click edit profile button
    And I change "empty" field
    Then I click save change button

  Scenario: Users fill gender
    Given I am already login on to the application
    When I clicked the profile button in the top right corner
    And I click edit profile button
    And I select "gender" field
    Then I click save change button

  Scenario: User fill school name
    Given I am already login on to the application
    When I clicked the profile button in the top right corner
    And I click edit profile button
    And I fill the "school name" field
    Then I click save change button

  Scenario: User fill class level
    Given I am already login on to the application
    When I clicked the profile button in the top right corner
    And I click edit profile button
    And I fill in "class level" field
    Then I click save change button

  Scenario: User fill class level using text
    Given I am already login on to the application
    When I clicked the profile button in the top right corner
    And I click edit profile button
    And I fill in "class level with text" field
    Then I click save change button

  Scenario: User fill major
    Given I am already login on to the application
    When I clicked the profile button in the top right corner
    And I click edit profile button
    And I fill one "major" field
    Then I click save change button

  Scenario: User change photo profile
    Given I am already login on to the application
    When I clicked the profile button in the top right corner
    And I click edit profile button
    And I change profile
    And I click save change button
    Then I clicked the accout button