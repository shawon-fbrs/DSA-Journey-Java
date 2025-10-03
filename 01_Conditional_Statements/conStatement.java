


import java.util.Scanner;

public class conStatement {
    // Questions ->
    // 01 - Get a number from the user and print whether it is positive or negative
    // 02 - Get input a year from the user and check Leap year or not
    // 03 - Check a number odd or even
    // 04 - Max of three Numbers
    // 05 - Grade Calculator
    // 06 - Vowel or Consonant
    // 07 - Triangle Validity
    // 08 - Quadrant Finder
    // 09 - ATM Withdrawl
    // 10 - Electricity Bill Calculator
    public static void main(String args[]){

        // Initiated a globally Scanner Class for taking input from the user in any block
        Scanner sc = new Scanner(System.in);

        // We will use separate block for every question. To define a block just use { // all code goes here }
        { // 01
            System.out.print("Enter a number to check positive or negative: ");
            int n = sc.nextInt();

            if(n == 0){
                System.out.println("Neither negative nor positive.");
            } else if(n > 0){
                System.out.println("Inputed number is a Positive Number.");
            } else{
                System.out.println("Inputed number is a negative number.");
            }
        }

        System.out.println();

        { // 02
            System.out.print("Enter a number to check odd or even: ");
            int n = sc.nextInt();

            if(n%2 == 0){
                System.out.println("Your number is an Even Number.");
            } else{
                System.out.println("Your number is a odd Number.");
            }
        }
    
    }
}
