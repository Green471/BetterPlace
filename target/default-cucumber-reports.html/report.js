$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/donation.feature");
formatter.feature({
  "name": "Donation",
  "description": "    In order to donate to the project\n    As a user\n    I want to be able to donate to the project",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@regressionTest"
    }
  ]
});
formatter.scenario({
  "name": "Donation",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@regressionTest"
    }
  ]
});
formatter.step({
  "name": "I am on the donation page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.Stepdefinitionss.i_am_on_the_donation_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the Okay! button",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.Stepdefinitionss.iClickOnTheOkayButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the betrage text box and cleared it",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.Stepdefinitionss.iClickOnTheBetrageTextBoxAndClearedIt()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I type \"5\" into the betrage text box",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.Stepdefinitionss.iTypeIntoTheBetrageTextBox(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should select payment periode",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.Stepdefinitionss.iShouldSelectPaymentPeriode()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should select payment method and see information message on the page",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.Stepdefinitionss.iShouldSelectPaymentMethodAndSeeInformationMessageOnThePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Donation, company or individual payment method can be selected.",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.Stepdefinitionss.donationCompanyOrIndividualPaymentMethodCanBeSelected()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "DonationData",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@regressionTest"
    }
  ]
});
formatter.scenarioOutline({
  "name": "DonationData",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I click on the name box and type the \"\u003cname\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "name": "I click on the last box and type the \"\u003clastname\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "I click on the email box and type the \"\u003cemail\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "I click on the Betrag anzeigen checkbox",
  "keyword": "Then "
});
formatter.step({
  "name": "I click on the Betrag Name anzeigen checkbox",
  "keyword": "And "
});
formatter.step({
  "name": "I click on the Zu den Zahlungsinformationen button",
  "keyword": "And "
});
formatter.step({
  "name": "I should on the Weiter button",
  "keyword": "Then "
});
formatter.step({
  "name": "I should see the DANKE message",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "name",
        "lastname",
        "email"
      ]
    },
    {
      "cells": [
        "Testname",
        "Testlasname",
        "test@betterplace.org"
      ]
    }
  ]
});
formatter.scenario({
  "name": "DonationData",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@regressionTest"
    }
  ]
});
formatter.step({
  "name": "I click on the name box and type the \"Testname\"",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.Stepdefinitionss.iClickOnTheNameBoxAndTypeThe(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the last box and type the \"Testlasname\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.Stepdefinitionss.iClickOnTheLastBoxAndTypeThe(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the email box and type the \"test@betterplace.org\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.Stepdefinitionss.iClickOnTheEmailBoxAndTypeThe(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the Betrag anzeigen checkbox",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.Stepdefinitionss.iClickOnTheBetragAnzeigenCheckbox()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the Betrag Name anzeigen checkbox",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.Stepdefinitionss.iClickOnTheBetragNameAnzeigenCheckbox()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the Zu den Zahlungsinformationen button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.Stepdefinitionss.iClickOnTheZuDenZahlungsinformationenButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should on the Weiter button",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.Stepdefinitionss.iShouldOnTheWeiterButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see the DANKE message",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.Stepdefinitionss.iShouldSeeTheDANKEMessage()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});