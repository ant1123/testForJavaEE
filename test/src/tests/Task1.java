package tests;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = null;
        try {
            File file = new File("resources/Task1.txt");
            scan = new Scanner(file);
            scan.useDelimiter("[/\\s\"\\d;:.,()'\\-]"); //also exclude digits and () symbols as they are not words
            while (scan.hasNext()) {
                String str = scan.next();
                if (str != null && str.length() > 0) System.out.println(str.toLowerCase());
            }
        } catch (Exception ex) {
            System.out.println("Error "+ ex);
        }
        finally {
            if(scan != null) scan.close();
        }
    }
}
