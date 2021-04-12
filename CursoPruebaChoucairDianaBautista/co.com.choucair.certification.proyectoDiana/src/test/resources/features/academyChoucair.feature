#Autor Diana BAUTISTA
@stories
Feature: Academy Choucair As a user, I want to learn how to automate in screamplay al the Choucair Academy with the automation course

  @scenario1
  Scenario Outline: Search for a automation course
    Given than Diana wants to learn automation at the academy Choucair
    | strUser     |  strPassword   |
    | <strUser>   |  <strPassword> |
    When she search for the course  on the choucair academy platform
      | strCourse                         |
      | <strCourse>  |
    Then she finds the course called
      | strCourse                         |
      | <strCourse>  |

    Examples:
      | strUser     |  strPassword   | strCourse                         |
      | 1072648054  |  Choucair2021* | ISTQB - Test Automation Engineer  |




