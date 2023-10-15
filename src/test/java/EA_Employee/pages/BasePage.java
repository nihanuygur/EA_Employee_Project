package EA_Employee.pages;

import EA_Employee.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.get(),this);
    }







}
