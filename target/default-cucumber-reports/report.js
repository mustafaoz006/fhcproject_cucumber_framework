$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/HotelCreatePageNegativeTest.feature");
formatter.feature({
  "name": "Login feature",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@HotelCreateNegative"
    }
  ]
});
formatter.scenario({
  "name": "TC01_user dont create with empty or invalid credentials in Code textbox",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@HotelCreateNegative"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on the fhctripcreatehotel page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.HotelCreateStepdefs.userIsOnTheFhctripcreatehotelPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user logins with valid data",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.HotelCreateStepdefs.userLoginsWithValidData()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters  valid data all text box",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.HotelCreateStepdefs.userEntersValidDataAllTextBox()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks save button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.HotelCreateStepdefs.userClicksSaveButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify didn\u0027t creating hotel",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.HotelCreateStepdefs.verifyDidnTCreatingHotel()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});