## Richest Customer
 This project is designed to identify the richest customer based on their transactions. The goal is to analyze transaction data and determine which customer has the highest total transaction amount.
 
## Problem Statement
Given a list of transactions where each transaction consists of a customer ID and an amount, write a program to find the customer with the highest total transaction amount.

## Discussion
This problem is a common exercise in data analysis and can be solved using various programming techniques. It helps in understanding how to manipulate and analyze data structures, such as lists or arrays, and how to aggregate values based on specific criteria.

## Walkthrough
```java
 public  int maximumWealth(int[][] accounts) {
        // Initialize the maximum wealth to 0
        int maxWealth = 0;

        // Iterate through each customer's accounts
        for (int[] account : accounts) {
            // Calculate the sum of the current customer's accounts
            int currentWealth = 0;
            for (int money : account) {//
                currentWealth += money;// Add the money from each account
                // to the current wealth
            }
            // Update the maximum wealth if the current wealth is greater
            maxWealth = Math.max(maxWealth, currentWealth);
        }

        return maxWealth;
    }
}
```

## Logic & Explanation
- **Initialization**: The method starts by initializing a variable `maxWealth` to 0, which will hold the maximum wealth found so far.
- **Iterating through Accounts**: The outer loop iterates through each customer's accounts, represented as an array of integers.
- **Calculating Current Wealth**: For each customer, an inner loop calculates the total wealth by summing up the amounts in their accounts.

## Edge Cases
- **Empty Accounts**: If the input array is empty, the method should return 0, as there are no customers.
- **Single Customer**: If there is only one customer, the method should return their total wealth.
- **Negative Values**: If any account has a negative value, it should be handled correctly, ensuring that the total wealth reflects the actual amounts.

## Related Concepts
- [[Java_Arrays_Basics]] – This concept underpins the array manipulation logic used here, including indexing and iteration techniques.

