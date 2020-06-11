Feature: to validate login functionality
Background:
  Given enter the fb website
  
@Smoke  
Scenario Outline: to verify login with incorrect credentials.
When enter "<username>" and "<password>"
And click login
Then print login or not 


Examples:
 |username       |password|
 |anish@gmail.com|12345678|
 
  @Regression
 Scenario Outline: to verify login with incorrect credentials.
When enter "<username>" and "<password>"
And click login
Then print login or not 

Examples:
 |username       |password|
 |daniel@gmail.com|12345678|
 
 @Sanity 
 Scenario Outline: to verify login with incorrect credentials.
When enter "<username>" and "<password>"
And click login
Then print login or not 

Examples:
 |username       |password|
 |mathew@gmail.com|12345678|