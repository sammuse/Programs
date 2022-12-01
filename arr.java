import java.util.Scanner;

class arr {
    public static void main(String[] args){
        
         Scanner sc = new Scanner(System.in);

        //int a[] ={1,2,3,4,5};
        
        //int a[] = sc.nextInt();

        int a[] = new int[5];
        int b = 0;
        for(int i=0; i<5;i++)
        {
        int a[i] = sc.nextInt();
        } 
        for(int i=0;i<5;i++){
            
            b = b + a[i];

        }
        System.out.println("Addition is:" + b);
    }
}