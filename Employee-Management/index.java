import java.util.Scanner;

public class index {

    // Employee Object
    static class Employee {
        private String name;
        private int age;
        private String phone;
        private String address;
        private String company;

        public Employee(String name, int age, String phone, String address, String company) {
            this.name = name;
            this.age = age;
            this.phone = phone;
            this.address = address;
            this.company = company;
        }

        public String getName() {
            return this.name;
        }

        public int getAge() {
            return this.age;
        }

        public String getPhone() {
            return this.phone;
        }

        public String getAddress() {
            return this.address;
        }

        public String getCompany() {
            return this.company;
        }
    }

    // Enter the Employee data
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Employee Name : ");
        String name = scan.next();

        System.out.println("Enter Employee Age : ");
        int age = scan.nextInt();

        System.out.println("Enter Employee Phone : ");
        String phone = scan.next();

        System.out.println("Enter Employee Address : ");
        String address = scan.next();

        System.out.println("Enter Employee Company : ");
        String company = scan.next();

        if (!name.isEmpty() && age > 0 && !company.isEmpty() && !phone.isEmpty() && phone.length() == 10
                && !address.isEmpty() && !company.isEmpty()) {
            Employee employee = new Employee(name, age, phone, address, company);
            System.out.println("Employee Details:");
            System.out.println("Name: " + employee.getName());
            System.out.println("Age: " + employee.getAge());
            System.out.println("Phone: " + employee.getPhone());
            System.out.println("Address: " + employee.getAddress());
            System.out.println("Company: " + employee.getCompany());

        } else {
            System.out.println("Incomplete data. Please fill in all fields");
        }
    }
}
