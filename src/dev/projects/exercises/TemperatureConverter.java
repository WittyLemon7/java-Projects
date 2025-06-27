package dev.projects.exercises;

public class TemperatureConverter {

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    public static double fahrenheitToKelvin(double fahrenheit) {
        return celsiusToKelvin(fahrenheitToCelsius(fahrenheit));
    }

    public static double kelvinToFahrenheit(double kelvin) {
        return celsiusToFahrenheit(kelvinToCelsius(kelvin));
    }

    public static void main(String[] args) {
        // Your code to handle user input and display results
        System.out.println(celsiusToFahrenheit(10));
        System.out.println(fahrenheitToCelsius(32));
        System.out.println(celsiusToKelvin(32));
    }
}

