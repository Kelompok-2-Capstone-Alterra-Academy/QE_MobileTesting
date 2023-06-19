#Feature: Take Courses
#
#  Scenario: User can take courses
#    Given I already logged on application
#    When I click see all on the popular courses
#    And I click choose class and major
#    And I choose class
#    And I choose major
#    And I click save button
#    And I click either of courses
#    And I click take courses button
#    And I click checkout button
#    Then Can view modul
#
#  Scenario: User take course without choosing major
#    Given I already logged on application
#    When I click see all on the popular courses
#    And I click choose class and major
#    And I choose "class" only
#    Then I click save button
#
#  Scenario: User take course without choosing class
#    Given I already logged on application
#    When I click see all on the popular courses
#    And I click choose class and major
#    And I choose "major" only
#    Then I click save button
#
#  Scenario: User take course without choosing class and major
#    Given I already logged on application
#    When I click see all on the popular courses
#    And I click choose class and major
#    Then I click save button
#
#  Scenario: User take course with promo
#
