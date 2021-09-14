Feature: Login App

  Scenario Outline: Login to shaadi.com mobile application
    Given Click on login button to redirect login screen
    When Login with "<emailId>" and "<password>"
    Then Navigate My Shaadi screen
    Then Verify My Shaadi Widgets
    Then Connect with candidate profile


    Examples:
      | emailId               | password   |
      | aryanroy838@gmail.com | Shaadi@774 |