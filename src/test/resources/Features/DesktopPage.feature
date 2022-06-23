Feature: Desktops Tab


Background:
  Given User is on Retail website
  When User click on Desktops tab
  And User click on Show all desktops

  Scenario: User verify all items are present in Desktops tab
  Then User should see all items are present in Desktop page
  
  Scenario: User add HP LP 3065  from Desktops tab to the cart 
  And User click  ADD TO CART option on HP LP3065item 
  And User select quantity 1 
  And User click add to Cart button 
  Then User should see a message 'Success: you have added HP LP 3065 to your Shopping cart!'
