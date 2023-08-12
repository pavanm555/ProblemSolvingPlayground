import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class PrimeSubarrys {
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
        // print prime numbers and push into the list
        System.out.println("Prime numbers between 1 and "+ num +" are:");
        List<Integer> primes = new ArrayList<>(); 
        for(int i=2; i<=num; i++){
            if(bool[i]==true){
                System.out.print(i);
                primes.add(i);
                if(i!=num){
                    System.out.print(", ");
                }
            }
        }
        System.out.println();

        // printing subarrays
        System.out.println("Printing all the subarrays: ");
        for(int i=0;i<primes.size();i++){
            for(int j=i;j<primes.size();j++){
                for(int k=i;k<=j;k++){
                    System.out.print(primes.get(k) + " ");
                }
                System.out.println();
            }
        }

            // printing subarrays whose sum is an even number
        System.out.println("Printing the subarrays whose sum is even:");
        for(int i=0;i<primes.size();i++){
            for(int j=i;j<primes.size();j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                sum += primes.get(k);    
                }
            if(sum%2==0){
                for(int k=i;k<=j;k++){
                   System.out.print(primes.get(k) + " ");
                }
                System.out.println();
            }
            }
        }
        scan.close();
    }   
}
