package Bai1;

import java.util.Scanner;

public class B1b11 {

    public static void main(String args[]){
        int n, sum = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Nhập vào số phần tử của mảng: ");
            n = scanner.nextInt();
        } while (n < 0);

        // khởi tạo và cấp phát bộ nhớ cho mảng
        int array[] = new int[n];

        System.out.println("Nhập các phần tử cho mảng: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            array[i] = scanner.nextInt();
        }

        // Hiển thị mảng vừa nhập
        System.out.println("\nMảng ban đầu: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + "\t");
        }

        // tính tổng các phần tử có trong mảng
        for (int i = 0; i < n; i++) {
            sum += array[i];
        }
        System.out.println("\nTổng các phần tử có trong mảng = " + sum);
    }
}
