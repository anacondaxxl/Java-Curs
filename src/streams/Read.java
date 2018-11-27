package streams;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;

public class Read {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader( new FileReader ("src/streams/numbers.txt"));
            String numar;
            while ((numar = reader.readLine()) != null) {
                System.out.print(numar);
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
