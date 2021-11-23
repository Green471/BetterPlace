package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.security.PublicKey;

public class DonataPage {

    public DonataPage () {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//*[@id=\"cookie-banner\"]/div/div/div/div[2]/div/div[2]/button[2]")
    public WebElement okayButon;

    @FindBy(xpath = "//input[@name='amount_cents']")
    public WebElement betrageBox;

    @FindBy(id = "single")
    public WebElement einmaligRadioButton;

    @FindBy(xpath = "(//span[@class='generic-custom-radio'])[8]")
    public WebElement uberweisungRadioButton;
    //xpath = "//input[@id='direct_deposit']"


    @FindBy(xpath = "//p[@class='m-0']")
    public WebElement informationMessage;

    @FindBy (xpath = "//*[text()='Als Firma spenden']")
    public WebElement alsPersonSpende;

    @FindBy (xpath = "//*[text()='Als Privatperson spenden']")
    public WebElement alsFirmaSpende;

    @FindBy(xpath = "//p[@class='m-0']")
    public WebElement personSpendeText;

    @FindBy (xpath = "//input[@id='first_name']")
    public WebElement firstname;


    @FindBy (xpath = "//input[@id='last_name']")
   public WebElement lastname;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement email;

    @FindBy(xpath = "//textarea[@id='message']")
    public WebElement message;

    @FindBy(xpath = "//input[@id='show_amount']")
    public WebElement betragAnzeigenCheckbox;

    @FindBy(xpath = "//input[@id='show_user']")
        public WebElement betragNameAnzeigenCheckbox;

    @FindBy(xpath = "//input[@id='receiveReceipt']")
    public WebElement rechnungAnPerson;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement zuDenZahlungInfoButton;

    @FindBy(xpath = "//select[@id='country_alpha2']")
    public WebElement land;

    @FindBy(xpath = "//input[@id='zip']")
    public WebElement plz;

    @FindBy(xpath = "//input[@id='city']")
    public WebElement stadt;

    @FindBy(xpath = "//input[@name='street']")
    public WebElement strasse;

    @FindBy(xpath = "//a[text()='Weiter']")
    public WebElement weiterButton;

    @FindBy(xpath = "//*[text()='Mein Überweisungsauftrag']")
    public WebElement ueberweisungsauftragform;

    @FindBy (css = ".text-3xl")
    public WebElement dankeMessage;

    @FindBy (xpath = "//*[@id=\"mount-donate-form\"]/div/div/div/div/div/form/div[1]/div[3]/div[1]/div[1]']")
    public WebElement invalinUrlDivConHight;

    @FindBy (xpath = "//*[@id=\"mount-donate-form\"]/div/div/div/div/div/form/div[1]/div[3]/div[1]/div")
    public WebElement validUrlDivConHight;







}
