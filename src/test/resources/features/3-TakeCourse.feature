#Feature: Take Courses
#
#  Scenario: User can take courses with promo
#    Given I already logged on application
#    When I click see all on the popular courses
#    And I click choose class and major
#    And I choose class
#    And I choose major
#    And I click save button
#    And I click claim promo button
#    And I "click" all promo
#    And I click either of courses
#    And I click take courses button
#    And I click use promo button
#    And I "choose" promo
#    And I click checkout button
#    And I select payment method
#    And I click pay now button
#    And I fill pin
#    And I submit button
#    Then I payment success
#
#  Scenario: User can take courses without promo
#    Given I already logged on application
#    When I click see all on the popular courses
#    And I click choose class and major
#    And I choose class
#    And I choose major
#    And I click save button
#    And I click either of courses
#    And I click take courses button
#    And I click checkout button
#    And I select payment method
#    And I click pay now button
#    And I fill pin
#    And I submit button
#    Then I payment success
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
