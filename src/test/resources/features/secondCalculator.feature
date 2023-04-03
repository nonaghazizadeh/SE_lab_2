@tag
Feature: SecondCalculator

  Scenario: reverse integer
    Given integer 4 as input
    When the operator is rvs
    Then I expect the result 0.25


  Scenario: calc square root of integer
    Given integer 4 as input
    When the operator is sqr
    Then I expect the result 2

  Scenario Outline: sqr and rvs
    Given integer <input> as input
    When the operator is <opt>
    Then I expect the result <result>
    Examples:
      | input | opt     | result   |
      | 4     | rvs     | 0.25     |
      | 4     | sqr     | 2        |
      | 1     | rvs     | 1.0      |
      | -2    | rvs     | -0.5     |
      | -4    | sqr     | NaN      |
      | 5     | sqr     | 2.236068 |
      | 0     | sqr     | 0        |
      | 0     | rvs     | Infinity |