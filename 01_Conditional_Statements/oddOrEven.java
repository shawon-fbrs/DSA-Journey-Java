import java.util.Scanner;

public class oddOrEven {
    // 03 - Check a number odd or even
    public static void main(String[] args) {
        // import and create a scanner class
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to check odd or even: ");
        int number = sc.nextInt();

        // if number == 0 
        if(number == 0){
            System.out.println(number + " is neither odd nor even.");
        } else if(number % 2 == 0){
            System.out.println(number + " is an even number.");
        } else{
            System.out.println(number + " is an odd number.");
        }
    }
}
