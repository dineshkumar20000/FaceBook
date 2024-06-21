Feature: NewFaceBook


Background: Application Launch
Given Launch the browser and appilication "https://www.facebook.com"


Scenario Outline: Creat a facebook in facebook application

When User click on create new account
When User enters the value in First name "<Firstname>"
And User enters the value in surname "<Surname>"
And User enters the value in mobile number or email address "<MobileNo>"
And User enters a new Password "<Password>"
And User selects a Date of birth "<Dob>" "<M>" "<Y>"
And User clicks on Gender "<Gender>"
And User clicks on Sign up
Then User TakeScreenShot

Examples:
|Firstname|Surname|MobileNo  |Password|Dob|M  |Y   |Gender|
|Dinesh   |Kumar  |8888888888|Dinesh@2|7   |Sep|2000|Male  |


