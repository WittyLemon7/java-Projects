# Input Validator Util
A lightweight utility classfor validating common input types in java -- designes to catch `EDGE CASES` early, simplify logic & promote clean code across projects.

##  Purpose
The `InputValidator` class centralizes input validation logic for:
- Numbers (range checks, non-negativity)
- Strings (emptiness, numeric format)
- Arrays (null or empty)
- Characters (digit checks)

It helps ensure that input data is **safe, expected, and clean** before it reaches core logic.
## Method Overview
| Method                          | Description                                      |
|---------------------------------|--------------------------------------------------|
| `isNonNegative(int number)`     | Checks if a number is ≥ 0                        |
| `isInRange(int number, min, max)`| Validates if number falls within a range        |
| `isEmpty(String str)`           | Checks if a string is null or blank             |
| `isNumeric(String str)`         | Validates if a string represents a number       |
| `isEmptyArray(int[] arr)`       | Checks if an array is null or has no elements   |
| `isDigit(char ch)`              | Checks if a character is a digit (0–9)          |

---
## Example Usage
```java
import dev.Utils.InputValidator.InputValidator;

```java
if (!InputValidator.isNonNegative(radius)) {
    System.err.println("Radius cannot be negative");
}

if (InputValidator.isEmpty(userName)) {
    System.out.println("Username is required");
}

if (InputValidator.isNumeric(input)) {
    double value = Double.parseDouble(input);
}
```

