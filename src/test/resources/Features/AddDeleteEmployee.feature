Feature: Add and delete function to employee list

  @addDelete
  Scenario Outline: Admin should be able to add and delete employee
    Given The admin navigates to main page
    When The admin should be able to login
    And The admin navigates to "Employee List" page
    And The admin creates a new employee "<name>", "<salary>", "<durationWorked>", "<grade>", "<email>"
    Then Verify the new employee info "<email>" exist in Employee List page
    And The admin deletes "<email>" employee from list
    Then Verify the new employee "<email>" deleted in Employee List page

    Examples:
      | name | salary | durationWorked | grade | email         |
      | Tom  | 5000   | 10             | 1     | tom@gmail.com |

