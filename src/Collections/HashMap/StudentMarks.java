import java.util.HashMap;

public class StudentMarks {
    public static void main(String[] args) {
        //to give key value pair we use put method
        HashMap<String, Integer> std = new HashMap<>();

        std.put("Abeth", 90);
        std.put("Bobby", 80);
        std.put("Cathy", 85);

        System.out.println(std);
    }
}