public class Palindrome {
    public static void main(String[] args){

        String str = "1001";
        String reverse = "";
        int length = str.length();
        for(int i=0;i<length;i++){
            reverse = str.charAt(i) + reverse;
        }

        if(str.equals(reverse)){
            System.out.print("Palindrome");
        }
        else{
            System.out.print("Not a palindrome");
        }
    }
    
}
