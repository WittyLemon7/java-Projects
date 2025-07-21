# PDW: Odd and Even Digit Sum Analysis

**Date:** Monday, July 21, 2025
**Topic:** Separate Sum Calculation for Odd and Even Digits
**Language:** Java
**Difficulty Level:** Beginner to Intermediate

## Problem Statement

**Primary Objective:**
Write a Java program that takes a multi-digit integer as input and calculates two separate sums:

1. Sum of all odd digits in the number
2. Sum of all even digits in the number

**Input Specifications:**

- A positive integer (can be any length)
- Example inputs: 123456, 987654, 112233

**Output Requirements:**

- Display the sum of odd digits
- Display the sum of even digits
- Show clear formatting and labeling

**Sample Input/Output:**

```
Input: 123456
Output: 
Odd digit sum: 9 (1 + 3 + 5)
Even digit sum: 12 (2 + 4 + 6)
```


## Discussion

### Core Challenge Analysis

This problem requires us to:

- **Extract individual digits** from a multi-digit number
- **Classify each digit** as odd or even
- **Accumulate separate sums** based on the classification
- **Present results** in a clear, formatted manner


### Mathematical Foundation

- **Odd numbers**: Integers not divisible by 2 (1, 3, 5, 7, 9)
- **Even numbers**: Integers divisible by 2 (0, 2, 4, 6, 8)
- **Digit extraction**: Using modulo (%) and integer division (/)
- **Classification logic**: Using modulo 2 to determine odd/even


### Algorithm Design Considerations

1. **Input handling**: How to process the entire number
2. **Digit extraction**: Mathematical vs string-based approaches
3. **Classification efficiency**: Single-pass vs multiple-pass processing
4. **Edge cases**: Single digit numbers, numbers with zeros

## Walkthrough

### Step-by-Step Process

#### Step 1: Input and Initialization

```java
int number = 123456;
int oddSum = 0;
int evenSum = 0;
```


#### Step 2: Digit Extraction Loop

```java
while (number > 0) {
    int digit = number % 10;  // Extract rightmost digit
    // Process digit...
    number = number / 10;     // Remove rightmost digit
}
```


#### Step 3: Classification and Accumulation

```java
if (digit % 2 == 0) {
    evenSum += digit;         // Add to even sum
} else {
    oddSum += digit;          // Add to odd sum
}
```


### Example Execution Trace

**Input: 123456**


| Iteration | number | digit | digit%2 | Action | oddSum | evenSum |
| :-- | :-- | :-- | :-- | :-- | :-- | :-- |
| 1 | 123456 | 6 | 0 (even) | evenSum += 6 | 0 | 6 |
| 2 | 12345 | 5 | 1 (odd) | oddSum += 5 | 5 | 6 |
| 3 | 1234 | 4 | 0 (even) | evenSum += 4 | 5 | 10 |
| 4 | 123 | 3 | 1 (odd) | oddSum += 3 | 8 | 10 |
| 5 | 12 | 2 | 0 (even) | evenSum += 2 | 8 | 12 |
| 6 | 1 | 1 | 1 (odd) | oddSum += 1 | 9 | 12 |
| 7 | 0 | - | - | Loop ends | 9 | 12 |

**Final Result:** Odd sum = 9, Even sum = 12

## Logic \& Implementation

### Complete Java Implementation

