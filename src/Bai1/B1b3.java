package Bai1;

import java.util.Scanner;

public class B1b3 {
//    Viết chương trình tính tổng số nguyên dương bất kỳ
    private static Scanner scanner = new Scanner(System.in);
    public static int DEC_10 = 10;

    public static void main(String[] args) {
        System.out.print("Nhập số nguyên dương n = ");
        int n = scanner.nextInt();
        System.out.printf("Tổng của các chữ số "
                + n +" là: "+ totalDigitsOfNumber(n));
    }


    public static int totalDigitsOfNumber(int n) {
        int total = 0;
        do {
            total = total + n % DEC_10;
            n = n / DEC_10;
        } while (n > 0);
        return total;
    }
}
