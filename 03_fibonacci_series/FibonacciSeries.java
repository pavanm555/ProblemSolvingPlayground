import java.util.*;

public class FibonacciSeries {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n1=0, n2=1, n3;
        int count = scan.nextInt();
        scan.close();
        System.out.println("Fibonacci series of " + count + " numbers:" );
        System.out.print(n1 + " ");
        System.out.print(n2 + " ");
        for(int i=2;i<count;i++){
            n3 = n1 + n2;
            System.out.print(n3 + " ");
            n1 = n2;
            n2 = n3;
            //0 1 1 2 3 5
        }
    }    
}
