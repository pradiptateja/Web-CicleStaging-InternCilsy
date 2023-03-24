Feature: Docs & Files Functionality
  @Positive @Main @HQ
  Scenario: DF-001 Ensure user can access Docs & Files page in HQ group
    Given user is at Company page
    When user clicks existing HQ
    And user clicks Docs & Files menu
    Then user is directed to Docs&Files page
    And user can see Add item button
    And user can see Edit folder button
  @Positive @Main @Team
  Scenario: DF-002 Ensure user can access Docs & Files page in Team group
    Given user is at Company page
    When user clicks existing Team
    And user clicks Docs & Files menu
    Then user is directed to Docs&Files page
    And user can see Add item button
    And user can see Edit folder button

  @Positive @Main @Project
  Scenario: DF-003 Ensure user can access Docs & Files page in Project group
    Given user is at Company page
    When user clicks existing Project
    And user clicks Docs & Files menu
    Then user is directed to Docs&Files page
    And user can see Add item button
    And user can see Edit folder button

  @Positive @Main @Project
  Scenario: DF-004 Ensure user can clicks add menu button
    Given user is at Company page
    And user clicks existing Project
    And user clicks Docs & Files menu
    When user clicks add button
    Then user can see add new doc button
    And user can see create new folder button
    And user can see upload files button

  @Positive @Main @Project
  Scenario: DF-005 Ensure user can close add menu button
    Given user is at Company page
    And user clicks existing Project
    And user clicks Docs & Files menu
    When user clicks add button
    And user clicks close or back button
    Then user is directed to Docs&Files page

  @Positive @Main @Team
  Scenario: DF-006 Ensure user can clicks add menu button
    Given user is at Company page
    And user clicks existing Team
    And user clicks Docs & Files menu
    When user clicks add button
    Then user can see add new doc button
    And user can see create new folder button
    And user can see upload files button

  @Positive @Main @Team
  Scenario: DF-007 Ensure user can close add menu button
    Given user is at Company page
    And user clicks existing Team
    And user clicks Docs & Files menu
    When user clicks add button
    And user clicks close or back button
    Then user is directed to Docs&Files page

  @Positive @Main @HQ
  Scenario: DF-008 Ensure user can clicks add menu button
    Given user is at Company page
    And user clicks existing HQ
    And user clicks Docs & Files menu
    When user clicks add button
    Then user can see add new doc button
    And user can see create new folder button
    And user can see upload files button

  @Positive @Main @HQ
  Scenario: DF-009 Ensure user can close add menu button
    Given user is at Company page
    And user clicks existing HQ
    And user clicks Docs & Files menu
    When user clicks add button
    And user clicks close or back button
    Then user is directed to Docs&Files page
