public class Palindrome {
    public static void main(String[] args) {
        String s = "I am :IronorI Ma, i";
        s = s.toLowerCase();
        s = s.replaceAll("[,:]", "");

        String rev = "";
        for(int i=0; i<s.length(); i++){
            rev = s.charAt(i) + rev;
        }

        if(s.equals(rev)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }



    }
}