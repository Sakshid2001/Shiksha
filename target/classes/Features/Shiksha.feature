Feature: Q&A section and prefrences forms of shiksha.com

  @Question
  Scenario: Ask a Question for a Selected Course
    Given I am on the Shiksha homepage
    When I click on the course
    And I navigate to the Q&A section for that course
    And I click on ask question button
    When I type my question in the provided field
      | what is the course about? |
    And I click on send button
    Then I should get the answer

  @Answer
  Scenario Outline: Answer a posted question
    Given I am on the Q&A section
    When I select a question to answer
    And I write my <answer>
    And I post the answer
    Then the answer should be posted

    Examples: 
      | answer                                                                                         |
      | East Point Group Of Institutions MBA fees for all MBA specialisations is 242,000 USD (Yearly). |

  @Education
  Scenario: Add education preferences and save
    Given I am on the education preferences page
    When I click on the Create New option
    And I select the course level
    And I select the mode of study
    And I select the stream
    And I select the course name
    And I select the year of admission
      | 2024 |
    And I select the city
      | Pune |
    And I select the budget
    And I click on save button
    Then The details are saved successfully

  @Exam
  Scenario Outline: Add exam preferences and save
    Given I am on the exam preferences page
    When I click on the Create New option on exam page
    And I select the exam name
    And I select the exam group
    And I select the score type
    And I enter the score "<score>"
    And I select the score status
    And I select the category
    And I select the domicile
    And I click on the save button
    Then details are saved

    Examples: 
      | score |
      |    85 |

  @Defect
  Scenario: Mark the notification as read by clicking on mark as read
    Given I am on the shiksha homepage
    When I click on notification bell option
    And I click on mark as read
    Then the notification should be marked as read.
