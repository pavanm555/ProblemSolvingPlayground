import java.util.*;

public class BinaryPalindrome {
    public static void main(String args[]){
        
        Scanner sc = new Scanner (System.in);
        long n = sc.nextLong();
        long temp, rev=0;
        temp = n;
        while(temp>0){
            rev <<= 1;
            if((temp&1) == 1){
                rev ^= 1;
            }
            temp >>= 1;
        }
    
        if(n == rev){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
        
        sc.close();
    }
    
}
