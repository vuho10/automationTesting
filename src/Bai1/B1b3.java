package Bai1;

import java.util.Scanner;

public class B1b3 {
    public static void main(String[] args) {
        nhap();
    }

    static  void nhap () {
        int n, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap gia tri: ");
        n = sc.nextInt();
        System.out.print("Nhap he muon chuyen doi: ");
        b = sc.nextInt();
        String str = chuyen(n,b);
        System.out.print("gia tri " + n + " chuyen tu he 10 sang he " + b + ": ");
        xuat(str);
    }
    static void xuat (String str) {
        for (int i = 0; i < str.length(); i++){
            System.out.print(str.charAt(str.length()-i-1));
        }
    }
    static String chuyen(int n, int b) {
        String str = "";
        int x = 0;
        while (n > 0 ){
            x = n%b;
            n /= b;
            if (b == 16) {
                if (x==10) str += "A";
                if (x==11) str += "B";
                if (x==12) str += "C";
                if (x==13) str += "D";
                if (x==14) str += "E";
                if (x==15) str += "F";
                if ( 0 <= x &&  x < 10) str +=x;
            }
            else
                str += x;
        }
        return str;
    }



//    -----------------------------------------------------------------------------------
//    Viết chương trình tính tổng số nguyên dương bất kỳ
//    private static Scanner scanner = new Scanner(System.in);
//    public static int DEC_10 = 10;
//
//    public static void main(String[] args) {
//        System.out.print("Nhập số nguyên dương n = ");
//        int n = scanner.nextInt();
//        System.out.printf("Tổng của các chữ số "
//                + n +" là: "+ totalDigitsOfNumber(n));
//    }
//
//
//    public static int totalDigitsOfNumber(int n) {
//        int total = 0;
//        do {
//            total = total + n % DEC_10;
//            n = n / DEC_10;
//        }
//        while (n > 0);
//        return total;
//    }
}
