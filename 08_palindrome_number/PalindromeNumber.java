import java.util.*;

public class PalindromeNumber {
    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        int num, temp, digit, rev=0;
        num = scan.nextInt();
        temp = num;
        while(temp>0){
            digit = temp%10;
            rev = (rev*10) + digit;
            temp = temp/10;
        }

        if(rev == num){
            System.out.println("Palindrome Number");
            
        }
        else
            System.out.println("Not Palindrome Number");

        scan.close();

    }

    
}
