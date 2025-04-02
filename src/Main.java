import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                boolean continueConversion = true;
                while (continueConversion) {
                    System.out.println("Temperature Converter");
                    System.out.println("1. Celsius to Fahrenheit");
                    System.out.println("2. Celsius to Kelvin");
                    System.out.println("3. Fahrenheit to Celsius");
                    System.out.println("4. Fahrenheit to Kelvin");
                    System.out.println("5. Kelvin to Celsius");
                    System.out.println("6. Kelvin to Fahrenheit");
                    System.out.println("7. Exit");
                    System.out.print("Choose an option (1-7): ");

                    int choice = scanner.nextInt();

                    if (choice == 7) {
                        System.out.println("Exiting Temperature Converter. Goodbye!");
                        break;
                    }

                    System.out.print("Enter the temperature value: ");
                    double temperature = scanner.nextDouble();
                    double convertedTemp = 0;

                    switch (choice) {
                        case 1:
                            convertedTemp = celsiusToFahrenheit(temperature);
                            System.out.println("Result: " + convertedTemp + " °F");
                            break;
                        case 2:
                            convertedTemp = celsiusToKelvin(temperature);
                            System.out.println("Result: " + convertedTemp + " K");
                            break;
                        case 3:
                            convertedTemp = fahrenheitToCelsius(temperature);
                            System.out.println("Result: " + convertedTemp + " °C");
                            break;
                        case 4:
                            convertedTemp = fahrenheitToKelvin(temperature);
                            System.out.println("Result: " + convertedTemp + " K");
                            break;
                        case 5:
                            convertedTemp = kelvinToCelsius(temperature);
                            System.out.println("Result: " + convertedTemp + " °C");
                            break;
                        case 6:
                            convertedTemp = kelvinToFahrenheit(temperature);
                            System.out.println("Result: " + convertedTemp + " °F");
                            break;
                        default:
                            System.out.println("Invalid choice. Please select a valid option.");
                    }
                }
                scanner.close();
            }

            public static double celsiusToFahrenheit(double c) {
                return (c * 9 / 5) + 32;
            }

            public static double celsiusToKelvin(double c) {
                return c + 273.15;
            }

            public static double fahrenheitToCelsius(double f) {
                return (f - 32) * 5 / 9;
            }

            public static double fahrenheitToKelvin(double f) {
                return (f - 32) * 5 / 9 + 273.15;
            }

            public static double kelvinToCelsius(double k) {
                return k - 273.15;
            }

            public static double kelvinToFahrenheit(double k) {
                return (k - 273.15) * 9 / 5 + 32;
            }
        }


