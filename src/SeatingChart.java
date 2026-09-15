import java.util.*;
public class SeatingChart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of absences.");
        int absences = sc.nextInt();

        Student a = new Student("Jayden", 0);
        Student b = new Student("Max", 0);
        Student c = new Student("Bob", 0);
        Student d = new Student("jay", 0);
        Student e = new Student("Avery", 0);
        Student f = new Student("Emily", 0);
        Student g = new Student("Ava", 0);
        Student h = new Student("D", 0);
        Student[][] seats = new Student[3][4];
        seats[0][0] = a;
        seats[0][3] = b;
        seats[1][1] = c;
        seats[2][3] = d;
        seats[1][3] = e;
        seats[2][3] = f;
        seats[1][2] = g;
        seats[1][3] = h;




    }
}