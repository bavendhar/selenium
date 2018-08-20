Feature: deal with login 
@sanity
Scenario Outline:


And typeleaftap username as <username> 
And typeleaftap password as <password>
When login button in leaftap


Examples:
|username|password|
|DemoSalesManager|crmsfa|
|DemoCSR|crmsfa|
