import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        String str = "Prime Number" ;

        for (int i= 2; i < n; i++) {
            if(n%i==0) {
                 str = "Not a Prime Number" ;
            }
        }
        System.out.println(str);
    }
}