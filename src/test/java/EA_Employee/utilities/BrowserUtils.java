package EA_Employee.utilities;
import org.openqa.selenium.*;

public class BrowserUtils {

    public static void scrollToElement(WebElement element) {
        ((JavascriptExecutor) Driver.get()).executeScript("arguments[0].scrollIntoView(true);", element);
    }


}


