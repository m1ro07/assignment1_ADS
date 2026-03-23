import java.util.Scanner;

public class task2 {

    public static void avg(int n){
        if(n == 0){
            System.out.println();
        }
        else{
            avg(n-1);
        }
    }

    public static void sum(){

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        avg(n);
    }
}

