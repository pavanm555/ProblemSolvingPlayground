
public class TwoSum{
    public static void main(String[] args) {
        int arr[] = {3,5,9,4,6,8};
        int n = 9;
        for(int i=0;i<arr.length;i++){
            int diff = n - arr[i];
            for(int j=i+1;j<arr.length;j++){
                if(diff == arr[j]){
                    System.out.println(arr[i] + ", " + arr[j]);
                }
            }
        }
    }
}