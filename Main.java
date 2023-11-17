import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Simulate a user database (for demonstration purposes)
        String validUsername = "user123";
        String validPassword = "password123";

        // Get input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        String enteredUsername = scanner.nextLine();
        System.out.print("Enter password: ");
        String enteredPassword = scanner.nextLine();

        // Call method for user authentication
        boolean isAuthenticated = authenticateUser(enteredUsername, enteredPassword, validUsername, validPassword);

        // Check authentication result
        if (isAuthenticated) {
            System.out.println("Authentication successful. Welcome, " + enteredUsername + "!");
        } else {
            System.out.println("Authentication failed. Invalid username or password.");
        }

        // Close the scanner to avoid resource leaks
        scanner.close();
    }

    // Method for user authentication
    private static boolean authenticateUser(String enteredUsername, String enteredPassword,
                                            String validUsername, String validPassword) {
        // Simulate user authentication logic
        for (int i = 0; i < 3; i++) { // Allow three attempts
            if (enteredUsername.equals(validUsername) && enteredPassword.equals(validPassword)) {
                return true; // Authentication successful
            } else {
                System.out.println("Authentication failed. Please try again.");
                System.out.print("Enter username: ");
                enteredUsername = new Scanner(System.in).nextLine();
                System.out.print("Enter password: ");
                enteredPassword = new Scanner(System.in).nextLine();
            }
        }
        return false; // After three attempts, authentication fails
    }
}