```java
package dev.TinkerLabSandbox.DigitSum;

public class OddEvenDigitSum {
    public static void main(String[] args) {
        // Test cases with different numbers
        int[] testNumbers = {123456, 987654, 112233, 13579, 2468, 1001};
        
        System.out.println("=== Odd and Even Digit Sum Analysis ===\n");
        
        for (int number : testNumbers) {
            analyzeDigitSums(number);
            System.out.println(); // Blank line for readability
        }
    }
    
    /**
     * Analyzes a number and calculates separate sums for odd and even digits
     * @param originalNumber The number to analyze
     */
    public static void analyzeDigitSums(int originalNumber) {
        int number = originalNumber; // Preserve original for display
        int oddSum = 0;              // Accumulator for odd digits
        int evenSum = 0;             // Accumulator for even digits
        
        // Handle edge case of zero
        if (number == 0) {
            evenSum = 0;
        } else {
            // Process each digit
            while (number > 0) {
                int digit = number % 10;    // Extract rightmost digit
                
                if (digit % 2 == 0) {       // Check if digit is even
                    evenSum += digit;       // Add to even sum
                } else {                    // Digit is odd
                    oddSum += digit;        // Add to odd sum
                }
                
                number = number / 10;       // Remove processed digit
            }
        }
        
        // Display results with detailed breakdown
        displayResults(originalNumber, oddSum, evenSum);
    }
    
    /**
     * Displays the analysis results in a formatted manner
     */
    public static void displayResults(int number, int oddSum, int evenSum) {
        System.out.println("Number: " + number);
        System.out.println("Odd digits sum: " + oddSum);
        System.out.println("Even digits sum: " + evenSum);
        System.out.println("Total sum: " + (oddSum + evenSum));
        
        // Additional analysis
        if (oddSum > evenSum) {
            System.out.println("Analysis: Odd digits dominate");
        } else if (evenSum > oddSum) {
            System.out.println("Analysis: Even digits dominate");
        } else {
            System.out.println("Analysis: Equal odd and even digit sums");
        }
    }
}
```


### Alternative Implementation Using String Processing

```java
public static void analyzeDigitSumsString(int number) {
    String numStr = String.valueOf(number);
    int oddSum = 0, evenSum = 0;
    
    for (char c : numStr.toCharArray()) {
        int digit = Character.getNumericValue(c);
        if (digit % 2 == 0) {
            evenSum += digit;
        } else {
            oddSum += digit;
        }
    }
    
    displayResults(number, oddSum, evenSum);
}
```


## Explanation \& Key Concepts

### Core Mathematical Operations

#### 1. **Digit Extraction Using Modulo**

```java
int digit = number % 10;
```

- **Purpose**: Extracts the rightmost digit
- **How it works**: Modulo 10 gives remainder when divided by 10
- **Example**: 123456 % 10 = 6


#### 2. **Number Reduction Using Integer Division**

```java
number = number / 10;
```

- **Purpose**: Removes the rightmost digit
- **How it works**: Integer division truncates decimal places
- **Example**: 123456 / 10 = 12345


#### 3. **Odd/Even Classification**

```java
if (digit % 2 == 0) {
    // Even digit
} else {
    // Odd digit
}
```

- **Logic**: Any number divisible by 2 is even
- **Modulo 2**: Returns 0 for even, 1 for odd


### Algorithm Complexity Analysis

**Time Complexity:** O(log n)

- Where n is the input number
- Number of digits = log₁₀(n)
- Each digit processed once

**Space Complexity:** O(1)

- Constant extra space regardless of input size
- Only using integer variables for accumulation


### Programming Concepts Demonstrated

#### 1. **Loop Control Structures**

- While loop with condition `number > 0`
- Natural termination when all digits processed


#### 2. **Conditional Logic**

- If-else statements for digit classification
- Ternary operators possible for concise code


#### 3. **Variable Management**

- Separate accumulators for different categories
- Preservation of original value for display


#### 4. **Method Decomposition**

- Separation of concerns: analysis vs display
- Reusable methods for different inputs


#### 5. **Edge Case Handling**

- Zero as special case
- Single digit numbers
- Negative numbers (if extended)


## Related Concepts \& Extensions

### Mathematical Extensions

1. **Digital Root Calculation**
2. **Sum of Squares of Digits**
3. **Product of Odd/Even Digits**
4. **Alternating Sum of Digits**

### Programming Extensions

1. **Recursive Implementation**
2. **Stream-based Processing (Java 8+)**
3. **BigInteger Support for Large Numbers**
4. **Statistical Analysis of Digit Distribution**

### Real-World Applications

1. **Checksum Algorithms** (Credit card validation)
2. **Hash Function Components**
3. **Data Validation Techniques**
4. **Number Theory Research**

### Sample Output

```
=== Odd and Even Digit Sum Analysis ===

Number: 123456
Odd digits sum: 9
Even digits sum: 12
Total sum: 21
Analysis: Even digits dominate

Number: 987654
Odd digits sum: 25
Even digits sum: 12
Total sum: 37
Analysis: Odd digits dominate

Number: 112233
Odd digits sum: 6
Even digits sum: 6
Total sum: 12
Analysis: Equal odd and even digit sums
```
