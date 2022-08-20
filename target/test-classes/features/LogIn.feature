Feature: LogIn To HRM


  Scenario: Login with valid credetial
    Given user is on home page
    When user enter "Admin" as username
    And user enter "admin123" as password
    And user click button LogIn
    Then user should ba able to login

