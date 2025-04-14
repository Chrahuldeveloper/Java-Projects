package SchoolManagement;

import java.util.HashMap;
import java.util.Map;

public class Teacher {

    private int teacherId;
    public int teacherAge;
    public String teacherName;
    public String teacherSubject;
    private int salary;

    public Teacher(int teacherId, int teacherAge, String teacherName, String teacherSubject, int salary) {
        this.teacherId = teacherId;
        this.teacherAge = teacherAge;
        this.teacherName = teacherName;
        this.teacherSubject = teacherSubject;
        this.salary = salary;
    }

    public boolean increaseSalary(int amount) {
        if (amount == 0 || amount == this.salary) {
            return false;
        }
        salary += amount;
        return true;
    }

    public void changeSubject(String subject) {
        this.teacherSubject = subject;
    }

    public Map<String, Object> getIndivialInfo(){
        Map<String,Object> teacherInfo = new HashMap<>();

        teacherInfo.put("teacherAge", this.teacherAge);
        teacherInfo.put("teacherName", this.teacherName);
        teacherInfo.put("teacherSubject", this.teacherSubject);

        return teacherInfo;


    }

    public boolean isEligibleForRetirement(int age) {
        if (age >= 65) {
            return true;
        }
        return false;
    }

}
