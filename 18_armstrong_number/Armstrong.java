public class Armstrong {
    public static boolean checkArmstrong(int number){
        int temp = number;
        int digit = 0;

        while(temp>0){
            temp = temp/10;
            digit++;
        }

        temp = number;
        int last = 0; 
        int sum = 0;
        while(temp>0){
            last = temp%10;
            sum += Math.pow(last,digit);
            temp = temp/10;
        }

        if(number == sum){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int number = 371;
        if(checkArmstrong(number)){
            System.out.println(number + " is an armstrong number");
        }
        else{
            System.out.println("Not an armstrong number");
        }
    }
    
}
