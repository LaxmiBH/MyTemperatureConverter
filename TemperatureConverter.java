import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

 //Accept Temperature value       
        System.out.print("Enter temperature value: ");
        double temperature = scanner.nextDouble();

 //Accept Temperature Unit
        System.out.print("Enter temperature unit (C or F): ");
        char unit = scanner.next().charAt(0);

 //COnert and Display Temeprature in  the other unit      
        if (unit == 'C' || unit == 'c') {
            double convertedTemperature = celsiusToFahrenheit(temperature);
            System.out.println(temperature + " Celsius is equal to " + convertedTemperature + " Fahrenheit.");
       
}


else {
            System.out.println("Invalid temperature unit. Please enter C or F.");
        }

        scanner.close();
    }

//Method to Convert Celcius to Fahrenheit    
    private static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

   //Method to Convert to Fahrenheit to Celsius
    private static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
}  
