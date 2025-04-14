package SchoolManagement;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Student> students;
    private List<Teacher> teachers;

    public School() {
        students = new ArrayList<>();
        teachers = new ArrayList<>();
    }

    public void addNewStudent(Student student) {
        students.add(student);
    }

    public void addNewTeacher(Teacher teacher) {
        teachers.add(teacher);
    }
}
