public class Main{
    public static void main(String args[]){
        int a = 7;
        int b = 10;
        int flipped = a^b;
        int count = 0;
        while(flipped>0){
            if((flipped&1)== 1){
                count++;
            }
            flipped >>= 1;
        }

        System.out.println(count);

    }
}