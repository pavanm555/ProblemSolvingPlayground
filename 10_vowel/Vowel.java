import java.util.Scanner;

public class Vowel {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        int flag = 0;
        for(int i=0; i<word.length();i++){
            if(word.charAt(i)=='a' || word.charAt(i)=='e'|| word.charAt(i)=='i'|| word.charAt(i)=='o'|| word.charAt(i)=='u'){
                System.out.println("Vowel '" + word.charAt(i) + "' is present at Index " + i);
                flag = 1;
            }
        }
        if(flag == 0){
            System.out.println("All are consonants");
        }
    }
    
}
