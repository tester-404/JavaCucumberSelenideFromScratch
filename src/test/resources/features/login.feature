Feature: Login User

  Scenario: Login user
    # Then Click button   работает
     Then Click "Log In" button
    Then Input login
    Then Input password
    Then Click "Log in" button span
    Then Content with "Spread the Word About Grinfer and Get Rewarded" visible