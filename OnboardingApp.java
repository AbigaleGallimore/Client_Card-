// OnboardingApp.java
// Main program

import java.util.Scanner;
import java.util.InputMismatchException;

public class OnboardingApp {

    public static void main(String[] args) {

        // Declare scanner
        Scanner input = new Scanner(System.in);

        try {

            // Declare variables
            int idNumber;
            String firstName;
            String lastName;
            int age;
            String cardNumber;
            double balance;
            int pin;
            int oldPin;
            int newPin;

            boolean isActive = false;

            // Input client data
            System.out.println("===== DIGITAL BANKING SYSTEM =====");

            System.out.print("Enter ID Number: ");
            idNumber = input.nextInt();

            input.nextLine();

            System.out.print("Enter First Name: ");
            firstName = input.nextLine();

            System.out.print("Enter Last Name: ");
            lastName = input.nextLine();

            System.out.print("Enter Age: ");
            age = input.nextInt();

            input.nextLine();

            // Input card data
            System.out.print("Enter Card Number: ");
            cardNumber = input.nextLine();

            System.out.print("Enter Balance: ");
            balance = input.nextDouble();

            System.out.print("Enter PIN: ");
            pin = input.nextInt();

            // Create Client object
            Client client = new Client(
                    idNumber,
                    firstName,
                    lastName,
                    age,
                    cardNumber,
                    balance,
                    pin,
                    isActive
            );

            // Display profile
            System.out.println("\nINITIAL PROFILE:");
            System.out.println(client);

            // Activate card
            client.activateClientCard();

            // Change PIN
            System.out.print("\nEnter OLD PIN: ");
            oldPin = input.nextInt();

            System.out.print("Enter NEW PIN: ");
            newPin = input.nextInt();

            client.changeClientPin(oldPin, newPin);

            // Display final profile
            System.out.println("\nFINAL PROFILE:");
            System.out.println(client);

        }
        catch (InputMismatchException e) {

            System.out.println("Invalid input type.");
        }
        catch (IllegalArgumentException e) {

            System.out.println(e.getMessage());
        }

        input.close();
    }
}
