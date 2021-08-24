$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Feature/LoginPage.feature");
formatter.feature({
  "name": "Verifying Adactine Page Login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Verifying Adactin login With Valid Credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag3"
    }
  ]
});
formatter.step({
  "name": "User is on Adactine Login page",
  "keyword": "Given "
});
formatter.step({
  "name": "User should login \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User should search hotel \"\u003clocation\u003e\" , \"\u003chotel\u003e\" , \"\u003croomType\u003e\" , \"\u003cRoomNo\u003e\" , \"\u003cadult\u003e\" and \"\u003cchild\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User should select the room",
  "keyword": "And "
});
formatter.step({
  "name": "User should book room \"\u003cfirstName\u003e\" , \"\u003clastName\u003e\" , \"\u003caddress\u003e\" , \"\u003cccNo\u003e\" , \"\u003cccType\u003e\" , \"\u003cmonth\u003e\" , \"\u003cyear\u003e\" and \"\u003ccvv\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User should generate order Id",
  "keyword": "Then "
});
formatter.examples({
  "name": "|",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "location",
        "hotel",
        "roomType",
        "RoomNo",
        "adult",
        "child",
        "firstName",
        "lastName",
        "address",
        "ccNo",
        "ccType",
        "month",
        "year",
        "cvv"
      ]
    },
    {
      "cells": [
        "Mathangi",
        "A2J3X1",
        "Sydney",
        "Hotel Creek",
        "Standard",
        "1 - One",
        "4 - Four",
        "2 - Two",
        "Mathangi",
        "Sankar",
        "Chennai",
        "1234567890123456",
        "VISA",
        "October",
        "2017",
        "345"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verifying Adactin login With Valid Credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag3"
    }
  ]
});
formatter.step({
  "name": "User is on Adactine Login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPageStep.launchBrowser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should login \"Mathangi\" and \"A2J3X1\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageStep.user_should_login_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should search hotel \"Sydney\" , \"Hotel Creek\" , \"Standard\" , \"1 - One\" , \"4 - Four\" and \"2 - Two\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageStep.user_should_search_hotel_and(String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should select the room",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageStep.user_should_select_the_room()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should book room \"Mathangi\" , \"Sankar\" , \"Chennai\" , \"1234567890123456\" , \"VISA\" , \"October\" , \"2017\" and \"345\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageStep.user_should_book_room_and(String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should generate order Id",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageStep.user_should_generate_order_Id()"
});
formatter.result({
  "status": "passed"
});
});