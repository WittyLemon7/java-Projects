package dev.TinkerLabSandbox.WallPaintJob;

public class WallPaint {
    public static void main(String[] args) {

        // Example usage of the getBucketCount methods
        System.out.println(getBucketCount(3.4, 2.1, 1.5, 2)); // Should return 3
        System.out.println(getBucketCount(3.4, 2.1, 1.5)); // Should return 5
        System.out.println(getBucketCount(6.0, 2.0)); // Should return 3
        System.out.println(getBucketCount(-3.4, 2.1, 1.5)); // Should return -1 (invalid input)
    }
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
}
