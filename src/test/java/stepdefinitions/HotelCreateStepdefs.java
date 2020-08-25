package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HotelCreatePage;
import utilities.ConfigReader;
import utilities.Driver;

public class HotelCreateStepdefs {
    HotelCreatePage hotelCreatePage = new HotelCreatePage();
    @Given("user is on the fhctripcreatehotel page")
    public void userIsOnTheFhctripcreatehotelPage() {
        Driver.getDriver().get(ConfigReader.getProperty("fhc_createHotel_url"));
    }

    @And("user logins with valid data")
    public void userLoginsWithValidData() {
        hotelCreatePage.username.sendKeys("manager2");
        hotelCreatePage.password.sendKeys("Man1ager2!");
        hotelCreatePage.loginButton.click(); }

    @And("user clicks save button")
    public void userClicksSaveButton() {
        hotelCreatePage.saveButton.click();}

    @And("user enters valid data all text box except code")
    public void userEntersValidDataAllTextBoxExceptCode() {
        hotelCreatePage.name.sendKeys(ConfigReader.getProperty("create_name"));
        hotelCreatePage.adress.sendKeys(ConfigReader.getProperty("create_address"));
        hotelCreatePage.phone.sendKeys(ConfigReader.getProperty("create_phone"));
        hotelCreatePage.email.sendKeys(ConfigReader.getProperty("create_email"));
        Select idDroupSlect = new Select(hotelCreatePage.idGroup);
        idDroupSlect.selectByIndex(0); }

    @And("user enters  valid data all text box except name")
    public void userEntersValidDataAllTextBoxExceptName() {
        hotelCreatePage.code.sendKeys(ConfigReader.getProperty("create_code"));
        hotelCreatePage.adress.sendKeys(ConfigReader.getProperty("create_address"));
        hotelCreatePage.phone.sendKeys(ConfigReader.getProperty("create_phone"));
        hotelCreatePage.email.sendKeys(ConfigReader.getProperty("create_email"));
        Select idDroupSlect = new Select(hotelCreatePage.idGroup);
        idDroupSlect.selectByIndex(0);}

    @And("user enters  valid data all text box except address")
    public void userEntersValidDataAllTextBoxExceptAddress() {
        hotelCreatePage.name.sendKeys(ConfigReader.getProperty("create_name"));
        hotelCreatePage.code.sendKeys(ConfigReader.getProperty("create_code"));
        hotelCreatePage.phone.sendKeys(ConfigReader.getProperty("create_phone"));
        hotelCreatePage.email.sendKeys(ConfigReader.getProperty("create_email"));
        Select idDroupSlect = new Select(hotelCreatePage.idGroup);
        idDroupSlect.selectByIndex(0);  }

    @And("user enters  valid data all text box except phone")
    public void userEntersValidDataAllTextBoxExceptPhone() {
        hotelCreatePage.name.sendKeys(ConfigReader.getProperty("create_name"));
        hotelCreatePage.code.sendKeys(ConfigReader.getProperty("create_code"));
        hotelCreatePage.adress.sendKeys(ConfigReader.getProperty("create_address"));
        hotelCreatePage.email.sendKeys(ConfigReader.getProperty("create_email")); }

    @And("user enters  valid data all text box except email")
    public void userEntersValidDataAllTextBoxExceptEmail() {
        hotelCreatePage.name.sendKeys(ConfigReader.getProperty("create_name"));
        hotelCreatePage.code.sendKeys(ConfigReader.getProperty("create_code"));
        hotelCreatePage.adress.sendKeys(ConfigReader.getProperty("create_address"));
        hotelCreatePage.phone.sendKeys(ConfigReader.getProperty("create_phone"));}

    @Then("verify didn't creating hotel wtihout code")
    public void verifyDidnTCreatingHotelWtihoutCode() {
        Assert.assertTrue(hotelCreatePage.errorCode.isDisplayed());
    }

    @Then("verify didn't creating hotel  wtihout name")
    public void verifyDidnTCreatingHotelWtihoutName() {
        Assert.assertTrue(hotelCreatePage.errorName.isDisplayed());
    }

    @Then("verify didn't creating hotel  wtihout address")
    public void verifyDidnTCreatingHotelWtihoutAddress() {
        Assert.assertTrue(hotelCreatePage.errorAddress.isDisplayed());  }

    @Then("verify didn't creating hotel  wtihout phone")
    public void verifyDidnTCreatingHotelWtihoutPhone() {
        Assert.assertTrue(hotelCreatePage.errorPhone.isDisplayed()); }

    @Then("verify didn't creating hotel  wtihout email")
    public void verifyDidnTCreatingHotelWtihoutEmail() {
        Assert.assertTrue(hotelCreatePage.errorEmail.isDisplayed());}
}
