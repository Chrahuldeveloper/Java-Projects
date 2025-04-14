package SchoolManagement;

import java.util.HashMap;
import java.util.Map;

public class Student {

    private int studentID;
    public int feesPaid;
    public int totalFees;
    public String StudentName;
    public String grade;

    public Student(int id, String name, String grade, int feesPaid) {
        this.studentID = id;
        this.StudentName = name;
        this.grade = grade;
        this.feesPaid = feesPaid;
    }

    public Map<String, Object> getIndivialInfo(){
        Map<String,Object> studentInfo = new HashMap<>();
        studentInfo.put("feesPaid", this.feesPaid);
        studentInfo.put("totalFees", this.totalFees);
        studentInfo.put("StudentName", this.StudentName);
        studentInfo.put("grade", this.grade);
        return studentInfo;
    }

    public boolean payStudentFees(int amount) {
        if (amount == 0) {
            return false;
        }
        feesPaid += amount;
        return true;

    }

}