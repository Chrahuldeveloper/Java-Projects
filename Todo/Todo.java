import java.util.ArrayList;
import java.util.Scanner;

class Todo {
    public static void main(String[] args) {
        ArrayList<String> todoList = new ArrayList<String>();
        Scanner scan = new Scanner(System.in);
        System.out.println("1.DeleteTask : ");
        System.out.println("2.ShowTodoList");
        System.out.println("3.AddTask");
        String userChoice = scan.nextLine();
        scan.nextLine();
        System.out.println(userChoice);
        if (userChoice.equalsIgnoreCase("1")) {
            System.out.println("Delete : ");
            String itemToRemove = scan.nextLine();
            if(todoList.size()<=0 || !todoList.contains(itemToRemove)) ){
                System.out.println("Error");
            }else{
                todoList.remove(itemToRemove);
            }
            System.out.println(todoList);
        } else if (userChoice.equalsIgnoreCase("2")) {
            for (String item : todoList) {
                System.out.println(item);
            }
        } else {
            System.out.println("AddTask : ");
            String task = scan.nextLine();
            todoList.add(task);
            System.out.println(todoList);
        }

    }
}