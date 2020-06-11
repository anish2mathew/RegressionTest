Feature: to validate signup functionality
Background:
   Given enter the fb page
   
@Regression   
Scenario Outline: to verify signup working or not 
When enter "<firstname>","<lastname>","<password>"
And click signup
Then print sigining up or not

Examples:
  |firstname|lastname|password|
  |anish    |mathew  |456789  |