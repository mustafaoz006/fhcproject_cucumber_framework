package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
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
        hotelCreatePage.loginButton.click();
    }
    @And("user enters  valid data all text box")
    public void userEntersValidDataAllTextBox() {
        hotelCreatePage.name.sendKeys(ConfigReader.getProperty("create_name"));
        hotelCreatePage.adress.sendKeys(ConfigReader.getProperty("create_address"));
        hotelCreatePage.phone.sendKeys(ConfigReader.getProperty("create_phone"));
        hotelCreatePage.email.sendKeys(ConfigReader.getProperty("create_email"));
        Select idDroupSlect = new Select(hotelCreatePage.idGroup);
        idDroupSlect.selectByIndex(0);
    }

    @And("user clicks save button")
    public void userClicksSaveButton() {
        hotelCreatePage.saveButton.click();
    }

    @Then("verify didn't creating hotel")
    public void verifyDidnTCreatingHotel() {
        Assert.assertTrue(hotelCreatePage.errorCode.isDisplayed());
    }


}
