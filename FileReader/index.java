import java.util.Scanner;
import java.io.*;

class index {
    public static void main(String[] args) {
        try {
            File file = new File("./index.txt");
            Scanner scanfile = new Scanner(file);
            while (scanfile.hasNextLine()) {
                String data = scanfile.nextLine();
                System.out.println(data);
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
        }

    }

}