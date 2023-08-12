import java.util.*;
public class PrimeNumbers {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=scan.nextInt();
        boolean[] bool = new boolean[num+1];
        for (int i=0; i<bool.length; i++){
            bool[i] = true;
        }
        for(int i=2; i<=num; i++){
            if(bool[i]==true){
                for(int j=i*i;j<=num;j=j+i){
                    bool[j]=false;
                }
            }
        }
        System.out.println("Prime numbers between 1 and "+ num +" are:");
        for(int i=2; i<=num; i++){
            if(bool[i]==true){
                System.out.print(i);
                if(i!=num){
                    System.out.print(", ");
                }
            }
        }
        scan.close();
    }
    
}
