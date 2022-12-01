
import java.util.*;
public class program2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Strings: ");
        int n = sc.nextInt();

        String str[] = new String[n];
        System.out.println("Enter the Strings ");

        for(int i=0; i<n; i++)
        {
            str[i] = sc.next();
        }
        Arrays.sort(str);
        System.out.println("Strings in alphabetical order are:");
        for(int i=0; i<n; i++)
        {
            System.out.println(str[i]);
        }
    }
}