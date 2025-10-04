import java.util.Scanner;

public class revANum {
    // Reverse the given num
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to reverse: ");
        int number = sc.nextInt();


        while(number > 0){ // run loop until the number is grater than 0
            int lastDigit = number % 10; // get last digit of the number : 5678
            System.out.print(lastDigit); // print to index : 8
            number /= 10; // make short: 567
        } // final output : 8765
    }
}
