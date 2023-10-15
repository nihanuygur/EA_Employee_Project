package EA_Employee.pages;

import EA_Employee.utilities.BrowserUtils;
import EA_Employee.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class EmployeeListPage extends BasePage {

    @FindBy(xpath = "//*[text()='Create New']")
    public WebElement createNewBtn;

    @FindBy(xpath = "//*[text()='Delete']")
    public WebElement firstEmployeeDelete;

    @FindBy(css = "#Name")
    public WebElement nameField;
    @FindBy(css = "#Salary")
    public WebElement salaryField;
    @FindBy(css = "#DurationWorked")
    public WebElement durationWorkedField;
    @FindBy(css = "#Grade")
    public WebElement gradeField;
    @FindBy(css = "#Email")
    public WebElement emailField;
    @FindBy(css = "input[value='Create']")
    public WebElement createBtn;

    @FindBy(xpath = "//*[@value='Delete']")
    public WebElement deleteBtn;

//    @FindBy(xpath = "//tr")
//    public List<WebElement> employeeList;
//    static int idNumber = 0;
//    int totalEmployee;
//
//    public int findTotal() {
//        totalEmployee = employeeList.size();
//        return totalEmployee;
//    }

    public void addEmployee(String name, String salary, String durationWorked, String grade, String email) {
        createNewBtn.click();
        nameField.sendKeys(name);
        salaryField.sendKeys(salary);
        durationWorkedField.sendKeys(durationWorked);
        gradeField.sendKeys(grade);
        emailField.sendKeys(email);
        createBtn.click();
//        idNumber = findTotal();
    }

//    public Boolean actualMail(){
//        Boolean flag=false;
//        String actualName= Driver.get().findElement(By.xpath("//tr["+idNumber+"]/td[1]")).getText();
//        String actualMail= Driver.get().findElement(By.xpath("//tr["+idNumber+"]/td[5]")).getText();
//
//        return ;
//    }
    public void deleteEmployee(String email){
        BrowserUtils.scrollToElement(Driver.get().findElement(By.xpath("//td[contains(text(),'"+email+"')]")));
        Driver.get().findElement(By.xpath("//td[contains(text(),'"+email+"')]//following-sibling::*/a[text()='Delete']")).click();
        deleteBtn.click();
    }
}
