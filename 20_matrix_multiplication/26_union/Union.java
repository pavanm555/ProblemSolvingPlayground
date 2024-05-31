import java.util.ArrayList;

public class Union {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {3, 4, 5, 6, 7};
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0;i<array1.length;i++){
            list.add(array1[i]);
        }

        System.out.println(list);

        for(int i=0;i<array2.length;i++){
            boolean found = false;
            for(int j=0;j<list.size();j++){
                if(array2[i] == list.get(j)){
                    found = true;
                }
            }
            if(!found){
                list.add(array2[i]);
            }
        }

        System.out.println(list);


    }    
}
