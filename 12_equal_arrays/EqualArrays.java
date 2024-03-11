import java.util.Arrays;

public class EqualArrays {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,56,5,7,8,9};
        int arr2[] = {9,8,7,56,5,4,3,2,1};
        Arrays.sort(arr);
        Arrays.sort(arr2);

        if(Arrays.equals(arr, arr2)){
            System.out.println("Equal");
        }
        else{
            System.out.println("Not equal");
        }

    }    
    
}
