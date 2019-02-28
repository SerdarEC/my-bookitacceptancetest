@smoke
Feature: login functionality

  @teacher
  Scenario: teacher login
    Given user on the login page
    When user logs in using "myemail@gmail.com" and "mysecurepassword"
    #Then homepage should be displayed
    And title should be "homepage"
    And there should be 41 menu options

  Scenario: team leader login
    Given user on the login page
    When user logs in using "myemail@gmail.com" and "regularpassword"
    #Then homepage should be displayed
    And title should be "homepage-team lead"
    And there should be 33 menu options
