import java.util.Scanner;

public class HotelMenu {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int choice ;
        int bill = 0;
        //String menu;
        boolean mu = true;

        System.out.println("* * * Welcome to the TAJ VIVANTA! * * * ");

        while (mu){
            System.out.println("Please choose your menu: \n1. STARTER\n2. VEG\n3. NON-VEG\n4. DESERT\n5. BILL");
            System.out.println("Enter your choice:");
            choice = sc.nextInt();
            boolean sa = true;

            while (sa)
            {
                if (choice == 1) {
                    System.out.println("*** STARTER ***");
                    System.out.println("\n 1. Veg Manchurian - 60/-\n 2. Paneer tikka\n 3. Masala papad\n 4. Garlic Bread\n 5. back");
                    System.out.println("Enter your choice:");
                    int a = sc.nextInt();
                    switch (a){
                        case 1:
                            System.out.println("Enter number of plates you want to eat:");
                            int plate = sc.nextInt();
                            bill = bill + (60 * plate);
                            break;
                        case 5:
                            sa = false;
                            //break;
                    }
                }
                else if (choice == 2) {
                    System.out.println("*** VEG ***");
                    System.out.println("\n 1. Paneer Kofta\n 2. Veg Kolhapuri\n 3. Veg Maratha\n 4. Palak Paneer");
                }
                else if (choice == 3) {
                    System.out.println("*** NON-VEG ***");
                    System.out.println("\n 1. Chicken Handi\n 2. Chicken 65\n 3. Chicken butter masala\n 4. Chicken laccha paratha");
                }
                else if (choice == 4) {
                    System.out.println("*** DESERT ***");
                    System.out.println("\n 1. Gulab Jamun\n 2. Gajar ka Halwa\n 3. Rasgulla\n 4. Falooda ");
                }
                else if (choice == 5){
                    System.out.println("Your bill is:" + bill);
                }

            }

        }




    }
}
