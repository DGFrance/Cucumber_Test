Feature: Kumparan Automation


  @Registration
  Scenario Outline: Register on Kumparan
    Given I Open Kumparan web Login/Register
    And I am Register as the <option> user
    When i input the username and password <negative>
    And  I input the username and password <positive>
    Then i will registered as Kumparan User

   Examples:
    |option|positive|negative|
    |Facebook|FB Positive|FB Negative|
    |GooglePlus|G+ Positive|G+ Negative|


    @Comment
    Scenario Outline: Write Comment on any Article
      Given I Open Kumparan web
      And  I Open any Article
      When I write a Comment
      And Post the Comment <PostComment>
      Then The Comment will posted on Recent

      Examples:
      |PostComment|
      |notRegistered|
      |Registered|