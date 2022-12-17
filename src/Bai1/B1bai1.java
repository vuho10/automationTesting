package Bai1;

import java.util.Scanner;

public class B1bai1 {
    private static Scanner scanner = new Scanner(System.in);
//tìm USCLN và BSCNN
    public static void main(String[] args){
        System.out.print("nhập số nguyên dương a = ");
        int a = scanner.nextInt();
        System.out.print("nhập số nguyên dương b = ");
        int b = scanner.nextInt();

//        tính UCLN của a và b
        System.out.print("UCLN của " + a +"và" + b + "là :" + USCLN(a,b));
//        tinh BSCNN của a và b
        System.out.print("BSCNN của " + a +"và" + b + "là :" + BSCNN(a,b));
    }

    public static int USCLN(int a, int b){
        if (b == 0 )
            return a;
        return USCLN(b, a % b);
    }

    public static int BSCNN(int a, int b){
            return (a * b)/ USCLN(a, b);
    }
}
