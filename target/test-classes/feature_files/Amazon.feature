Feature: Amazon online shopping application

Scenario: User have to move a product to the cart.

Given user Launches The  Chrome Browser
When  user Enters The url "https://www.amazon.in/"
Then  user Will Be Navigated To The Aamazon Web Page Verify Title
And  user Navigates To The Mobile Page 
Then  user Enters Samsung In The Text Search Box
And  user Selects Samsung M04 Mobile In The Result 
Then user Adds It To The Cart
Then user Goes To The Cart To Verify That The Product Has Been Added Or Not
Then user Close The Browser




