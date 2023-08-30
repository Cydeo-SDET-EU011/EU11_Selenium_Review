Feature: Window Handle and Iframes


  Scenario: Window Handle and Iframes
    Given user go to the url
    When user get current window handle
    Then It must be "first" window handle
    When user click webpage
    And get all handles and put them in a list
    And print handles in console
    Then the handles count should be 2
    When switch to second window
    And user get current window handle
    Then It must be "second" window handle
    And check the upper left side logo in the second window
    When go back (Switch) to the first window
    And user get current window handle
    Then It must be "first" window handle
    And validate run button text contains "Run >"



