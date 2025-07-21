# SumOddMultiplyEven - Mathematical Operations Program

## Problem Statement

The program addresses two fundamental mathematical operations on integer ranges:

1. **Sum of Odd Numbers**: Calculate the sum of all odd numbers within a specified range
2. **Product of Even Numbers**: Calculate the product of all even numbers within a specified range

### Key Requirements:

- Handle arbitrary integer ranges (start to end)
- Provide input validation for edge cases
- Prevent integer overflow for large products
- Maintain accuracy for mathematical computations


## Discussion

### Core Challenges Addressed:

**1. Integer Overflow Prevention**

- The product of even numbers grows exponentially (2 × 4 × 6 × 8... = massive numbers)
- Standard `int` and `long` types have fixed limits that are quickly exceeded
- Solution: Use `BigInteger` for unlimited precision arithmetic

**2. Input Validation**

- Invalid ranges (start > end, negative values) can cause errors
- Proper validation ensures robust program behavior
- Clear error messages guide users toward correct usage

**3. Mathematical Accuracy**

- Zero handling in multiplication (0 × anything = 0)
- Proper initialization values (sum starts at 0, product starts at 1)
- Correct odd/even identification logic


### Design Decisions:

**Method Naming Convention:**

- `isEven()`: Clear, single-purpose method for even number detection
- `sumOdd()`: Descriptive name indicating operation and target numbers
- `multiplyEven()`: Explicit about both operation and number type

**Return Types:**

- `sumOdd()`: Returns `int` (sums grow slower than products)
- `multiplyEven()`: Returns `BigInteger` (products grow extremely fast)


## Walkthrough

### Program Flow:

```
1. Main Method Execution
   ├── Test sumOdd(1, 100)
   ├── Test multiplyEven(1, 20)
   └── Edge Case Testing
       ├── sumOdd(-1, 100)
       └── sumOdd(100, 1)

2. Method Execution Pattern
   ├── Input Validation
   ├── Loop Through Range
   ├── Conditional Processing
   └── Return Result
```


### Method Interaction:

```
sumOdd() ──────┐
               ├── calls ──> isEven()
multiplyEven() ┘
```

Both primary methods rely on the `isEven()` helper method for consistent number classification.

## Logic \& Explanation

### 1. Even Number Detection

```java
public static boolean isEven(int number) {
    return number % 2 == 0;
}
```

**Logic:**

- Uses modulo operator (`%`) to find remainder after division by 2
- Even numbers have remainder 0 when divided by 2
- Odd numbers have remainder 1 when divided by 2


### 2. Sum of Odd Numbers

```java
public static int sumOdd(int start, int end) {
    if (end < start || start < 0) {
        System.out.println("Invalid range provided...");
        return -1;
    }
    
    int sum = 0;
    for (int i = start; i <= end; i++) {
        if (!isEven(i)) {
            sum += i;
        }
    }
    return sum;
}
```

**Logic Flow:**

1. **Validation**: Ensures `start ≥ 0` and `end ≥ start`
2. **Initialization**: `sum = 0` (additive identity)
3. **Iteration**: Check each number in range
4. **Condition**: `!isEven(i)` identifies odd numbers
5. **Accumulation**: Add odd numbers to running sum

**Example**: `sumOdd(1, 10)`

- Range: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
- Odd numbers: 1, 3, 5, 7, 9
- Sum: 1 + 3 + 5 + 7 + 9 = 25


### 3. Product of Even Numbers (BigInteger Implementation)

```java
public static BigInteger multiplyEven(int start, int end) {
    if (end < start || start < 0) {
        System.out.println("Invalid range provided...");
        return BigInteger.valueOf(-1);
    }
    
    BigInteger product = BigInteger.ONE;
    for (int i = start; i <= end; i++) {
        if (isEven(i)) {
            if (i == 0) continue;
            product = product.multiply(BigInteger.valueOf(i));
        }
    }
    return product;
}
```

**Logic Flow:**

1. **Validation**: Same range validation as sumOdd
2. **Initialization**: `product = BigInteger.ONE` (multiplicative identity)
3. **Iteration**: Check each number in range
4. **Condition**: `isEven(i)` identifies even numbers
5. **Zero Skip**: `if (i == 0) continue` prevents zero product
6. **Multiplication**: Use BigInteger arithmetic for overflow protection

**BigInteger Key Operations:**

- `BigInteger.ONE`: Creates BigInteger with value 1
- `BigInteger.valueOf(int)`: Converts primitive int to BigInteger
- `product.multiply(BigInteger)`: Immutable multiplication (returns new object)

**Example**: `multiplyEven(1, 8)`

- Range: 1, 2, 3, 4, 5, 6, 7, 8
- Even numbers: 2, 4, 6, 8
- Product: 2 × 4 × 6 × 8 = 384


### 4. Edge Case Handling

**Invalid Range Cases:**

- `start < 0`: Negative starting points not allowed
- `end < start`: Reversed ranges not logical
- Both cases return `-1` as error indicator

**Zero Handling:**

- In multiplication: Skip zero to avoid making entire product zero
- In addition: Zero values don't affect the sum (can be included)


### 5. Overflow Prevention Strategy

**Why BigInteger for Products:**

```
Regular int max value: 2,147,483,647
multiplyEven(1, 20) = 670,442,572,800  ← Exceeds int limit!
```

**BigInteger Benefits:**

- **Unlimited precision**: No overflow possible
- **Exact arithmetic**: No floating-point approximation errors
- **Immutable objects**: Thread-safe and predictable behavior


## Test Cases \& Expected Results

| Method Call | Expected Output | Explanation |
| :-- | :-- | :-- |
| `sumOdd(1, 100)` | 2500 | Sum of odd numbers 1-100 |
| `multiplyEven(1, 20)` | 670442572800 | Product of even numbers 1-20 |
| `sumOdd(-1, 100)` | -1 | Error: negative start |
| `sumOdd(100, 1)` | -1 | Error: reversed range |

This implementation provides a robust, mathematically accurate solution for range-based arithmetic operations while handling edge cases and preventing common programming pitfalls.