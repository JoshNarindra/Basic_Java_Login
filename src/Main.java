//Import necessary libraries
import java.util.Scanner;  // Import the Scanner class

public class Main {
    public static void main(String[] args) {

    String username = "user";
    String password = "password";
    int attempts = 3;

    Scanner myObj = new Scanner(System.in);

    while (attempts>0) {
        System.out.println("Please enter username");
        String usernameInput = myObj.nextLine().toLowerCase();
        System.out.println(usernameInput);

        System.out.println("Please insert password");
        String passwordInput = myObj.nextLine().toLowerCase();
        System.out.println(passwordInput);
        //using toLowerCase so case sensitivity does not matter.

        if (username.equals(usernameInput) && password.equals(passwordInput)) {
            System.out.println("Login Successful");
            attempts=0;
        } else if (!username.equals(usernameInput) && !password.equals(passwordInput)) {
            System.out.println("Both Username and Password incorrect,you have " + attempts + " attempts left.");
            attempts = attempts-1;
        } else if (!username.equals(usernameInput)) {
            System.out.println("Username incorrect,you have " + attempts + " attempts left.");
            attempts = attempts-1;
        } else if (!password.equals(passwordInput)) {
            System.out.println("Password incorrect,you have " + attempts + " attempts left.");
            attempts = attempts-1;
        }
    }
}
}