import java.util.*;

public class SecondHighest{
    public static void main(String[] args){
        int arr[] = {8,5,2,6,7,9,12};
        Arrays.sort(arr);

        for(int i : arr){
            System.out.print(i + " ");
        }
        int n = arr.length;
        System.out.println("Highest: " + arr[n-1]);
        System.out.println("Second Highest: " + arr[n-2]);
    }
}