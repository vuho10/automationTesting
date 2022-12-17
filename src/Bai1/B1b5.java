package Bai1;

import java.util.Scanner;

public class B1b5 {

    public static int nhap(){
        Scanner input= new Scanner(System.in);
        boolean check= false;
        int n=0;
        while(!check){
            System.out.print(" ");
            try{
                n= input.nextInt();
                check= true;
            }catch(Exception e){
                System.out.println("Ban phai nhap so! hay nhap lai...");
                input.nextLine();
            }
        }
        return (n);
    }

    public static void main(String[] args) {
        System.out.print("Nhap n");
        int n= nhap();
        int[] f= new int[n+1];
        f[0]= 1; f[1]= 1;
        for(int i=2;i<=n;i++)
            f[i]= f[i-1]+f[i-2];
        System.out.println("So Fibonanci thu " + n + " la: f[" + n + "]= " + f[n]);
    }

}
