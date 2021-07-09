Feature: test

Background:

* url 'https://reqres.in/'

Scenario: Get call

Given path 'api/users/5'
When method Get
Then status 200
Then print response