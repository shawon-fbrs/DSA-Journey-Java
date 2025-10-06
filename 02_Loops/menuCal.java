import java.util.Scanner;

public class menuCal {
    // 4. Menu Driven Calculator
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Menu Driven Calculator");

        char choice;
        double a, b, result;

        do {
            
            System.out.println("Press (x or X) for Exit.");
            System.out.print("Choose an Operator (+,-,*,/) First: ");
            choice = sc.next().charAt(0);

            if (choice == 'x' || choice == 'X') {
                System.out.println("Exiting Calculator...");
                break;
            }
            System.out.print("Enter first Number: ");
            a = sc.nextDouble();
            System.out.print("Enter Second Number: ");
            b = sc.nextDouble();

            switch (choice) {
                case '+' -> result = a + b;
                case '-' -> result = a - b;
                case '*' -> result = a * b;
                case '/' -> result = (b != 0) ? a / b : Double.NaN;
                default -> {
                    System.out.println("Invalid operator!");
                    continue; // skip rest and go back to start
                }
            }
            System.out.println("Result " + result);
            System.out.println();
        } while (true);

    }
}
