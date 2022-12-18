package Bai1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class B1b9 {

//    dem so lan xuat hien cua tu do

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi ky tu: ");
        String chuoi = sc.nextLine();
//        String chuoi = "ho thi and ho bb thi a a a a a a bb bb";
        String[] dem = chuoi.split("\\s");
        System.out.println("-------------------");

        System.out.println("Tong cong co "+dem.length+" tu");
        for(int i = 0; i < dem.length; i ++){
            int count = 1;
            String current = dem[i];
            for(int j = i+1; j <dem.length;j ++){
                if(dem[j].equals(current) && dem[j].equals('0') == false){
                    count ++;
                    dem[j] = "0";
                }
            }
            if(count >= 1 && !current.equals("0")){
                System.out.println("So lan xuat hien cua tu: " +current+"_"+ count+" lan");
            }
        }
    }
}



//    public static void main(String[] args){

//        String[] words = searchText.replaceAll("\\p{Punct}", "").split(" ");
//        Scanner kytu = new Scanner(System.in);
//        System.out.println("Nhập chuỗi ký tự : ");
//        String chuoi = kytu.nextLine();
//        String[] dem = chuoi.split("\\s");
//
//        Map<String,Integer> map = new HashMap<>();
//
//        for (String s:dem){
//            if(map.containsKey(s)){
//                Integer value = map.get(s);
//                value++;
//                map.replace(s,value);
//
//            }else {
//                map.put(s,1);
//            }
//        }
//
//        System.out.println("-------------------");
//        System.out.println(map.toString());
//    }