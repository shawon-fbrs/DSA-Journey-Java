import java.security.SecureRandom;
import java.util.Scanner;

public class passGen {
    //5. Password Generator.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SecureRandom random = new SecureRandom(); 

        String upperCase = "ABCDEFGHIGKLMNOPQRSTUVWXYZ";
        String lowerCase = "abcdefghijklmnopqrstuvwxyz";
        String spChar = "!@#$%^&*()-_=+<>?";
        String numbers = "1234567890";

        String allChars = upperCase + lowerCase + spChar + numbers;


        System.out.print("Enter password length: ");
        int length = sc.nextInt();

        StringBuilder password = new StringBuilder();

        for(int i = 1; i <= length; i++){
            int index = random.nextInt(allChars.length());
            password.append(allChars.charAt(index));
        }
        System.out.println("Generated Password: " + password.toString());

    }
}
