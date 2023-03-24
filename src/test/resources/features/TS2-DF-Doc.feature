Feature: Docs Functionality
  @Positive @Docs @Team
  Scenario: DF-010 Ensure user can add new public Doc
    Given user is at Company page
    And user clicks existing Team
    And user clicks Docs & Files menu
    When user clicks add button
    And user clicks new Doc
    And user input Doc title
    And user input Doc content
    And user add subscriber
    And user clicks publish
    Then user is notified success message
    And user can see created Doc on the page

  @Positive @Docs @Team
  Scenario: DF-011 Ensure user can edit Doc to private
    Given user is at Company page
    And user clicks existing Team
    And user clicks Docs & Files menu
    When user clicks created Docs
    And user clicks option button
    And user clicks Edit button
    And user switch on private option
    And user clicks Publish Changes
    Then user is notified success message
    And user can see locked mark on the page

  @Positive @Docs @Team
  Scenario: DF-012 Ensure user can delete created Doc
    Given user is at Company page
    And user clicks existing Team
    And user clicks Docs & Files menu
    When user clicks created Docs
    And user clicks option button
    And user clicks Archive this button
    Then user is notified Doc is already archived


  @Negative @Docs @Team
  Scenario: DF-013 Ensure user failed to add new Doc without filling Doc title
    Given user is at Company page
    And user clicks existing Team
    And user clicks Docs & Files menu
    When user clicks add button
    And user clicks new Doc
    And user input Doc content
    And user add subscriber
    And user clicks publish
    Then user is notified title must be filled


  @Negative @Docs @Team
  Scenario: DF-014 Ensure user failed to add new Doc without filling Doc content
    Given user is at Company page
    And user clicks existing Team
    And user clicks Docs & Files menu
    When user clicks add button
    And user clicks new Doc
    And user input Doc title
    And user add subscriber
    And user clicks publish
    Then user is notified description must be filled


  @Positive @Docs @Team
  Scenario: DF-015 Ensure user can add new private Doc
    Given user is at Company page
    And user clicks existing Team
    And user clicks Docs & Files menu
    When user clicks add button
    And user clicks new Doc
    And user input Doc title
    And user input Doc content
    And user switch on private option
    And user clicks publish
    Then user is notified success message
    And user can see created Doc on the page
    And user can see locked mark on the page


  @Positive @Docs @Team
  Scenario: DF-016 Ensure user can edit created Doc
    Given user is at Company page
    And user clicks existing Team
    And user clicks Docs & Files menu
    When user clicks created Docs
    And user clicks option button
    And user clicks Edit button
    And user input new name
    And user input new Description
    And user clicks Publish Changes
    Then user is notified success message
    And user can see the changes on the page


  @Positive @Docs @Team
  Scenario: DF-017 Ensure user can edit private Doc to public
    Given user is at Company page
    And user clicks existing Team
    And user clicks Docs & Files menu
    When user clicks created Docs
    And user clicks option button
    And user clicks Edit button
    And user switch off private option
    And user clicks Publish Changes
    Then user is notified success message
    And user cannot see locked mark on the page


  @Positive @Docs @Team
  Scenario: DF-018 Ensure user can add new Doc without setting subscriber
    Given user is at Company page
    And user clicks existing Team
    And user clicks Docs & Files menu
    When user clicks add button
    And user clicks new Doc
    And user input Doc title
    And user input Doc content
    And user clicks publish
    Then user is notified success message
    And user can see created Doc on the page


  @Negative @Docs @Team
  Scenario: DF-019 Ensure user failed to add new Doc when clicking cancel
    Given user is at Company page
    And user clicks existing Team
    And user clicks Docs & Files menu
    When user clicks add button
    And user clicks new Doc
    And user clicks cancel or back button
    Then user is directed to Docs&Files page


  @Positive @Docs @Team
  Scenario: DF-020 Ensure user can add cheers to Doc
    Given user is at Company page
    And user clicks existing Team
    And user clicks Docs & Files menu
    When user clicks created Docs
    And user clicks cheers button
    And user input cheers words
    And user clicks done button
    Then user is notified success cheers message
    And user can see created cheers on Doc

  @Positive @Docs @Team
  Scenario: DF-021 Ensure user can delete cheers on Doc
    Given user is at Company page
    And user clicks existing Team
    And user clicks Docs & Files menu
    When user clicks created Docs
    And user clicks on created cheers
    And user clicks delete button
    Then user is notified success delete cheers message
    And user cannot see created cheers on Doc

  @Positive @Docs @Team
  Scenario: DF-022 Ensure user can add comment on Doc
    Given user is at Company page
    And user clicks existing Team
    And user clicks Docs & Files menu
    When user clicks created Docs
    And user clicks on comment section
    And user input comment
    And user clicks post button
    Then user is notified success message adding comment
    And user can see created comment on page

  @Positive @Docs @Team
  Scenario: DF-023 Ensure user can edit existing comment on Doc
    Given user is at Company page
    And user clicks existing Team
    And user clicks Docs & Files menu
    When user clicks created Docs
    And user clicks options on existing comment
    And user clicks edit button
    And user input edited comment
    And user clicks post button
    Then user is notified success message editing comment
    And user can see edited comment on page


  @Positive @Docs @Team
  Scenario: DF-024 Ensure user can reply existing comment on Doc
    Given user is at Company page
    And user clicks existing Team
    And user clicks Docs & Files menu
    When user clicks created Docs
    And user clicks reply on existing comment
    And user clicks on comment section
    And user input comment
    And user clicks post button
    Then user is notified success message adding reply
    And user can see created reply on page

  @Positive @Docs @Team
  Scenario: DF-025 Ensure user can delete existing comment on Doc
    Given user is at Company page
    And user clicks existing Team
    And user clicks Docs & Files menu
    When user clicks created Docs
    And user clicks options on existing comment
    And user clicks delete button
    And user confirm delete button
    Then user is notified delete comment success
    And user cannot see the deleted comment on page

  ######################################################################################################################
  @Positive @Docs @HQ
  Scenario: DF-026 Ensure user can add new public Doc
    Given user is at Company page
    And user clicks existing HQ
    And user clicks Docs & Files menu
    When user clicks add button
    And user clicks new Doc
    And user input Doc title
    And user input Doc content
    And user add subscriber
    And user clicks publish
    Then user is notified success message
    And user can see created Doc on the page

  @Positive @Docs @HQ
  Scenario: DF-027 Ensure user can edit Doc to private
    Given user is at Company page
    And user clicks existing HQ
    And user clicks Docs & Files menu
    When user clicks created Docs
    And user clicks option button
    And user clicks Edit button
    And user switch on private option
    And user clicks Publish Changes
    Then user is notified success message
    And user can see locked mark on the page

  @Positive @Docs @HQ
  Scenario: DF-028 Ensure user can delete created Doc
    Given user is at Company page
    And user clicks existing HQ
    And user clicks Docs & Files menu
    When user clicks created Docs
    And user clicks option button
    And user clicks Archive this button
    Then user is notified Doc is already archived


  @Negative @Docs @HQ
  Scenario: DF-029 Ensure user failed to add new Doc without filling Doc title
    Given user is at Company page
    And user clicks existing HQ
    And user clicks Docs & Files menu
    When user clicks add button
    And user clicks new Doc
    And user input Doc content
    And user add subscriber
    And user clicks publish
    Then user is notified title must be filled


  @Negative @Docs @HQ
  Scenario: DF-030 Ensure user failed to add new Doc without filling Doc content
    Given user is at Company page
    And user clicks existing HQ
    And user clicks Docs & Files menu
    When user clicks add button
    And user clicks new Doc
    And user input Doc title
    And user add subscriber
    And user clicks publish
    Then user is notified description must be filled


  @Positive @Docs @HQ
  Scenario: DF-031 Ensure user can add new private Doc
    Given user is at Company page
    And user clicks existing HQ
    And user clicks Docs & Files menu
    When user clicks add button
    And user clicks new Doc
    And user input Doc title
    And user input Doc content
    And user switch on private option
    And user clicks publish
    Then user is notified success message
    And user can see created Doc on the page
    And user can see locked mark on the page


  @Positive @Docs @HQ
  Scenario: DF-032 Ensure user can edit created Doc
    Given user is at Company page
    And user clicks existing HQ
    And user clicks Docs & Files menu
    When user clicks created Docs
    And user clicks option button
    And user clicks Edit button
    And user input new name
    And user input new Description
    And user clicks Publish Changes
    Then user is notified success message
    And user can see the changes on the page


  @Positive @Docs @HQ
  Scenario: DF-033 Ensure user can edit private Doc to public
    Given user is at Company page
    And user clicks existing HQ
    And user clicks Docs & Files menu
    When user clicks created Docs
    And user clicks option button
    And user clicks Edit button
    And user switch off private option
    And user clicks Publish Changes
    Then user is notified success message
    And user cannot see locked mark on the page


  @Positive @Docs @HQ
  Scenario: DF-034 Ensure user can add new Doc without setting subscriber
    Given user is at Company page
    And user clicks existing HQ
    And user clicks Docs & Files menu
    When user clicks add button
    And user clicks new Doc
    And user input Doc title
    And user input Doc content
    And user clicks publish
    Then user is notified success message
    And user can see created Doc on the page


  @Negative @Docs @HQ
  Scenario: DF-035 Ensure user failed to add new Doc when clicking cancel
    Given user is at Company page
    And user clicks existing HQ
    And user clicks Docs & Files menu
    When user clicks add button
    And user clicks new Doc
    And user clicks cancel or back button
    Then user is directed to Docs&Files page


  @Positive @Docs @HQ
  Scenario: DF-036 Ensure user can add cheers to Doc
    Given user is at Company page
    And user clicks existing HQ
    And user clicks Docs & Files menu
    When user clicks created Docs
    And user clicks cheers button
    And user input cheers words
    And user clicks done button
    Then user is notified success cheers message
    And user can see created cheers on Doc

  @Positive @Docs @HQ
  Scenario: DF-037 Ensure user can delete cheers on Doc
    Given user is at Company page
    And user clicks existing HQ
    And user clicks Docs & Files menu
    When user clicks created Docs
    And user clicks on created cheers
    And user clicks delete button
    Then user is notified success delete cheers message
    And user cannot see created cheers on Doc

  @Positive @Docs @HQ
  Scenario: DF-038 Ensure user can add comment on Doc
    Given user is at Company page
    And user clicks existing HQ
    And user clicks Docs & Files menu
    When user clicks created Docs
    And user clicks on comment section
    And user input comment
    And user clicks post button
    Then user is notified success message adding comment
    And user can see created comment on page

  @Positive @Docs @HQ
  Scenario: DF-039 Ensure user can edit existing comment on Doc
    Given user is at Company page
    And user clicks existing HQ
    And user clicks Docs & Files menu
    When user clicks created Docs
    And user clicks options on existing comment
    And user clicks edit button
    And user input edited comment
    And user clicks post button
    Then user is notified success message editing comment
    And user can see edited comment on page


  @Positive @Docs @HQ
  Scenario: DF-040 Ensure user can reply existing comment on Doc
    Given user is at Company page
    And user clicks existing HQ
    And user clicks Docs & Files menu
    When user clicks created Docs
    And user clicks reply on existing comment
    And user clicks on comment section
    And user input comment
    And user clicks post button
    Then user is notified success message adding reply
    And user can see created reply on page

  @Positive @Docs @HQ
  Scenario: DF-041 Ensure user can delete existing comment on Doc
    Given user is at Company page
    And user clicks existing HQ
    And user clicks Docs & Files menu
    When user clicks created Docs
    And user clicks options on existing comment
    And user clicks delete button
    And user confirm delete button
    Then user is notified delete comment success
    And user cannot see the deleted comment on page

  ######################################################################################################################

  @Positive @Docs @Project
  Scenario: DF-042 Ensure user can add new public Doc
    Given user is at Company page
    And user clicks existing Project
    And user clicks Docs & Files menu
    When user clicks add button
    And user clicks new Doc
    And user input Doc title
    And user input Doc content
    And user add subscriber
    And user clicks publish
    Then user is notified success message
    And user can see created Doc on the page

  @Positive @Docs @Project
  Scenario: DF-043 Ensure user can edit Doc to private
    Given user is at Company page
    And user clicks existing Project
    And user clicks Docs & Files menu
    When user clicks created Docs
    And user clicks option button
    And user clicks Edit button
    And user switch on private option
    And user clicks Publish Changes
    Then user is notified success message
    And user can see locked mark on the page

  @Positive @Docs @Project
  Scenario: DF-044 Ensure user can delete created Doc
    Given user is at Company page
    And user clicks existing Project
    And user clicks Docs & Files menu
    When user clicks created Docs
    And user clicks option button
    And user clicks Archive this button
    Then user is notified Doc is already archived


  @Negative @Docs @Project
  Scenario: DF-045 Ensure user failed to add new Doc without filling Doc title
    Given user is at Company page
    And user clicks existing Project
    And user clicks Docs & Files menu
    When user clicks add button
    And user clicks new Doc
    And user input Doc content
    And user add subscriber
    And user clicks publish
    Then user is notified title must be filled


  @Negative @Docs @Project
  Scenario: DF-046 Ensure user failed to add new Doc without filling Doc content
    Given user is at Company page
    And user clicks existing Project
    And user clicks Docs & Files menu
    When user clicks add button
    And user clicks new Doc
    And user input Doc title
    And user add subscriber
    And user clicks publish
    Then user is notified description must be filled


  @Positive @Docs @Project
  Scenario: DF-047 Ensure user can add new private Doc
    Given user is at Company page
    And user clicks existing Project
    And user clicks Docs & Files menu
    When user clicks add button
    And user clicks new Doc
    And user input Doc title
    And user input Doc content
    And user switch on private option
    And user clicks publish
    Then user is notified success message
    And user can see created Doc on the page
    And user can see locked mark on the page


  @Positive @Docs @Project
  Scenario: DF-048 Ensure user can edit created Doc
    Given user is at Company page
    And user clicks existing Project
    And user clicks Docs & Files menu
    When user clicks created Docs
    And user clicks option button
    And user clicks Edit button
    And user input new name
    And user input new Description
    And user clicks Publish Changes
    Then user is notified success message
    And user can see the changes on the page


  @Positive @Docs @Project
  Scenario: DF-049 Ensure user can edit private Doc to public
    Given user is at Company page
    And user clicks existing Project
    And user clicks Docs & Files menu
    When user clicks created Docs
    And user clicks option button
    And user clicks Edit button
    And user switch off private option
    And user clicks Publish Changes
    Then user is notified success message
    And user cannot see locked mark on the page


  @Positive @Docs @Project
  Scenario: DF-050 Ensure user can add new Doc without setting subscriber
    Given user is at Company page
    And user clicks existing Project
    And user clicks Docs & Files menu
    When user clicks add button
    And user clicks new Doc
    And user input Doc title
    And user input Doc content
    And user clicks publish
    Then user is notified success message
    And user can see created Doc on the page


  @Negative @Docs @Project
  Scenario: DF-051 Ensure user failed to add new Doc when clicking cancel
    Given user is at Company page
    And user clicks existing Project
    And user clicks Docs & Files menu
    When user clicks add button
    And user clicks new Doc
    And user clicks cancel or back button
    Then user is directed to Docs&Files page


  @Positive @Docs @Project
  Scenario: DF-052 Ensure user can add cheers to Doc
    Given user is at Company page
    And user clicks existing Project
    And user clicks Docs & Files menu
    When user clicks created Docs
    And user clicks cheers button
    And user input cheers words
    And user clicks done button
    Then user is notified success cheers message
    And user can see created cheers on Doc

  @Positive @Docs @Project
  Scenario: DF-053 Ensure user can delete cheers on Doc
    Given user is at Company page
    And user clicks existing Project
    And user clicks Docs & Files menu
    When user clicks created Docs
    And user clicks on created cheers
    And user clicks delete button
    Then user is notified success delete cheers message
    And user cannot see created cheers on Doc

  @Positive @Docs @Project
  Scenario: DF-054 Ensure user can add comment on Doc
    Given user is at Company page
    And user clicks existing Project
    And user clicks Docs & Files menu
    When user clicks created Docs
    And user clicks on comment section
    And user input comment
    And user clicks post button
    Then user is notified success message adding comment
    And user can see created comment on page

  @Positive @Docs @Project
  Scenario: DF-055 Ensure user can edit existing comment on Doc
    Given user is at Company page
    And user clicks existing Project
    And user clicks Docs & Files menu
    When user clicks created Docs
    And user clicks options on existing comment
    And user clicks edit button
    And user input edited comment
    And user clicks post button
    Then user is notified success message editing comment
    And user can see edited comment on page


  @Positive @Docs @Project
  Scenario: DF-056 Ensure user can reply existing comment on Doc
    Given user is at Company page
    And user clicks existing Project
    And user clicks Docs & Files menu
    When user clicks created Docs
    And user clicks reply on existing comment
    And user clicks on comment section
    And user input comment
    And user clicks post button
    Then user is notified success message adding reply
    And user can see created reply on page

  @Positive @Docs @Project
  Scenario: DF-057 Ensure user can delete existing comment on Doc
    Given user is at Company page
    And user clicks existing Project
    And user clicks Docs & Files menu
    When user clicks created Docs
    And user clicks options on existing comment
    And user clicks delete button
    And user confirm delete button
    Then user is notified delete comment success
    And user cannot see the deleted comment on page


  ##################################################################################################





