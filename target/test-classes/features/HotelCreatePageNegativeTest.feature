@HotelCreateNegative

Feature: Login feature

  Scenario: TC01_user dont create with empty or invalid credentials in Code textbox
    Given user is on the fhctripcreatehotel page
    And user logins with valid data
    And user enters  valid data all text box
    And user clicks save button
    Then verify didn't creating hotel