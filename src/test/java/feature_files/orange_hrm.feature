Feature: To Check The Valid Username And Valid Password


Scenario Outline: Orange hrm page login

Given user launches The Browser Chrome
When user Enters the url "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"

And user Pass The Credentials In The field
 | username | password |
 | <username> | <password> |
Then user Enters The Login Button


Examples:
   | username | password |
   | Admin    | Admin123 |
   | admin    | admin123 |
   | ADMIN    | ADMIN123 |
   | Admin    | admin123 |
  

  
