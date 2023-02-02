import java.io.FileWriter;
import java.io.Writer;
public class file {
    public static void main(String args[]) {

        String data = "This is the data in the output file";

        try {
            // Creates a Writer using FileWriter
            Writer Output = new FileWriter("C:/Microsoft/javademo/SUJITH/src/Output.txt");


            // Writes string to the file
            Output.write(data);

            // Closes the writer
            Output.close();
        }

        catch (Exception e) {
            e.getStackTrace();
        }
    }
}

