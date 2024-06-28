Feature: Login
  Scenario: Login with valid credentials
   Given User launch the browser
   When User opents the url "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
    And User enters Email as "admin@yourstore.com" and Password as "admin"
    And  Click on login
    Then Page title should be "Dashboard / nopCommerce administration"
   When User click on Log out link
   Then Page title should be "Your store. Login"
#   And close browser


#   Scenario Outline: Login Data Driven
#    Given User launch the browser
#    When User opents the url "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
#    And User enters Email as "<email>" and Password as "<password>"
#    And  Click on login
#    Then Page title should be "Dashboard / nopCommerce administration"
#    When User click on Log out link
#    Then Page title should be "Your store. Login"
#    And close browser
#
#   Examples:
#    | email               | password  |  |
#    | admin@yourstore.com | admin     |  |
#    | admin@yourstore.com | admin@123 |  |