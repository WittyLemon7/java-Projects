package dev.projects.RichestCustomer;

public class RichestCustomer {
    public static void main(String[] args) {

        // Example accounts array
        int[][] accounts = {
            {1, 2, 3},
            {3, 2, 1},
            {4, 5, 6}
        };

        // Create an instance of RichestCustomer
        RichestCustomer rc = new RichestCustomer();

        // Call the maximumWealth method and print the result
        int maxWealth = rc.maximumWealth(accounts);
        System.out.println("The maximum wealth is: " + maxWealth);

    }

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
