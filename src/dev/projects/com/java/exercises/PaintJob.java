package dev.projects.com.java.exercises;

public class PaintJob {
    public  static  int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0){
            return -1;
        }//closing if
        double area = width * height;
        double bucketsNeeded = Math.ceil(area / areaPerBucket);
        return (int) (bucketsNeeded - extraBuckets);
    }//closing method

    public static void main(String[] args) {
        System.out.println(getBucketCount(3.4, 2.1, 1.5, 2));

    }
}
