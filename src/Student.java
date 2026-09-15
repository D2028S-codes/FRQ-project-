public class Student {
    String studentName;
    int studentAbsences;
    public Student(String name, int Absenses){
        studentName = name;
        studentAbsences = Absenses;
    }
    public String getName(){
        return studentName;
    }
    public int getAbsenceCount(){
        return studentAbsences;
    }
}
