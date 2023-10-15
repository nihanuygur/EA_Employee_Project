package EA_Employee.pages;

import EA_Employee.utilities.ConfigurationReader;
import EA_Employee.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(css = "#UserName")
    public WebElement userName;

    @FindBy(css = "#Password")
    public WebElement password;

    @FindBy(xpath = "//*[@type='submit']")
    public WebElement submitBtn;


    public void loginAsAdmin(){
        userName.sendKeys(ConfigurationReader.get("username"));
        password.sendKeys(ConfigurationReader.get("password"));
        submitBtn.click();
    }

}
