Feature: Verify login feature of Facebok App


@RegressionTest
  Scenario: A user successfully signs in with Facebook
  Given user should be in login page
When user enter valid username and valid password
And click on sigin button
Then user should be able to logged in

@RegressionTest
  Scenario: A user unsuccessfully signs in with Facebook
   Given user should be in login page
When user enter valid username and invalid password
And click on sigin button
Then user should not be able to logged in

  