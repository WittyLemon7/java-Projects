# Palindrome Numbers in Java

## Overview

This Java program demonstrates how to check if a number is a palindrome. A palindrome number reads the same forwards and backwards (e.g., 121, 12321, 1001).

## Code Structure

### Package Declaration

```java
package dev.TinkerLabSandbox.Palindrome;
```

- Organizes the code into a package hierarchy
- Follows Java naming conventions with reverse domain notation


### Main Class

```java
public class PalindromeNumbers {
    // Class implementation
}
```

- Public class that contains our palindrome checking logic
- Class name matches the filename (Java requirement)


## Main Method

### Method Signature

```java
public static void main(String[] args)
```

- **`public`**: Accessible from anywhere
- **`static`**: Can be called without creating an instance
- **`void`**: Returns nothing
- **`String[] args`**: Command-line arguments (not used in this program)


### Test Data

```java
int[] numbers = {121, 12321, 123, 45654, 78987, 1001, 123456};
```

- Array containing test numbers
- Mix of palindromes and non-palindromes for comprehensive testing


### Processing Loop

```java
for (int number : numbers) {
    if (isPalindrome(number)) {
        System.out.println(number + " is a palindrome.");
    } else {
        System.out.println(number + " is not a palindrome.");
    }
}
```

- **Enhanced for loop** (for-each): Iterates through each number
- Calls `isPalindrome()` method for each number
- Prints appropriate message based on result


## Palindrome Detection Algorithm

### Method Signature

```java
public static boolean isPalindrome(int number)
```

- **`static`**: Can be called without object instantiation
- **`boolean`**: Returns true/false
- **`int number`**: The number to check


### Algorithm Steps

#### 1. Store Original Number

```java
int originalNumber = number;
```

- Preserves the original value for final comparison
- `number` variable will be modified during processing


#### 2. Initialize Reversed Number

```java
int reversedNumber = 0;
```

- Will accumulate digits in reverse order
- Starts at 0 and builds up


#### 3. Number Reversal Logic

```java
while (number > 0) {
    int digit = number % 10;              // Extract last digit
    reversedNumber = reversedNumber * 10 + digit;  // Build reversed number
    number /= 10;                         // Remove last digit
}
```

**Step-by-step breakdown for number 121:**


| Step | number | digit | reversedNumber | Calculation |
| :-- | :-- | :-- | :-- | :-- |
| 1 | 121 | 1 | 1 | 0×10 + 1 = 1 |
| 2 | 12 | 2 | 12 | 1×10 + 2 = 12 |
| 3 | 1 | 1 | 121 | 12×10 + 1 = 121 |
| 4 | 0 | - | 121 | Loop ends |

#### 4. Mathematical Operations Explained

**Modulo operator (`%`):**

- `121 % 10 = 1` (remainder when 121 is divided by 10)
- Gets the rightmost digit

**Integer division (`/`):**

- `121 / 10 = 12` (integer division truncates decimal)
- Removes the rightmost digit

**Building reversed number:**

- `reversedNumber * 10 + digit`
- Shifts existing digits left and adds new digit on right


#### 5. Final Comparison

```java
return originalNumber == reversedNumber;
```

- Compares original number with its reversed version
- Returns `true` if equal (palindrome), `false` otherwise


## Example Execution

### For number 12321 (palindrome):

1. **Original**: 12321
2. **Reversal process**:
    - Extract 1: reversed = 1
    - Extract 2: reversed = 12
    - Extract 3: reversed = 123
    - Extract 2: reversed = 1232
    - Extract 1: reversed = 12321
3. **Result**: 12321 == 12321 → `true`

### For number 123 (not palindrome):

1. **Original**: 123
2. **Reversal process**:
    - Extract 3: reversed = 3
    - Extract 2: reversed = 32
    - Extract 1: reversed = 321
3. **Result**: 123 == 321 → `false`

## Expected Output

```
Palindrome Numbers:
121 is a palindrome.
12321 is a palindrome.
123 is not a palindrome.
45654 is a palindrome.
78987 is a palindrome.
1001 is a palindrome.
123456 is not a palindrome.
```


## Key Programming Concepts Demonstrated

1. **Method Decomposition**: Separating palindrome logic into its own method
2. **Algorithm Design**: Step-by-step approach to number reversal
3. **Loop Control**: Using while loop with proper termination condition
4. **Mathematical Operations**: Modulo and integer division
5. **Boolean Logic**: Returning true/false based on comparison
6. **Array Processing**: Iterating through test data
7. **Output Formatting**: Clear, readable results

## Time and Space Complexity

- **Time Complexity**: O(log n) where n is the input number
    - Number of digits determines loop iterations
- **Space Complexity**: O(1) - constant space regardless of input size

This implementation provides an efficient and clear solution for palindrome number detection using fundamental programming concepts.

