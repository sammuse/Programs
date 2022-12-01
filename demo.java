package com.company;
import java.util.Scanner;

class item{

    Scanner sc=new Scanner(System.in);
    int p=50;
    //st
    void menu()
    {
        System.out.println(" enter  menu");
        System.out.println(" 1.starter");
        System.out.println(" e");
        System.out.println(" enter  menu");
        System.out.println(" enter  menu");
        int a = sc.nextInt();
        if (a==1){

            starter();
        }
    }

    void starter()
    {
        System.out.println(" enter  starer");
        System.out.println(" 1.pasta");
        System.out.println(" 2.paster");
        System.out.println(" enter  menu");
        System.out.println(" enter  menu");

        int b = sc.nextInt();
        switch (b){
            case 1:
                System.out.println("pasta - 60");
                System.out.println("how many");
                int c = sc.nextInt();
                break;
            case 2:
                System.out.println("pastry - 50"+p);
                System.out.println("how much");
                int d = sc.nextInt();
                //total=total+d*p;
                menu();
                break;

        }
    }
}
public class demo{
    public static void main(String args[]){
        item d = new item();
        d.menu();
    }
}
