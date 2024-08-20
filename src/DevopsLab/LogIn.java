package DevopsLab;
import java.util.Scanner;

public class LogIn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        // Predefined username and password (for demonstration purposes)
		        String correctUsername = "user";
		        String correctPassword = "password";

		        // Create a Scanner object for input
		        Scanner scanner = new Scanner(System.in);

		        // Prompt the user to enter their Username
		        System.out.print("Enter your Username: ");
		        String username = scanner.nextLine();

		        // Prompt the user to enter their Password
		        System.out.print("Enter your Password: ");
		        String password = scanner.nextLine();

		        // Check if the entered credentials are correct
		        if (username.equals(correctUsername) && password.equals(correctPassword)) {
		            System.out.println("Login successful!");
		        } else {
		            System.out.println("Invalid Username or Password. Please try again.");
		        }

		        // Close the scanner
		        scanner.close();


	}

}
