import java.util.Scanner;

public class task9 {
    public static int counter(String s){
        if(s.isEmpty()){
            return 0;
        }
        return 1 + counter(s.substring(1));
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(counter(s));
    }
}
