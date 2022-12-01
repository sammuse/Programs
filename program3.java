import java.util.Scanner;
class program3
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number 1:");
        int a=s.nextInt();
        System.out.println("Enter number 2: ");
        int b=s.nextInt();
        for (int i=1;i<=(a*b);i++)
        {
            if(i%a==0 && i%b==0)
            {
                System.out.println("LCM is: "+i);
            }
        }
        for(int j=a;j>=1;j--)
        {
            if(a%j==0 && b%j==0)
            {

                System.out.println("GCD is: "+j);
            }

        }
    }
}

