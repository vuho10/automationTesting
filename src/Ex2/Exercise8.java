package Ex2;

import java.util.Scanner;

public class Exercise8 {
}
interface HCNInterface{
    public double dientichHCN();
    public  double getChieuDai();
    public  double getChieuRong();
    public  void  setDaiRong(double cd,double cr);
}
class  Hinhchunhat implements  HCNInterface{
    private  double chieudai;
    private  double chieurong;

    public Hinhchunhat(double cd ,double cr){
        this.chieudai = cd;
        this.chieurong = cr;
    }

    @Override
    public double dientichHCN() {
        return  this.chieudai * this.chieurong;
    }

    @Override
    public double getChieuDai() {
        return this.chieudai;
    }

    @Override
    public double getChieuRong() {
        return this.chieurong;
    }

    @Override
    public void setDaiRong(double cd, double cr) {
        this.chieurong = cd;
        this.chieudai = cd;
    }
}
class  HCNTest {
    private Hinhchunhat[] hinhchunhats;
    public void nhapHCN(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong hinh chu nhat: ");
        int soLuong = sc.nextInt();
        this.hinhchunhats = new Hinhchunhat[soLuong];
        for (int i = 0; i < this.hinhchunhats.length; i++) {
            System.out.println("Nhap chieu dai hinh chu nhat thu "+ (i+1) + " : ");
            double cd = sc.nextDouble();
            System.out.println("Nhap chieu rong hinh chu nhat thu "+ (i+1) + " : ");
            double cr = sc.nextInt();
            this.hinhchunhats[i] = new Hinhchunhat(cd,cr);
        }
    }
    public void inHCN (){
        for (int i = 0; i < this.hinhchunhats.length; i++) {
            System.out.println("Chieu dai cua hinh chu nhat thu "+ (i+1)+" : "+this.hinhchunhats[i].getChieuDai());
            System.out.println("Chieu rong cua hinh chu nhat thu "+ (i+1)+" : "+this.hinhchunhats[i].getChieuRong());
            System.out.println("Dien tich cua hinh chu nhat thu "+ (i+1)+" : "+this.hinhchunhats[i].dientichHCN());

        }
    }
    public void dtMaxHCN(){
        double maxDT = hinhchunhats[0].dientichHCN();
        int index = 1;
        for (int i = 1; i < hinhchunhats.length; i++) {
            if (hinhchunhats[i].dientichHCN()> maxDT){
                maxDT = hinhchunhats[i].dientichHCN();
            }
            index ++;
        }
        System.out.println("Hinh chu nhat co dien tich lon nhat la hinh thu: "+ (index)+ " co dien tich: "+maxDT);
    }

    public static void main(String[] args) {
        HCNTest hcnTest = new HCNTest();
        hcnTest.nhapHCN();
        hcnTest.inHCN();
        hcnTest.dtMaxHCN();
    }
}