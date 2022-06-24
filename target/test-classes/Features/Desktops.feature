Feature: Desktops Tab

	@test
  Scenario: User verify all items are present in Desktops tab
    Given User is on Retail website
    When User click on Desktops tab
    And User click on Show all desktops
    Then User should see all items are present in Desktop page
