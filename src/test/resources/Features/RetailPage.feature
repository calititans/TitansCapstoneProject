Feature: Retail Page

  Background: 
    Given User is on Retail website
    And User click  on MyAccount
    When User click on Login
    And User enter username 'testtek@tekschool.us' and password '123456'
    And User click on Login button
    Then User should be logged in to MyAccount dashboard

  @Register
  Scenario: Register as an Affiliate user with Cheque Payment Method
    When User click on Register for an Affiliate Account link
    And User fill affiliate form with below information
      | company | website      | taxID  | paymentMethod | payeeName |
      | TEK     | tekschool.us | 123456 | Cheque        | TEK User  |
    And User check on About us check box
    And User click on Continue button
    Then User should see a success message
