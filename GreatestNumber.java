import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the numbers:");
        int a,b;
        System.out.println("a");
        a = sc.nextInt();
        System.out.println("b");
        b = sc.nextInt();

        if(a>b){
            System.out.println("A is greater Number.");
        }
        else{
            System.out.println("B is greater Number.");
        }

    }
}
