import java.util.*;

public class ReverseString {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        String reverse = "";
        for(int i = word.length()-1; i>=0; i--){
            reverse += word.charAt(i);
        }
        System.out.println(reverse);
        scan.close();
    }
    
}
