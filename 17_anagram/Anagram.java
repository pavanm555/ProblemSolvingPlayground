import java.util.*;

public class Anagram {

    public static boolean checkAnagrams(String str1, String str2){
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(arr1.length != arr2.length){
            return false;
        }


       for(int i=0; i<arr1.length; i++){
            if(arr1[i] != arr2[i]){
                return false;
            }
        }

        return true; 
    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine();
        String str2 = scan.nextLine();

        if(checkAnagrams(str1, str2)){
            System.out.println("Anagrams");
        }
        else{
            System.out.println("Not Anagrams");
        }
       

        scan.close();

    }
    
}
