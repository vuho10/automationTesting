package Bai1;

import java.util.Scanner;
import java.util.StringTokenizer;

public class B1b8 {
    private static String kq;

    public static void main(String[] args){
        Scanner kytu = new Scanner(System.in);
        System.out.println("nhập một xâu ký tự mà bạn muốn : ");
        String chuoi = kytu.nextLine();
        String[] kq = chuoi.split("\\s");

//        StringTokenizer stringTokenizer = new StringTokenizer(chuoi);
//        int soTuTrongChuoi = stringTokenizer.countTokens();

        System.out.println("Số từ có trong chuỗi \"" + chuoi + "\" = " + kq.length );

    }


}
