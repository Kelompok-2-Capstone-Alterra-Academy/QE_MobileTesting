Feature: Take Courses

  Scenario: User take course without choosing class
    Given I already logged on application
    When I click see all on the popular courses
    And I click choose class and major
    And I choose "class" only
    And I click save button
    And I click either of courses
    And I click take courses button
    And I click checkout button
    And I select payment method
    And I click pay now button
    And I fill pin
    And I submit button in the payment
    Then I view history transaction "success"

  Scenario: User take course without choosing major
    Given I already logged on application
    When I click see all on the popular courses
    And I click choose class and major
    And I choose "major" only
    And I click save button
    And I click either of courses
    And I click take courses button
    And I click checkout button
    And I select payment method
    And I click pay now button
    And I fill pin
    And I submit button in the payment
    Then I view history transaction "success"

  Scenario: User take course with promo
    Given I already logged on application
    When I click see all on the popular courses
    And I click choose class and major
    And I choose class
    And I choose major
    And I click save button
    And I click claim promo button
    And I "click" all promo
    And I click either of courses
    And I click take courses button
    And I click use promo button
    And I "choose" promo
    And I click checkout button
    And I select payment method
    And I click pay now button
    And I fill pin
    And I submit button in the payment
    Then I view history transaction "success"

  Scenario: User take course without promo
    Given I already logged on application
    When I click see all on the popular courses
    And I click choose class and major
    And I choose class
    And I choose major
    And I click save button
    And I click either of courses
    And I click take courses button
    And I click checkout button
    And I select payment method
    And I click pay now button
    And I fill pin
    And I submit button in the payment
    Then I view history transaction "success"

  Scenario: User take course without choosing class and major
    Given I already logged on application
    When I click see all on the popular courses
    And I click either of courses
    And I click take courses button
    And I click checkout button
    And I select payment method
    And I click pay now button
    And I fill pin
    And I submit button in the payment
    Then I view history transaction "success"

  Scenario: User take courses without choosing class and major and use promo
    Given I already logged on application
    When I click see all on the popular courses
    And I click claim promo button
    And I "click" all promo
    And I click either of courses
    And I click take courses button
    And I click use promo button
    And I "choose" promo
    And I click checkout button
    And I select payment method
    And I click pay now button
    And I fill pin
    And I submit button in the payment
    Then I view history transaction "success"

  Scenario: User take course without choosing payment method
    Given I already logged on application
    When I click see all on the popular courses
    And I click choose class and major
    And I choose class
    And I choose major
    And I click save button
    And I click either of courses
    And I click take courses button
    And I click checkout button
    And I click back without choosing payment
    Then I view history transaction "pending"