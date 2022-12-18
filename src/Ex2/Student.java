package Ex2;

import java.util.Scanner;

public class Student {
    private String fullName;
    private int age;
    private double mathScore;
    private double physicSore;
    private double chemistryScore;

    public int getAge() {
        return age;
    }
    public double getChemistryScore() {
        return chemistryScore;
    }
    public String getFullName() {
        return fullName;
    }
    public double getMathScore() {
        return mathScore;
    }
    public double getPhysicSore() {
        return physicSore;
    }
    public double sumScore() {
        return this.chemistryScore + this.mathScore + this.physicSore;
    }

    public Student(String name, int age, double math, double physic, double chemistry){
        this.age= age;
        this.fullName = name;
        this.mathScore = math;
        this.physicSore = physic;
        this.chemistryScore = chemistry;
    }
    public boolean checkPassUniversity(double score) {
        if (this.countAverageScore() > score) {
            return true;
        }
        else{
            return false;
        }
    }
    public String  getResult(double studentScore, double univerScore) {
        if(studentScore >univerScore ){
            return "Y";
        }
        else{
            return "N";
        }
    }

    public double countAverageScore() {
        double avg = (this.sumScore())/3;
        return avg;
    }
    public void info() {
        System.out.println("Name: "+this.fullName + " " +"Math: "+
                this.mathScore + "Physics: "+this.physicSore+ " Chemistry: "+
                this.chemistryScore);
    }

}
/**
 * InnerStudent
 */
class Main {

    public void inputStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input sum of students:");
        int numStudent =sc.nextInt();
        sc.nextLine();
        Student[] students = new Student[numStudent];
        for (int i = 0; i < numStudent; i++) {
            System.out.print("Input name of student at "+( i+1) + ": ");
            String name = sc.nextLine();
            System.out.print("Input age of student at "+( i+1) + ": ");
            int age = sc.nextInt();
            System.out.print("Input math score of student at "+( i+1) + ": ");
            double math  = sc.nextDouble();
            System.out.print("Input chemistry score of student at "+( i+1) + ": ");
            double chemistry  = sc.nextDouble();
            System.out.print("Input physic score of student at "+( i+1) + ": ");
            double physic  = sc.nextDouble();
            sc.nextLine();
            students[i] = new Student(name, age, math, physic, chemistry);
        }
        inputUniversityScore(sc, students);

    }
    public void inputUniversityScore(Scanner sc,Student[] students) {
        System.out.println("Input CNTT score :");
        double cnttScore =  sc.nextDouble();
        System.out.println("Input GITV score :");
        double gtvtScore =  sc.nextDouble();
        System.out.println("Input DT score :");
        double dt =  sc.nextDouble();
        System.out.println("Result:");
        for (int i = 0; i < students.length; i++) {
            showListStudents(students[i], cnttScore, gtvtScore, dt);
        }
    }
    public void showListStudents(Student student,double cntt, double gtvt, double dt) {

        System.out.println(student.getFullName() + " "+ student.sumScore() + " " +
                student.getResult(student.sumScore(),cntt) + " " + student.getResult(student.sumScore(),gtvt) + " " +
                student.getResult(student.sumScore(),dt)
        );
    }

    public static void main(String[] args) {
        Main studentManagement = new Main();
        studentManagement.inputStudent();
    }

}
