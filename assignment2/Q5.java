public class Q5 {
    public static boolean isPrime(int number){
        if (number<2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if(number%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        if(isPrime(number)){
            System.out.println("Prime");
            return ;
        }
        System.out.println("Not prime!");
    }
}
