// Client.java
// Represents a client who owns a Card

public class Client {

    // Declare variables
    private int idNumber;
    private String firstName;
    private String lastName;
    private int age;

    private Card card; // Composition (HAS-A relationship)

    // Constructor
    public Client(int idNumber,
                  String firstName,
                  String lastName,
                  int age,
                  String cardNumber,
                  double balance,
                  int pin,
                  boolean isActive)
    {

        if (age < 18) {

            throw new IllegalArgumentException("Client must be 18 or older.");
        }

        this.idNumber = idNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;

        // Create Card object
        card = new Card(cardNumber, balance, pin, isActive);
    }

    // Activate card
    public void activateClientCard() {

        card.activateCard();
    }

    // Change PIN
    public void changeClientPin(int oldPin, int newPin) {

        card.updatePin(oldPin, newPin);
    }

    // toString method
    public String toString() {

        return "\n===== CLIENT PROFILE ====="
                + "\nID Number: " + idNumber
                + "\nName: " + firstName + " " + lastName
                + "\nAge: " + age
                + card.toString();
    }
}
