package EA_Employee.step_definitions;
import EA_Employee.pages.EmployeeListPage;
import EA_Employee.pages.LoginPage;
import EA_Employee.pages.MainPage;
import EA_Employee.utilities.*;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class AddDeleteEmployeeStepDef {

    MainPage mainPage = new MainPage();
    LoginPage loginPage = new LoginPage();
    EmployeeListPage employeeListPage = new EmployeeListPage();

    @Given("The admin navigates to main page")
    public void the_admin_navigates_to_main_page() {
        Driver.get().get(ConfigurationReader.get("url"));
    }

    @When("The admin should be able to login")
    public void the_admin_should_be_able_to_login() {
        mainPage.loginMenu.click();
        loginPage.loginAsAdmin();
    }

    @When("The admin navigates to {string} page")
    public void the_admin_navigates_to_page(String menuName) {
        mainPage.navigateToMenu(menuName);
    }

    @When("The admin creates a new employee {string}, {string}, {string}, {string}, {string}")
    public void the_admin_creates_a_new_employee(String name, String salary, String durationWorked, String grade, String email) {
        employeeListPage.addEmployee(name, salary, durationWorked, grade, email);
    }

    @Then("Verify the new employee info {string} exist in Employee List page")
    public void verifyTheNewEmployeeInfoInEmployeeListPage(String email) {
        Assert.assertTrue(Driver.get().getPageSource().contains(email));
    }


    /**
     *While registering the worker, no ID number is created by the system, the deletion and verification process was done using email,
     *  which is the most unique data. On the other hand, it is possible to create more than one record with the same email and other data,
     *  the healthiest thing would be to proceed with the id, being aware of this, using the most unique data. I thought it would be
     *  appropriate to verify via email whenever possible and proceed this way.
     * @param email
     */
    @Then("The admin deletes {string} employee from list")
    public void the_admin_deletes_employee_from_list(String email) {

        employeeListPage.deleteEmployee(email);
    }

    @Then("Verify the new employee {string} deleted in Employee List page")
    public void verifyTheNewEmployeeDeletedInEmployeeListPage(String email) {
        Assert.assertFalse(Driver.get().getPageSource().contains(email));
    }
}
