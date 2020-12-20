@tag
Feature: verify logged user same or not

  Scenario Outline: 
    Given I want to naviagte facebook "https://facebook.com"
    When I  enter <username> and <password>
      | username               | password   |
      | shaikfaruk31@gmail.com | helloshaik |
      |sgai										|123					|
    And click on Login button
    Then I  verify the homepage
