#Feature: Quiz
#
#  Scenario: User can access quiz
#    Given I am already login to application
#    When I clicked the courses button in the bottom
#    And I clicked either of the courses
#    And I clicked quiz button
#    And I clicked quiz
#    And I "answers" question multiple choice in the gform
#    And I "submit" answers the gform
#    And I "view" score quiz
#    And I clicked finish button
#    Then I clicked next quiz button
#
#  Scenario: User cannot access quiz without completing
#    Given I am already login to application
#    When I clicked the courses button in the bottom
#    And I clicked either of the courses
#    And I clicked quiz button
#    And I clicked quiz
#    And I clicked finish button
#    Then I clicked next quiz button