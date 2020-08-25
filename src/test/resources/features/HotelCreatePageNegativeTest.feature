@HotelCreateNegative

Feature: Login feature

  Scenario: TC01_user dont create with empty or invalid credentials in Code textbox
    Given user is on the fhctripcreatehotel page
    And user logins with valid data
    And user enters valid data all text box except code
    And user clicks save button
    Then verify didn't creating hotel wtihout code

  Scenario: TC01_user dont create with empty or invalid credentials in Name textbox
    Given user is on the fhctripcreatehotel page
    And user logins with valid data
    And user enters  valid data all text box except name
    And user clicks save button
    Then verify didn't creating hotel  wtihout name

  Scenario: TC01_user dont create with empty or invalid credentials in Address textbox
    Given user is on the fhctripcreatehotel page
    And user logins with valid data
    And user enters  valid data all text box except address
    And user clicks save button
    Then verify didn't creating hotel  wtihout address

  Scenario: TC01_user dont create with empty or invalid credentials in Phone textbox
    Given user is on the fhctripcreatehotel page
    And user logins with valid data
    And user enters  valid data all text box except phone
    And user clicks save button
    Then verify didn't creating hotel  wtihout phone

  Scenario: TC01_user dont create with empty or invalid credentials in Email textbox
    Given user is on the fhctripcreatehotel page
    And user logins with valid data
    And user enters  valid data all text box except email
    And user clicks save button
    Then verify didn't creating hotel  wtihout email

