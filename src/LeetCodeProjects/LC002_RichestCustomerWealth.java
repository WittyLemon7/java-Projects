package LeetCodeProjects;



public class LC002_RichestCustomerWealth {
    public static void main(String[] args) {
        // Example usage
        LC002_RichestCustomerWealth solution = new LC002_RichestCustomerWealth();
        int[][] accounts = {
            {1, 2, 3},
            {3, 2, 1},
            {4, 5, 6}
        };
        int result = solution.maxWealth(accounts);
        System.out.println("Maximum Wealth: " + result); // Output: Maximum Wealth: 15
    }

    public int maxWealth(int[][]  accounts) {
        int maxWealthSoFar = 0; // Initialize the maximum wealth to 0

        // Iterate through each customer's accounts
        for (int[] customerAccounts : accounts) {
            int currentWealth = 0; // Initialize current wealth for the customer

            // Sum up the wealth in all accounts of the current customer
            for (int account : customerAccounts) {
                currentWealth += account;
            }

            // Update maxWealthSoFar if the current customer's wealth is greater
            if (currentWealth > maxWealthSoFar) {
                maxWealthSoFar = currentWealth;
            }
        }

        return maxWealthSoFar; // Return the maximum wealth found
    }
    //Time Complexity: O(m * n) where m is the number of customers
    // and n is the number of accounts per customer.
    //Space Complexity: O(1) since we are using a constant amount of space for variables.
}
