import java.util.Scanner;

class program1
{
    public static void main(String args[])
    {	int temp;
        Scanner s=new Scanner(System.in);

        System.out.print("Enter the numbers: " + '\n' );
        int arr[]=new int [10];
        for(int i=0;i<10;i++)
        {

            arr[i]=s.nextInt();
        }

        for(int i=0;i<10;i++)
        {
            for(int j=i+1;j<10;j++)
            {
                if(arr[i] < arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("2nd maximum num is"+arr[1]);
        System.out.println("2nd minimum num is"+arr[8]);
    }
}

/*
import java.util.Scanner;

public class program1 {


        public static void main(String args[])
        {
            Scanner s = new Scanner(System.in);
            int reap = 10, secondSmallest=0, secondLargest=0;
            int[] arr = new int[reap];
            System.out.println("Enter values : ");
            for(int i=0; i<reap; i++)
            {
                arr[i] = s.nextInt();
            }
            int temp;
            for(int m=0; m<reap; m++)
            {
                for(int n=m; n<reap; n++)
                {
                    if(arr[m]>arr[n])
                    {
                        temp = arr[m];
                        arr[m] = arr[n];
                        arr[n] = temp;
                    }
                }
            }
            if(arr[0] != arr[9])
            {
                for(int a =1;a<9;a++)
                {
                    if(arr[0]<arr[a])
                    {
                        secondSmallest = arr[a];
                        break;
                    }
                }
                for(int z = 8; z>1; z--)
                {
                    if (arr[9]>arr[z])
                    {
                        secondLargest = arr[z];
                        break;
                    }
                }
            }
            else;
            {
                System.out.println("All number are same...");
            }
            System.out.println("Second Largest Number is : " +secondSmallest);
            System.out.println("Second Smallest number is : " +secondLargest);
            s.close();
        }
    }

*/
