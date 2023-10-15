package EA_Employee.pages;


import EA_Employee.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage {

    @FindBy(xpath = "//*[text()='Login']")
    public WebElement loginMenu;


    public void navigateToMenu(String menuName){
        Driver.get().findElement(By.xpath("//*[text()='"+menuName+"']")).click();
    }


}
