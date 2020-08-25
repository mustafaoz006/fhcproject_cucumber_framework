package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CreateHotelReservation {

    public CreateHotelReservation(){

        PageFactory.initElements(Driver.getDriver(), this);
    }
}
