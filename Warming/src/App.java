import java.util.Scanner;

public class App {


    // print 3 times hello world
    public static void funClass(){
        System.out.println("This is Md Shawon Islam");
        System.out.println("This is Md Mahim Islam");
        System.out.println("This is Md Manik Islam");

        return;
    }

    // calculate sum of 2 nums

    public static int sumFun( int num1, int num2){
        int sum = num1 * num2;
        return sum;
    }

    // find factirial
    public static int factorial(int n){
        int f = 1;
        for(int i = 1; i <= n; i++){
            f *= i;
        }
        return f;
    }


    // find Binomial Coefficent
    public static int biCoff(int n, int r){

        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int nmr_fact = factorial(n-r);

        int binCoff = n_fact / (r_fact * nmr_fact);

        return binCoff;
    }

    // check if a number is prime or not
    public static boolean isPrime(int n){

        if(n == 2){
            return true;
        }

        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n%i == 0){
                return false;
            }
        }

        return true;
    }

    // print prime nums in range
    public static void primeRange(int n){
        for(int i = 2; i<= n; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    // convert binary to decimal
    public static void binToDec(int binNum){
        int myNum = binNum;
        int pow = 0;
        int dec = 0;
        
        while(binNum > 0){
            int lastDigit = binNum % 10;
            dec = dec + (lastDigit * (int)Math.pow(2,pow));
            pow++;
            binNum /=10;
        }

        System.out.println("Decimal of " + myNum + " is = " + dec);

    }

    // convert decimal to binary
    public static void decToBin(int decNum){
        int myNum = decNum;
        int pow = 0;
        int binNum = 0;

        while(decNum > 0){
            int rem = decNum % 2;
            binNum = binNum + (rem * (int)Math.pow(10,pow));
            pow++;
            decNum /= 2;
        }

        System.out.println("binary form of " + myNum + " = " + binNum);
    }



    // main function
    public static void main(String[] args) throws Exception {
     
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a decimal number to convert: ");
        int decNum = sc.nextInt();

        decToBin(decNum);
        
    }
}
