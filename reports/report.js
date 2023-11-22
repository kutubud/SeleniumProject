$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/doc.feature");
formatter.feature({
  "name": "Automate leaftap application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "TC003_CreateLead",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "Launch chrome browser and load url",
  "keyword": "Given "
});
formatter.step({
  "name": "Enter username as DemoSalesManager",
  "keyword": "And "
});
formatter.step({
  "name": "Enter Password as crmsfa",
  "keyword": "And "
});
formatter.step({
  "name": "Click the login button",
  "keyword": "And "
});
formatter.step({
  "name": "Click CRMSFA",
  "keyword": "And "
});
formatter.step({
  "name": "Click leads link",
  "keyword": "And "
});
formatter.step({
  "name": "Click createLead",
  "keyword": "When "
});
formatter.step({
  "name": "Enter the company name as \u003ccompany\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "Enter the firstname as \u003cfName\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "Enter the lastname as \u003clName\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "Choose source as Website",
  "keyword": "And "
});
formatter.step({
  "name": "Click the create lead button",
  "keyword": "And "
});
formatter.step({
  "name": "It\u0027s navigated ViewLeadPage",
  "keyword": "Then "
});
formatter.step({
  "name": "Verify the firstname",
  "keyword": "And "
});
formatter.step({
  "name": "Close browser",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "company",
        "fName",
        "lName"
      ]
    },
    {
      "cells": [
        "ABC",
        "Hema",
        "Mali"
      ]
    },
    {
      "cells": [
        "XYZ",
        "Hema",
        "Mali"
      ]
    },
    {
      "cells": [
        "TCS",
        "Hema",
        "Mali"
      ]
    }
  ]
});
formatter.scenario({
  "name": "TC003_CreateLead",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "Launch chrome browser and load url",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Enter username as DemoSalesManager",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.enterUsernameAsDemoSalesManager(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter Password as crmsfa",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.enterPasswordAsCrmsfa()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click the login button",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Click CRMSFA",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.clickCRMSFA()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click leads link",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.clickLeadsLink()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click createLead",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.clickCreateLead()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter the company name as ABC",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.enterTheCompanyNameAsABC(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter the firstname as Hema",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.enterTheFirstnameAsHema(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter the lastname as Mali",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.enterTheLastnameAsMali(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Choose source as Website",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.chooseSourceAsWebsite()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click the create lead button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.clickTheCreateLeadButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "It\u0027s navigated ViewLeadPage",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.itSNavigatedViewLeadPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify the firstname",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.verifyTheFirstname()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Close browser",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "TC003_CreateLead",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "Launch chrome browser and load url",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Enter username as DemoSalesManager",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.enterUsernameAsDemoSalesManager(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter Password as crmsfa",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.enterPasswordAsCrmsfa()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click the login button",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Click CRMSFA",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.clickCRMSFA()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click leads link",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.clickLeadsLink()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click createLead",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.clickCreateLead()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter the company name as XYZ",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.enterTheCompanyNameAsABC(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter the firstname as Hema",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.enterTheFirstnameAsHema(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter the lastname as Mali",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.enterTheLastnameAsMali(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Choose source as Website",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.chooseSourceAsWebsite()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click the create lead button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.clickTheCreateLeadButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "It\u0027s navigated ViewLeadPage",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.itSNavigatedViewLeadPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify the firstname",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.verifyTheFirstname()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Close browser",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "TC003_CreateLead",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "Launch chrome browser and load url",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Enter username as DemoSalesManager",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.enterUsernameAsDemoSalesManager(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter Password as crmsfa",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.enterPasswordAsCrmsfa()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click the login button",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Click CRMSFA",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.clickCRMSFA()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click leads link",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.clickLeadsLink()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click createLead",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.clickCreateLead()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter the company name as TCS",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.enterTheCompanyNameAsABC(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter the firstname as Hema",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.enterTheFirstnameAsHema(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter the lastname as Mali",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.enterTheLastnameAsMali(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Choose source as Website",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.chooseSourceAsWebsite()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click the create lead button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.clickTheCreateLeadButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "It\u0027s navigated ViewLeadPage",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.itSNavigatedViewLeadPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify the firstname",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.verifyTheFirstname()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Close browser",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});