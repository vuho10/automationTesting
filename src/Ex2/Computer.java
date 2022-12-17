package Ex2;

import java.util.ArrayList;
import java.util.Scanner;

public class Computer {
    String nameComputer;
    int typeComputer;
    Computer ( String nameComputer, int typeComputer) {
        this.nameComputer = nameComputer;
        this.typeComputer = typeComputer;
    }


//    String getNameComputer() {
//        return this.nameComputer = nameComputer;
//
//    }
//    void setNameComputer(String newName)
//    {
//        this.nameComputer = newName;
//    }
//    int getTypeComputer() {
//        return this.typeComputer = typeComputer;
//    }
//    void setTypeComputer( int newType) {
//        this.typeComputer = newType;
//    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Computer> listComputer = new ArrayList<>();

        System.out.print("Enter number computer: ");
        int n = sc.nextInt();

        for ( int i = 0; i < n; i++) {
            System.out.println(String.format("Enter place %s", i+1));
            System.out.print("Enter name of computer: ");
            String name = sc.next();

            System.out.print("Enter type of computer: ");
            int type = sc.nextInt();

            Computer computer = new Computer(name, type);
            listComputer.add(computer);
        }
        for ( int x = 0; x < listComputer.size(); x++) {
            System.out.println("");
            System.out.print("Computer "+ (x+1) +"_ Name: " + listComputer.get(x).nameComputer + " ;" + "Type: " + listComputer.get(x).typeComputer);
        }

    }
}
