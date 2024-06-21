$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/FeatureFiles/facebook.feature");
formatter.feature({
  "name": "FaceBook",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@facebook"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Creat a facebook in facebook application",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User click on create new account",
  "keyword": "When "
});
formatter.step({
  "name": "User enters the value in First name \"\u003cFirstname\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User enters the value in surname \"\u003cSurname\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User enters the value in mobile number or email address \"\u003cMobileNo\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User enters a new Password \"\u003cPassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User selects a Date of birth \"\u003cDob\u003e\" \"\u003cM\u003e\" \"\u003cY\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User clicks on Gender \"\u003cGender\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User clicks on Sign up",
  "keyword": "And "
});
formatter.step({
  "name": "User TakeScreenShot",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Firstname",
        "Surname",
        "MobileNo",
        "Password",
        "Dob",
        "M",
        "Y",
        "Gender"
      ]
    },
    {
      "cells": [
        "Dinesh",
        "Kumar",
        "8888888888",
        "Dinesh@2",
        "7",
        "Sep",
        "2000",
        "Male"
      ]
    },
    {
      "cells": [
        "Kumar",
        "Dinesh",
        "9876543211",
        "Kumar@2",
        "8",
        "Sep",
        "1999",
        "Male"
      ]
    }
  ]
});
formatter.background({
  "name": "Application Launch",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "Launch the browser and appilication \"https://www.facebook.com\"",
  "keyword": "Given "
});
formatter.match({
  "location": "facebook.com.facebookLogin.launch_the_browser_and_appilication(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Creat a facebook in facebook application",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@facebook"
    }
  ]
});
formatter.step({
  "name": "User click on create new account",
  "keyword": "When "
});
formatter.match({
  "location": "facebook.com.facebookLogin.user_click_on_create_new_account()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters the value in First name \"Dinesh\"",
  "keyword": "When "
});
formatter.match({
  "location": "facebook.com.facebookLogin.user_enters_the_value_in_First_name(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters the value in surname \"Kumar\"",
  "keyword": "And "
});
formatter.match({
  "location": "facebook.com.facebookLogin.user_enters_the_value_in_surname(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters the value in mobile number or email address \"8888888888\"",
  "keyword": "And "
});
formatter.match({
  "location": "facebook.com.facebookLogin.user_enters_the_value_in_mobile_number_or_email_address(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters a new Password \"Dinesh@2\"",
  "keyword": "And "
});
formatter.match({
  "location": "facebook.com.facebookLogin.user_enters_a_new_Password(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User selects a Date of birth \"7\" \"Sep\" \"2000\"",
  "keyword": "And "
});
formatter.match({
  "location": "facebook.com.facebookLogin.user_selects_a_Date_of_birth(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on Gender \"Male\"",
  "keyword": "And "
});
formatter.match({
  "location": "facebook.com.facebookLogin.user_clicks_on_Gender(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on Sign up",
  "keyword": "And "
});
formatter.match({
  "location": "facebook.com.facebookLogin.user_clicks_on_Sign_up()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User TakeScreenShot",
  "keyword": "Then "
});
formatter.match({
  "location": "facebook.com.facebookLogin.user_TakeScreenShot()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "Application Launch",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "Launch the browser and appilication \"https://www.facebook.com\"",
  "keyword": "Given "
});
formatter.match({
  "location": "facebook.com.facebookLogin.launch_the_browser_and_appilication(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Creat a facebook in facebook application",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@facebook"
    }
  ]
});
formatter.step({
  "name": "User click on create new account",
  "keyword": "When "
});
formatter.match({
  "location": "facebook.com.facebookLogin.user_click_on_create_new_account()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters the value in First name \"Kumar\"",
  "keyword": "When "
});
formatter.match({
  "location": "facebook.com.facebookLogin.user_enters_the_value_in_First_name(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters the value in surname \"Dinesh\"",
  "keyword": "And "
});
formatter.match({
  "location": "facebook.com.facebookLogin.user_enters_the_value_in_surname(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters the value in mobile number or email address \"9876543211\"",
  "keyword": "And "
});
formatter.match({
  "location": "facebook.com.facebookLogin.user_enters_the_value_in_mobile_number_or_email_address(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters a new Password \"Kumar@2\"",
  "keyword": "And "
});
formatter.match({
  "location": "facebook.com.facebookLogin.user_enters_a_new_Password(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User selects a Date of birth \"8\" \"Sep\" \"1999\"",
  "keyword": "And "
});
formatter.match({
  "location": "facebook.com.facebookLogin.user_selects_a_Date_of_birth(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on Gender \"Male\"",
  "keyword": "And "
});
formatter.match({
  "location": "facebook.com.facebookLogin.user_clicks_on_Gender(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on Sign up",
  "keyword": "And "
});
formatter.match({
  "location": "facebook.com.facebookLogin.user_clicks_on_Sign_up()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User TakeScreenShot",
  "keyword": "Then "
});
formatter.match({
  "location": "facebook.com.facebookLogin.user_TakeScreenShot()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});