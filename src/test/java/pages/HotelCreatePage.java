package pages;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HotelCreatePage {


public HotelCreatePage(){

    PageFactory.initElements(Driver.getDriver(), this);
}
    @FindBy(id= "UserName")
    public WebElement username;

    @FindBy(id = "Password")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public  WebElement loginButton;

    @FindBy(id ="Code")
    public  WebElement code;
    @FindBy(xpath = "//label[@for='Code']")
    public  WebElement errorCode;

    @FindBy(id = "Name")
    public WebElement name;
    @FindBy(xpath = "//label[@for='Name']")
    public  WebElement errorName;

    @FindBy(id = "Address")
    public WebElement adress;
    @FindBy(xpath = "//label[@for='Address']")
    public  WebElement errorAddress;

    @FindBy(id = "Phone")
    public WebElement phone;
    @FindBy(xpath = "//label[@for='Phone']")
    public  WebElement errorPhone;

    @FindBy(id = "Email")
    public WebElement email;
    @FindBy(xpath = "//label[@for='Email']")
    public  WebElement errorEmail;

    @FindBy(id = "IDGroup")
    public WebElement idGroup;
    @FindBy(xpath = "//label[@for='IDGroup']")
    public  WebElement errorIDGroup;

    @FindBy(id = "btnSubmit")
    public WebElement saveButton;

    @FindBy(xpath = "//div[@class='bootbox-body']")
    public WebElement submitMesssage;

    public  void login(){
        username.sendKeys("manager2");
        password.sendKeys("Man1ager2!");
        loginButton.click();
    }
}
