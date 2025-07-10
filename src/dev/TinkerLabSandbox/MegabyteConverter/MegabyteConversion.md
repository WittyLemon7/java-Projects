# Megabyte Conversion
## Problem Statement
Convert a given number of kilobytes (KB) to megabytes (MB) and gigabytes (GB).
## Discussion
This problem is a straightforward exercise in understanding data size conversions, specifically from kilobytes to megabytes and gigabytes. It helps in reinforcing the concepts of basic arithmetic operations and unit conversions.
## Walkthrough
```java
 //method to convert kilobytes to megabytes and remaining kilobytes
    public static void printMegabytesAndKilobytes(int kilobytes) {
        if (kilobytes < 0) {// Check for negative values
            System.out.println("Invalid Value");
        } else {
            int megabytes = kilobytes / 1024;// Convert kilobytes to megabytes
            int remainingKilobytes = kilobytes % 1024;// Calculate remaining kilobytes
            System.out.println(kilobytes + " KB = " + megabytes + " MB and " + remainingKilobytes + " KB");
        }
    }
    //method to convert megabytes to gigabytes and remaining megabytes
    public static void printGigabytesAndMegabytes(int megabytes) {
        if (megabytes < 0) {// Check for negative values
            System.out.println("Invalid Value");
        } else {
            int gigabytes = megabytes / 1024;// Convert megabytes to gigabytes
            int remainingMegabytes = megabytes % 1024;// Calculate remaining megabytes
            System.out.println(megabytes + " MB = " + gigabytes + " GB and " + remainingMegabytes + " MB");
        }
    }
```
## Logic & Explanation
- **Conversion Logic**: 
  - To convert kilobytes to megabytes, divide the number of kilobytes by 1024.
  - To find the remaining kilobytes after conversion, use the modulus operator (`%`) with 1024.
  - Similarly, to convert megabytes to gigabytes, divide the number of megabytes by 1024 and use the modulus operator to find the remaining megabytes.
  - The conversion is based on the fact that 1 MB = 1024 KB and 1 GB = 1024 MB.
## Edge Cases
- **Negative Values**: If the input kilobytes or megabytes is negative, the method should print "Invalid Value" to indicate that negative values are not acceptable.
- **Zero Input**: If the input is zero, the method should correctly handle it and print "0 KB = 0 MB and 0 KB" or "0 MB = 0 GB and 0 MB".
## Related Concepts
- [[Arithmetic Operations]]: Understanding basic arithmetic operations is essential for manipulating numbers in this problem.
- [[Unit Conversion]]: This problem is a fundamental exercise in unit conversion, demonstrating how to convert between different data sizes.
- [[Modulus Operator]]: The modulus operator is crucial for determining the remaining units after conversion, which is a key aspect of this problem.
- [[Conditionals]]: The use of `if` statements is fundamental in checking for negative values and ensuring valid input.
