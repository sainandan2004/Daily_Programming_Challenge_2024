import java.util.*;
public class Day16_LCM {
    private static int gcd(int a, int b){
        if(b == 0){
            return a;
        }
        else if (a == 1 || b == 1){
            return 1;
        }
        else{
            return gcd(b, a%b);
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number");
        int n = scan.nextInt();
        System.out.println("Enter second number: ");
        int m = scan.nextInt();
        int res = gcd(n, m);
        System.out.print("LCM of those 2 numbers is: "+n*m/res);
        scan.close();
    }
}
