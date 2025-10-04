import java.util.Scanner;

public class sumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter range from 1 to range: ");
        int range = sc.nextInt(); // take input a range which is start from 1
        int sum = 0; // initial sum is 0

        for (int i = 1; i<= range; i++){
            sum += i; // sum = sum + i;
        }
        System.out.println(sum); // print the final output
    }
}
