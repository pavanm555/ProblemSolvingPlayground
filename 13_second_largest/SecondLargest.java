import java.util.Arrays;
import java.util.Collections;

public class SecondLargest {
    public static int secondLargest(int arr[]){
        if(arr.length < 2){
            System.out.println("Invalid Input");
        }
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }

        for(int i=0; i<arr.length; i++){
            if(arr[i] != largest && arr[i]>second){
                second = arr[i];
            }
        }

        return second;
    }
    public static void main(String[] args) {
        int arr[] = {21,13,16,7,9};
        System.out.println(secondLargest(arr));
        
    }
}    

