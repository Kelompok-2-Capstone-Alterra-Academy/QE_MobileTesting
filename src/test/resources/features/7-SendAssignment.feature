#Feature: Send Assignment
#
#  Scenario: User submit assignment
#    Given I am already logged at the application
#    When I clicked courses button on the bottom
#    And I clicked either courses
#    And I clicked assignment section in the courses
#    And I clicked collect assignment button
#    And I clicked select files button
#    And I clicked select access allow
#    And I select "file" assignment
#    And I fill "note" field
#    And I clicked submit button
#    Then I clicked back to my course button
#
#  Scenario: User submit assignment without fill notes
#    Given I am already logged at the application
#    When I clicked courses button on the bottom
#    And I clicked either courses
#    And I clicked assignment section in the courses
#    And I clicked collect assignment button
#    And I clicked select files button
#    And I clicked select access allow
#    And I select "file" assignment
#    And I clicked submit button
#    Then I clicked back to my course button
#
#  Scenario: User submit assignment without upload file
#    Given I am already logged at the application
#    When I clicked courses button on the bottom
#    And I clicked either courses
#    And I clicked assignment section in the courses
#    And I clicked collect assignment button
#    And I fill "note" field
#    Then I clicked submit button
#
#  Scenario: User submit assignment without upload file and fill notes
#    Given I am already logged at the application
#    When I clicked courses button on the bottom
#    And I clicked either courses
#    And I clicked assignment section in the courses
#    And I clicked collect assignment button
#    Then I clicked submit button