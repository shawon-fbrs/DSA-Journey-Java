import java.util.Scanner;

public class maxOfThree {
    //    04 - Max of three Numbers

    public static void main(String[] args) {
        // import and create scanner class
        Scanner sc = new Scanner(System.in);

        // take input three numbers
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        // logic
        if(a > b && a >c){
            System.out.println(a + " = a is Max.");
        } else if( b > c){
            System.out.println(b + " = b is Max");
        } else{
            System.out.println(c + " = c is Max");
        }
    }
}
