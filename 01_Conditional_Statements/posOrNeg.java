import java.util.Scanner;

public class posOrNeg {
    // check a number is Positive or Negative

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if(number == 0){
            System.out.println(number + " is neither negative nor positive.");
        } else if(number > 0){
            System.out.println(number + " is a positive number.");
        } else{
            System.out.println(number + " is a negative number.");
        }
    }
}
