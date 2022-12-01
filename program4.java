
import java.util.Scanner;

class program4
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int len;
        int arr[]=new int[256];
        System.out.print("Enter the characters: ");
        String str=s.nextLine();
        len = str.length();
        for(int i = 0; i < len ; i++)
        {
            arr[(int)str.charAt(i)]++;
        }
        for(int i=0;i<256;i++)
        {
            if(arr[i]!=0)
            {
                System.out.println("Occurance of following characters are: "+ (char)i+"-->"+arr[i]);
            }
        }
    }
}
