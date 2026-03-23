import java.util.Scanner;
public class task3 {
    public static boolean primeNumbers(int n){
        if(n <= 1){
            System.out.println();
        }
        return checkDivisor(n, 2);
    }

    public static boolean checkDivisor(int n, int d){
        if(d * d > n){
            return true;
        }
        if(n % d == 0){
            return false;
        }
        return checkDivisor(n, d + 1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if(primeNumbers(n) == true){
            System.out.println("Prime");
        }
        else{
            System.out.println("Composite");
        }
    }
}
