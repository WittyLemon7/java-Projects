# Wall Paint
## Problem Statement
Create a program that calculates the amount of paint needed to cover a wall. The program should take the dimensions of the wall (height and width) and the coverage of the paint (square meters per liter) as inputs. It should detemine the no of buckets of paint needed, considering that each bucket contains a fixed amount of paint (e.g., 10 liters).
## Discussion
This problem involves calculating the area of the wall and determining how many buckets of paint are needed based on the coverage provided by the paint. The program should handle user input for the wall dimensions and paint coverage, perform the calculations, and display the result. It should also handle invalid inputs gracefully, ensuring that the user is prompted to enter valid dimensions and coverage values.
## Walkthrough
```java
/**
     * This program calculates the number of paint buckets needed to cover a wall area.
     * It provides three overloaded methods to handle different input scenarios.
     * The first method considers the wall dimensions, area covered by each bucket, and extra buckets.
     * The second method considers the wall dimensions and area covered by each bucket.
     * The third method considers only the total area and area covered by each bucket.
     */
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {// Check for valid input
            return -1; // Invalid input
        }

        double totalArea = width * height;// Calculate the total area of the wall
        double effectiveArea = totalArea - (extraBuckets * areaPerBucket);// Calculate the effective area to be painted

        if (effectiveArea <= 0) {
            return 0; // No buckets needed
        }

        return (int) Math.ceil(effectiveArea / areaPerBucket);
    }
    /**
     * Overloaded method to calculate the number of paint buckets needed without extra buckets.
     * It uses the wall dimensions and area covered by each bucket.
     */
    public static int getBucketCount(double width, double height, double areaPerBucket ) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {// Check for valid input
            return -1; // Invalid input
        }

        double totalArea = width * height;// Calculate the total area of the wall
        return (int) Math.ceil(totalArea / areaPerBucket);
    }
    /**
     * Overloaded method to calculate the number of paint buckets needed based on total area and area per bucket.
     * It does not consider extra buckets.
     */
    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0) {// Check for valid input
            return -1; // Invalid input
        }

        return (int) Math.ceil(area / areaPerBucket);//returns the number of buckets needed
    }
```
## Logic & Explanation
- **Input Handling**: The program checks if the inputs for width, height, area per
- bucket, and extra buckets are valid (greater than zero for dimensions and area, non-negative for extra buckets). If any input is invalid, it returns -1.
- **Area Calculation**: It calculates the total area of the wall by multiplying width and height. If extra buckets are provided, it calculates the effective area to be painted by subtracting the area covered by the extra buckets from the total area.
- **Bucket Calculation**: The program uses `Math.ceil` to round up the number of buckets needed, ensuring that even if there is a fraction of a bucket needed, it counts as a full bucket. It returns the calculated number of buckets as an integer.
- **Overloaded Methods**: The program provides three overloaded methods to handle different input scenarios:
  - The first method takes width, height, area per bucket, and extra buckets.
  - The second method takes width, height, and area per bucket (without extra buckets).
  - The third method takes only the total area and area per bucket (without extra buckets).
## Edge Cases
- **Negative or Zero Dimensions**: The program checks for negative or zero values for width, height, and area per bucket. If any of these values are invalid, it returns -1.
- **Zero Area**: If the total area is zero or negative, it returns 0, indicating that no buckets are needed.
- **Extra Buckets**: If the effective area to be painted is zero or negative after considering extra buckets, it returns 0, indicating that no buckets are needed.
## Related Concepts
- [[Area Calculation]]: Understanding how to calculate the area of a rectangle (width * height for the wall).
- [[Math.ceil]]: Using the `Math.ceil` method to round up the number of buckets needed, ensuring that any fraction of a bucket is counted as a full bucket.
- [[Overloading Methods]]: The program demonstrates method overloading to handle different input scenarios for calculating the number of paint buckets needed.

