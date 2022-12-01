import java.util.Scanner;

class ArraySort {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter "+ n +" numbers:");
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        linear(arr,n);
    }

    static void linear(int[] arr, int size) {

        for (int i = 0; i < size; i++) {

            if (arr[i] == 6) {
                System.out.println("founded number is:" + "= " + arr[i]);
            }
            else
            {
                System.out.println("incorrect");
            }
        }
    }
}

        /*for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
            for (int k = 0; k <= 5; k++) {
                for (int l = 0; l <= k; l++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
        }*/

        //program2
        /*
        int a[]={22,12,45,53,4,16,20}, b[]={4,16,45,52,22,10,20};
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                if (a[i]==b[j]){
                    System.out.println("common numbers are:" + a[i]);
                }
            }
        }*/
        //program 1
        /*Scanner sc = new Scanner(System.in);

        //int a[] ={1,2,3,4,5};

        //int a[] = sc.nextInt();

        int a[] = new int[5];
        int b = 0;
        for(int i=0; i<5;i++)
        {
            a[i] = sc.nextInt();
        }
        for(int i=0;i<5;i++){

            b = b + a[i];

        }
        System.out.println("Addition is:" + b);*/
