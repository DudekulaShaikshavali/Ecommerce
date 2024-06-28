Feature: Customers
  Scenario: Add a new customer
    Given User launch the browser
    When User opents the url "https://admin-demo.nopcommerce.com/login"
    And User enters Email as "admin@yourstore.com" and Password as "admin"
    And  Click on login
    Then User can view Dashboard
    When User click on customers menu
    And Click on customers menu item
    And Click on add new button
    Then  User can view add new customer page
    When User enter customer info
    And Click on save button
    Then User can view confirmation message "The new customer has been added successfully"
    And Close browser
