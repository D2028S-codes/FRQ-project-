import java.util.*;
public class SeatingChart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.nextLine();
        System.out.println("Enter the number of absences.");
        int absences = sc.nextInt();

        Student s = new Student(name, absences);
        Student[][] seats = new Student[3][4];


    }
}