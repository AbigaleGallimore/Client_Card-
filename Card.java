// Card.java
// Represents a client's card

public class card {

    // Private variables (declared properly)
    private String cardNumber;
    private double balance;
    private int pin;
    private boolean isActive;

    // Constructor
    public card(String cardNumber, double balance, int pin, boolean isActive) {
        this.cardNumber = cardNumber;
        this.balance = balance;
        this.pin = pin;
        this.isActive = isActive;
    }

    // Activate card
    public void activateCard() {
        isActive = true;
        System.out.println("card successfully activated.");
    }

    // Update PIN
    public void updatePin(int oldPin, int newPin) {

        if (oldPin == this.pin) {
            this.pin = newPin;
            System.out.println("PIN successfully updated.");
        }
        else {
            System.out.println("Incorrect old PIN. PIN not changed.");
        }
    }

    // Mask card number (BONUS)
    private String maskCardNumber() {

        if (cardNumber.length() >= 4) {

            String last4Digits = cardNumber.substring(cardNumber.length() - 4);

            return "XXXX-XXXX-XXXX-" + last4Digits;
        }

        return "Invalid card Number";
    }

    // toString method
    public String toString() {

        return "\n--- card Information ---"
                + "\ncard Number: " + maskCardNumber()
                + "\nBalance: $" + balance
                + "\nPIN: ****"
                + "\nStatus: " + (isActive ? "Active" : "Inactive");
    }
}

