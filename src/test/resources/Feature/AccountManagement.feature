@AccountManagement
Feature: Account Management


  @CreateAccount
  Scenario Outline: Create account using a valid email address
    Given User is on create an account page
    When user enter "<firstname>", "<lastname>", "<email>", "<password>" and "<confirmpassword>"
    And user click on create an account
    Then Error message should be displayed that email already exist

    Examples:
      | firstname | lastname | email                    | password  | confirmpassword |
      | peter     | robinson | peterrobinson1@yahoo.com | Peter123@ | Peter123@       |

  @SignIn
  Scenario Outline: Sign In using a valid email address
    Given User is on customer login page
    When user enter "<email>"  "<password>"
    And User click on sign in
    Then my account page should be displayed

    Examples:
      | email                    | password  |
      | peterrobinson1@yahoo.com | Peter123@ |

