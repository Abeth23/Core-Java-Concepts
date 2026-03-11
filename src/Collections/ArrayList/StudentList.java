import java.util.ArrayList;

public class StudentList {
    //unique values are stored in ArrayList, duplicates are allowed
    public static void main(String[] args){
        ArrayList<String> students=new ArrayList<>();
        students.add("John");
        students.add("Alice");
        students.add("Bob");

        System.out.println("Student List: " + students);

        students.remove("Alice");
        System.out.println("Updated Student List: " + students);
    }
}