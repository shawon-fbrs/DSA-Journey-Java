import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {

        // type[] arrayName = new type[size]; 
        //  or
        // type[] arrayName = {1,2,3,4,5}


        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];

        //for taking input
        for(int i =0; i<size; i++){
            numbers[i] = sc.nextInt();
        }

        //for output
        for(int i = 0; i<size; i++){
            System.out.print(numbers[i] + " ");
        }


    }
}
