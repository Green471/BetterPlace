@regressionTest
  Feature: Donation
    In order to donate to the project
    As a user
    I want to be able to donate to the project

    Scenario: Donation
      Given I am on the donation page
      When I click on the Okay! button
      Then I click on the betrage text box and cleared it
      And I type "5" into the betrage text box
      Then I should select payment periode
      And I should select payment method and see information message on the page
      And Donation, company or individual payment method can be selected.

    Scenario: DonationData
        Scenario Outline: DonationData
        Given I click on the name box and type the "<name>"
        Then I click on the last box and type the "<lastname>"
        And I click on the email box and type the "<email>"
          Then I click on the Betrag anzeigen checkbox
          And I click on the Betrag Name anzeigen checkbox
          And I click on the Zu den Zahlungsinformationen button
          Then I should on the Weiter button
          And I should see the DANKE message



  Examples:
          | name | lastname |email |
          |Testname|Testlasname|test@betterplace.org|







