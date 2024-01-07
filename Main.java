import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args) {

       FileOutputStream out = null;

        /*try {
            out = new FileOutputStream("output.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }*/


        // Creating file object and specifying path
        File file = new File("output.txt");

        try {
            FileInputStream input= new FileInputStream(file);
            int character;
            // read character by character by default
            // read() function return int between 0 and 255.

            while ((character = input.read()) != -1) {
                System.out.print((char)character);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }

}