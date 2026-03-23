import java.util.Scanner;
public class task5 {
    public static int fibbonaci(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        return fibbonaci(n - 2) + fibbonaci(n - 1);
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(fibbonaci(n));
    }
}
