import java.util.Scanner;

public class guessNum {
    // guess the number game
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int secretNum = 5;
        int guess = 0;

        while(guess != secretNum){
            System.out.print("Guess the secret number: ");
            guess = sc.nextInt();

            if(guess > secretNum){
                System.out.println("Its too big.");
            } else if(guess < secretNum){
                System.out.println("Its too short");
            } else{
                System.out.println("You got it!");
            }
        }

    }
}
