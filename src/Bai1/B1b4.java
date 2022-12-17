package Bai1;

import java.util.Scanner;

public class B1b4 {

    private static Scanner scanner = new Scanner(System.in);

    /**
     Chương trình liệt kê tất cả các số nguyên tố nhỏ hơn n.
     */

    public static void main(String[] args) {
        System.out.print("Nhập n = ");
        int n = scanner.nextInt();
        System.out.printf("Tất cả các số nguyên tố nhỏ hơn %d là: \n", n);
        if (n >= 2) {
            System.out.print(2);
        }
        for (int i = 3; i < n; i+=2) {
            if (isPrimeNumber(i)) {
                System.out.print(" " + i);
            }
        }
    }

    /**
     * check so nguyen to
     *
     *  n: so nguyen duong
     * @return true la so nguyen so,
     *         false khong la so nguyen to
     */
    public static boolean isPrimeNumber(int n) {
        // so nguyen n < 2 khong phai la so nguyen to
        if (n < 2) {
            return false;
        }
        // check so nguyen to khi n >= 2
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
