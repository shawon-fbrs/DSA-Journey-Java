import java.util.Scanner;

public class isTriangle {


//07 - Triangle Validity
    // we can check a triangle is valid or not by two ways
    // sum of 3 angle = 180 deg or
    // sum of any two sides > other

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // we will check first sides logic

        System.out.print("Enter first side of triangle: ");
        double a = sc.nextDouble();
        System.out.print("Enter second side of triangle: ");
        double b = sc.nextDouble();
        System.out.print("Enter third side of triangle: ");
        double c = sc.nextDouble();

        // we can make extra boolean variable to track the logic or direct in the if(condition)

        boolean con1 = a+b > c;
        boolean con2 = b+c > a;
        boolean con3 = c+a > b;


        if(con1 && con2 && con3){
            System.out.println("Its a valid triangle!");
        } else{
            System.out.println("Not a valid Triangle.");
        }


    }
}
