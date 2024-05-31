import java.util.*;
public class List {
    public static void main(String[] args) {
        int arr[] = {1,1,1,4,4,4,4,4,4,5,5,5,3,3,3,3,3};
        HashMap<Integer, Integer> map = new HashMap<>();
        for(Integer i : arr){
            Integer j = map.get(i);
            map.put(i,(j==null)? 1:j+1);
        }
        System.out.println(map);

        int max = Integer.MIN_VALUE;
        int j = 0;
        for(Integer i : map.keySet()){
            if(map.get(i) > max){
                max = map.get(i);
                j = i;
            }
        }
        System.out.println(j + "=" + max);

    }
}
