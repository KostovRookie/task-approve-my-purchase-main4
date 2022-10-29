# ApproveMyPurchase
 
Johnny was asked to develop a small program and is asking you for help.
His company needs a tool for approving requests for purchases. For example, if someone asks for a new laptop, the request will be considered and if it is within a specific limit, it will be purchased for them.
 
Johnny wrote some code, but it's not finished and his deadline is approaching.
 
Your task is implementing all the functionalities and editing Johnny's code to follow the **SOLID** and **object-oriented** principles.
 
This table contains all manager limits in each category (amounts are INCLUSIVE);
 
|Type          |Manager|Director|Vice President|President|
|--------------|------|------|------|------|
| Consumables  | 300  | 500  | 700  | 1000 |
| Clerical     | 500  | 1000 | 1500 | 2000 |
| Gadgets      | 1000 | 1500 | 2000 | 3000 |
| Gaming       | 3000 | 3500 | 4500 | 5000 |
| PC           | 5000 | 6000 | 6500 | 8000 |


 //////
 
My solution:
First, I tried to optimize the code, clean it up and make it nicer to work with.
I have corrected a few errors in the pricing and calculations of the products to be approved.
I implemented several new if else constructs to make the program complete.
There is also a method that considers the case where the board of directors has to decide what to do with the large sums.
In this case, I set a random boolean variable that gives me a random result of what the directors will decide whether to approve or disapprove the transaction.

