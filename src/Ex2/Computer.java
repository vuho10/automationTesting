package Ex2;

import java.util.ArrayList;
import java.util.Scanner;

public class Computer {
    String nameComputer;
    int typeComputer;
    Computer(){};
    Computer ( String nameComputer, int typeComputer) {
        this.nameComputer = nameComputer;
        this.typeComputer = typeComputer;
    }
    String getNameComputer() {
        return this.nameComputer = nameComputer;

    }
    void setNameComputer(String newName)
    {
        this.nameComputer = newName;
    }
    int getTypeComputer() {
        return this.typeComputer = typeComputer;
    }
    void setTypeComputer( int newType) {
        this.typeComputer = newType;
    }

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Computer> listComputer = new ArrayList<Computer>();
        System.out.print("Enter number computer: ");
        int n = sc.nextInt();
        for ( int i = 0; i < n; i++) {
            System.out.println(String.format("Enter place %s", i+1));
            System.out.print("Enter name of computer: ");
            String name = sc.next();
            int type;
            while ( true ) {
                System.out.print("Enter type of computer: ");
                type = sc.nextInt();
                if ( type >= 1 && type <= 3 ) {
                    break;
                }
            }

            Computer computer = new Computer(name, type);
            listComputer.add(computer);
        }
        for ( int x = 0; x < listComputer.size(); x++) {
            System.out.println("");
            System.out.print("name " + listComputer.get(x).nameComputer + " - " + "type " + listComputer.get(x).typeComputer);
        }

    }
}
