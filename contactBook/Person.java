import java.util.Scanner;

class Person {

    public String name;
    public String number;

    public Person(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return this.name;
    }

    public String getNumber() {
        return this.number;
    }

    public void getInfo() {
        System.out.println("Name" + name);
        System.out.println("Phone" + number);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Person[] persons = new Person[2];

        for (int i = 0; i < 2; i++) {
            System.out.println("Name :");
            String Name = scan.next();
            System.out.println("Phone :");
            String Phone = scan.next();
            persons[i] = new Person(Name, Phone);
        }

        for (Person person : persons) {
            person.getInfo();
        }

    }

}