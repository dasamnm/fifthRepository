
Feature: First Test

  Scenario: Valid Registration Form Information
    Given user name is "SAGAR"
    And user age is 66

  @smoke @sanity
  Scenario: 
    Then display username
    And user age
