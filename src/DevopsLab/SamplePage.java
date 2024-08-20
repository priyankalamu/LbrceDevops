package DevopsLab;
import java.util.Scanner;

public class SamplePage {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		        Scanner scanner = new Scanner(System.in);

		        // Prompt the user to enter their Name
		        System.out.print("Enter your Name: ");
		        String name = scanner.nextLine();

		        // Prompt the user to enter their Roll Number
		        System.out.print("Enter your Roll Number: ");
		        String rollNumber = scanner.nextLine();

		        // Prompt the user to enter their Phone Number
		        System.out.print("Enter your Phone Number: ");
		        String phoneNumber = scanner.nextLine();

		        // Prompt the user to enter their Address
		        System.out.print("Enter your Address: ");
		        String address = scanner.nextLine();

		        // Output the collected data
		        System.out.println("\nSign-Up Information:");
		        System.out.println("Name: " + name);
		        System.out.println("Roll Number: " + rollNumber);
		        System.out.println("Phone Number: " + phoneNumber);
		        System.out.println("Address: " + address);

		        // Close the scanner
		        scanner.close();
		    }
		

}
