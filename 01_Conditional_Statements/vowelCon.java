import java.util.Scanner;

public class vowelCon {
    //06 - Vowel or Consonant
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a charecter to check vowel or consonant: ");
        char ch = sc.next().charAt(0);

        if(ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || 
        ch == 'i' || ch == 'I' || ch == 'o' || 
        ch == 'O' || ch == 'u' || ch == 'U'){
            System.out.println(ch + " is a vowel letter.");
        } else if( (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
            System.out.println(ch + " is a consonant letter.");
        } else{
            System.out.println("Invalid Letter.");
        }
    }
}
