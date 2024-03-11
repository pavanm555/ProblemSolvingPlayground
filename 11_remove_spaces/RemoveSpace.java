
public class RemoveSpace {
    public static void main(String args[]){
        String string = "   I am learning JAVA   ";
        String newString = "";
        for(int i=0; i<string.length(); i++){
            if(string.charAt(i) != ' '){
                newString += string.charAt(i);
            }
        }
        System.out.println(newString);
        System.out.println(string.trim());
    }
    
}
