**`TINKER_Array_MinimumElement.md`**

# 🧩 TINKER_Array_MinimumElement

## 📌 Problem
Find the minimum element in a given integer array without using built-in sorting.

## 💬 Discussion
This challenge solidifies your understanding of:
- Arrays and indexing
- Loops (`for`, `enhanced for`)
- Conditional logic
- Edge-case handling (empty array, negative numbers)

## 🧪 Walkthrough
```java
public class TINKER_Array_MinimumElement {
    public static int findMin(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty.");
        }

        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
```

## ➡️ Edge Cases
- Empty Arrays should throw an EXCEPTION.
- All elements EQUAL

## 🔂 Use Case
- Pre-processing data
- Real world decision making, eg; find lowest, minimum etc.

## 🔗 Related Concepts
- [[Java_Arrays_Basics]] – underpins array traversal logic used here



