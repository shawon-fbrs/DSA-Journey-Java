import java.util.Scanner;

public class leapYear {
    // 02 - Get input a year from the user and check Leap year or not
    public static void main(String[] args) {
        // import and create a scanner class
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year to check leap year: ");
        int year = sc.nextInt();

        // is devisible by 4 = true
        boolean x = year % 4 == 0; 

        // is devisible by 100 = false
        boolean y = year % 100 != 0;

        // is devisible by 100 & 400 = true
        boolean z = ((year % 100 == 0)&&(year % 400 == 0));

        //A year is a leap year IF it is divisible by 4, AND it is EITHER not divisible by 100 OR it is divisible by 400.
        if(x && (y || z)){
            System.out.println(year + " is a leap year!");
        } else{
            System.out.println(year + " is not a leap year.");
        }

    }
}
