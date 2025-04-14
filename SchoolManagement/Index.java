package SchoolManagement;

public class Index {
    public static void main(String[] args) {
        System.out.println("School management system is running...");

        Student s1 = new Student(1, "Alice", "5", 500);
        s1.payStudentFees(3000);
        System.out.println(s1.grade);
        System.out.println(s1.getIndivialInfo());
        System.out.println(s1.feesPaid);

        try {
            System.in.read();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
