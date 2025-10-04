import java.util.Scanner;

public class quadFind {
    // 08 - Quadrant Finder

    public static void main(String[] args) {
        // Quadrant logic
        // i)      x > 0 && y > 0 -> Quadrant 1
        // ii)     x < 0 && y > 0 -> Quadrant 2
        // iii)    x < 0 && y < 0 -> Quadrant 3
        // iv)     x > 0 && y < 0 -> Quadrant 4
        // v)      x == 0 || y == 0 -> on Axes

        Scanner sc = new Scanner(System.in);

        System.out.println("Cartesian Coordinate Quadrant Finder");
        System.out.print("Enter the X-coordinate: ");
        double x = sc.nextDouble();
        System.out.print("Enter the Y-coordinate: ");
        double y = sc.nextDouble();


        // First we will check for the axis
        if(x == 0 && y ==0){
            System.out.println("The position is at the origin.");
        } else if(x == 0){
            System.out.println("Lies on Y axis");
        } else if(y == 0){
            System.out.println("Lies on X axis.");
        }

        // Now we will find quadrants
        else if(x > 0 && y > 0){
            System.out.println("Quadrant 1");
        } else if(x < 0 && y > 0){
            System.out.println("Quadrant 2");
        } else if(x < 0 && y < 0){
            System.out.println("Quadrant 3");
        } else if(x > 0 && y < 0){
            System.out.println("Quadrant 4");
        }
    }


}
