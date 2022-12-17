package Bai1;

import java.util.Scanner;

public class B1b10 {
    public static void main(String[] args){
        Scanner chuoikytu = new Scanner(System.in);
        System.out.println("Nhập họ - đệm - tên: ");
        String chuoi = chuoikytu.nextLine();
//        String chuoi = "HO THI VU";
        String[] mang = chuoi.split("\\...");

        System.out.println("Chuyển thành Tên - họ - đệm :" + mang[2] +" "+mang[0]+" "+mang[1]);

    }
}
