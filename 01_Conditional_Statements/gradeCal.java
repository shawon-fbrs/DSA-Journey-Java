import java.util.Scanner;

public class gradeCal {
    // 05 - Grade Calculator
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your mark: ");
        float mark = sc.nextFloat(); // float for marks like 85.5

        if(mark >= 80 && mark <= 100){
            System.out.println("Grade: A+");
        } else if( mark >= 70 && mark <= 79){
            System.out.println("Grade: A");
        } else if(mark >= 60 && mark <= 69){
            System.out.println("Grade: A-");
        } else if(mark >= 50 && mark <= 59){
            System.out.println("Grade: B");
        } else if(mark >= 40 && mark <= 49){
            System.out.println("Grade: C");
        } else if(mark >= 33 && mark <= 39){
            System.out.println("Grade: D");
        } else {
            System.out.println("Failed");
        }

    }
}
