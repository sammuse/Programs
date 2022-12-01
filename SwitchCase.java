import java.util.Scanner;

class SwitchCase{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        int lec = sc.nextInt();

        switch(lec)
        {
            case 1: System.out.println("This is 1st lecture");
                break;
            case 2: System.out.println("This is 2nd lecture");
                break;
            default: System.out.println("There is no lecture on sunday and saturday");
                break;
        }


    }
}
