package filereader2;

import java.io.File;
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors

public class FileReader2 {

    public static void main(String[] args) {

        try {
            File testFile = new File("test.txt");
            if (testFile.createNewFile()) {
                System.out.println("File created: " + testFile.getName() + testFile.getPath());
            } else {
                System.out.println("File already exists." + testFile.getAbsolutePath());
            }
        } catch (IOException e) {
            System.out.println("Error occurred!!!!!!!!");
            e.printStackTrace();
        }

        try {
            FileWriter testWrite = new FileWriter("tests.txt");
            for (int i = 0; i < 10; i++) {
                testWrite.write("Szám:" +i +"\n");
            }
            testWrite.close();
            System.out.println("Successfully writed in te txt");

        } catch (IOException e) {
            System.out.println("Error occurred with the writer!!!!!!!!");
            e.printStackTrace();
        }
        

    }

}
