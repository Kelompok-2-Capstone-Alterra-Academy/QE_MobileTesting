#Feature: Send Assignment
#
#  Scenario: User can submit assignment
#    Given I am already logged at the application
#    When I clicked courses button on the bottom
#    And I clicked either courses
#    And I clicked assignment section in the courses
#    And I clicked submit assignment button
#    And I clicked select files button
#    And I clicked select access allow
#    And I select "file" assignment
#    And I fill "note" field
#    And I clicked submit button
#    Then I clicked back to home button
#
#  Scenario: User can submit assignment through current task list without fill notes
#    Given I am already logged at the application
#    When I clicked courses button on the bottom
#    And I clicked either courses
#    And I clicked assignment section in the courses
#    And I clicked submit assignment button
#    And I clicked select files button
#    And I clicked select access allow
#    And I select "file" assignment
#    And I clicked submit button
#    Then I clicked back to home button
#
#  Scenario: User submit assignment with through current task list with invalid file format
#    Given I am already logged at the application
#    When I clicked courses button on the bottom
#    And I clicked either courses
#    And I clicked assignment section in the courses
#    And I clicked submit assignment button
#    And I clicked select files button
#    And I clicked select access allow
#    And I select "fileInvalidFormat" assignment
#    And I fill "note" field
#    Then I clicked submit button
#
#  Scenario: User submit assignment with through current task list without upload assignment file
#    Given I am already logged at the application
#    When I clicked courses button on the bottom
#    And I clicked either courses
#    And I clicked assignment section in the courses
#    And I clicked submit assignment button
#    And I fill "note" field
#    Then I clicked submit button
#
#  Scenario: User submit assignment with through current task list without upload assignment file and notes
#    Given I am already logged at the application
#    When I clicked courses button on the bottom
#    And I clicked either courses
#    And I clicked assignment section in the courses
#    And I clicked submit assignment button
#    Then I clicked submit button