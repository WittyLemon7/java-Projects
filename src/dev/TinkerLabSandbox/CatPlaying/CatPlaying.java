package dev.TinkerLabSandbox.CatPlaying;

public class CatPlaying {
    public static void main(String[] args) {

        // Example usage of the isCatPlaying method
        boolean isSummer = true;
        int temperature = 30;

        boolean result = isCatPlaying(isSummer, temperature);
        System.out.println("Is the cat playing? " + result);

        // Additional test cases
        System.out.println(isCatPlaying(false, 20)); // Expected: false

    }
    public static boolean isCatPlaying(boolean summer, int temperature) {
        // Check if the cat is playing based on the temperature and season
        if (summer) {
            return temperature >= 25 && temperature <= 45; // Summer range
        } else {
            return temperature >= 25 && temperature <= 35; // Non-summer range
        }
    }
}
