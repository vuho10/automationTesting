package Ex2;

import java.util.Scanner;

public class Exercise5 {
}
class Matrix{
    private int row;
    private int col;
    private int[][] matrix;

    public Matrix(int row, int col){
        this.col = col;
        this.row = row;
        this.matrix = new int[row][col];
    }
    public void pushMatrix(Scanner sc){
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.col; j++) {
                System.out.printf("Nhap so tai vi tri [%d][%d]: ",i,j);
                this.matrix[i][j] = sc.nextInt();
            }
        }
    }
    public void findMaxNumber(){
        int maxNumber = this.matrix[0][0];
        int row = 0;
        int col = 0;
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.col; j++) {
                if (maxNumber < this.matrix[i][j]) {
                    maxNumber = this.matrix[i][j];
                    col = j;
                    row = i;
                }
            }

        }
        System.out.printf("So lon nhat la so: %s tai vi tri [%d][%d]",maxNumber,row,col);
    }
    public void listPrimes () {
        System.out.println("Cac so nguyen to la: ");
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.col; j++) {
                if (this.isPrime(this.matrix[i][j])) {

                    System.out.printf("So nguyen to tai vi tri [%s][%s] la: "  + this.matrix[i][j] + " \n",i,j);
                }
            }

        }
    }
    public boolean  isPrime(int number){
        if(number < 2){
            return false;
        }
        for (int i = 0; i < number/2; i++) {
            if(number %2 == 0){
                return  false;
            }
        }
        return  true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Matrix matrix = new Matrix(3,3);
        matrix.pushMatrix(sc);
//        matrix.findMaxNumber();
        matrix.listPrimes();
    }
}