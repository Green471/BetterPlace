package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;
import org.openqa.selenium.*;

import org.openqa.selenium.interactions.Actions;

import pages.DonataPage;
import utilities.ConfigurationReader;
import utilities.Driver;




public class Stepdefinitionss {

    DonataPage donataPage = new DonataPage();
    Actions actions = new Actions(Driver.getDriver());



    @Given("I am on the donation page")
    public void i_am_on_the_donation_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("invalid_url"));
    }

    @When("I click on the Okay! button")
    public void iClickOnTheOkayButton() {
        Driver.waitAndClick(donataPage.okayButon, 5);

    }

    @Then("I click on the betrage text box and cleared it")
    public void iClickOnTheBetrageTextBoxAndClearedIt() {
        Driver.waitAndClick(donataPage.betrageBox, 5);
        Driver.waitAndSendText(donataPage.betrageBox, Keys.CONTROL + "a", 5);
        donataPage.betrageBox.sendKeys(Keys.DELETE);
    }

    @And("I type {string} into the betrage text box")
    public void iTypeIntoTheBetrageTextBox(String arg0) {
        Driver.waitAndClick(donataPage.betrageBox, 5);
        Driver.waitAndSendText(donataPage.betrageBox, arg0, 5);

    }

    @Then("I should select payment periode")
    public void iShouldSelectPaymentPeriode() {

        if (donataPage.einmaligRadioButton.isSelected()) {
            System.out.println("Payment periode selected as einmalig");
        } else
            donataPage.einmaligRadioButton.click();


    }

    @And("I should select payment method and see information message on the page")
    public void iShouldSelectPaymentMethodAndSeeInformationMessageOnThePage() throws InterruptedException {

        int divContainerHight = donataPage.validUrlDivConHight.getSize().getHeight();
        System.out.println("validUrlDivConHight: " + divContainerHight);
        //invalidUrlDivConHight==69
        //validUrlDivConHight==245
        if(divContainerHight==245){
            actions.sendKeys(Keys.PAGE_DOWN).build().perform();
            Thread.sleep(2000);
            Driver.waitAndClick(donataPage.uberweisungRadioButton, 5);
            String informationMessage = donataPage.informationMessage.getText();
            String expectedMessage ="Bitte fülle alle Pflichtfelder aus, damit wir deine Spende richtig zuordnen können. Die IBAN erhältst du im Anschluss.";
          //  Assert.assertEquals(expectedMessage, informationMessage);
        }else
            Assert.fail("Uberweisung Button Width should be: "+ 245);

    }

    @And("Donation, company or individual payment method can be selected.")
    public void donationCompanyOrIndividualPaymentMethodCanBeSelected() {
        String asAperson = donataPage.alsPersonSpende.getText();
        if (asAperson.equals("Als Firma spenden")) {
         //   System.out.println("Donation should be personally");
            Assert.assertTrue(donataPage.alsPersonSpende.isDisplayed());
        } else
           Assert.assertEquals(donataPage.alsPersonSpende.getText(), "Als Firma spenden","Donation should be personally");


        }

        @And("I click on the Betrag anzeigen checkbox")
    public void iClickOnTheBetragAnzeigenCheckbox() {
        if(donataPage.betragAnzeigenCheckbox.isSelected())
        Driver.waitAndClick(donataPage.betragAnzeigenCheckbox, 5);
    }


    @And("I click on the Betrag Name anzeigen checkbox")
    public void iClickOnTheBetragNameAnzeigenCheckbox() {
        if( !donataPage.betragNameAnzeigenCheckbox.isSelected()) {
            Driver.waitAndClick(donataPage.betragNameAnzeigenCheckbox, 5);
        }
    }



    @And("I click on the Zu den Zahlungsinformationen button")
    public void iClickOnTheZuDenZahlungsinformationenButton() throws InterruptedException {

        actions.sendKeys(Keys.PAGE_DOWN).build().perform();
        Driver.waitAndClick(donataPage.zuDenZahlungInfoButton, 5);
    }


    @Given("I click on the name box and type the {string}")
    public void iClickOnTheNameBoxAndTypeThe(String arg0) {
        Driver.waitAndSendText(donataPage.firstname, arg0, 5);
    }

    @Then("I click on the last box and type the {string}")
    public void iClickOnTheLastBoxAndTypeThe(String arg0) {
        Driver.waitAndSendText(donataPage.lastname, arg0, 5);
    }

    @And("I click on the email box and type the {string}")
    public void iClickOnTheEmailBoxAndTypeThe(String arg0) {
        Driver.waitAndSendText(donataPage.email, arg0, 5);
    }

    @Then("I should on the Weiter button")
    public void iShouldOnTheWeiterButton() {
      Driver.scrollToElement(donataPage.weiterButton);
        Driver.waitAndClick(donataPage.weiterButton, 5);
    }
       // String expectedTitle ="Mein Überweisungsauftrag";
     //   String actualTitle =Driver.waitAndGetText(donataPage.ueberweisungsauftragform,5);
       // Assert.assertEquals(expectedTitle, actualTitle);
       // Driver.scrollToElement(donataPage.ueberweisungsauftragform);
      // actions.sendKeys(Keys.PAGE_DOWN).perform();
      //  Driver.waitAndClick(donataPage.weiterButton, 5);
    //

    @And("I should see the DANKE message")
    public void iShouldSeeTheDANKEMessage() {

        String actualMessage = Driver.waitAndGetText(donataPage.dankeMessage, 5);
        String expectedMessage = "Vielen Dank für deine Spende!";
        Assert.assertEquals(expectedMessage, actualMessage);
    }




}
