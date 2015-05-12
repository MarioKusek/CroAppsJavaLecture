package hr.fer.croapps;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadingFile {
    public static void main(String[] args) {
        // prints the file content
        try {
            String fileName =
                    "lib" + File.separator +
                            "src" + File.separator +
                            "main" + File.separator +
                            "java" + File.separator +
                            "hr" + File.separator +
                            "fer" + File.separator +
                            "croapps" + File.separator +
                            "ReadingFile.java";

            FileReader in = new FileReader(fileName);

            int c;
            while ((c = in.read()) != -1) {
                System.out.write(c);
            }

            in.close();
        } catch (FileNotFoundException e) {
            System.err.println( "Cannot find file: ReadingFile.java" );
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
    }

    }
}
