import java.util.Scanner;

public class task7 {
    public static void readArray(int[] arr, int i, Scanner sc){
        if(i == arr.length){
            return;
        }
        arr[i] = sc.nextInt();
        readArray(arr, i + 1, sc);
    }

    public static void printArray(int[] arr, int i, int n){
        if(i == arr.length){
            return;
        }
        System.out.print(arr[n - i] + " ");
        printArray(arr, i + 1, n);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        readArray(arr, 0, sc);
        printArray(arr, 0, n - 1);

    }
}
