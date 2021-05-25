/*
Q.To find the sum of any integers entered as command line argumnts.
*/
public class Question1 {
    public static void main(String[] args) {
        System.out.print("The arguments are :");
        int sum = 0;
        for (int i=0 ; i<args.length ;i++) {
            System.out.print(args[i]);
            System.out.print(" ");
            sum+=Integer.parseInt(args[i]);
        }
        System.out.println("\nThe value of sum is: "+ sum);

    }
}

