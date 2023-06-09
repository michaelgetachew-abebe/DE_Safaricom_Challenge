import java.io.BufferedReader;
import java.io.FileReader;

public class resource {

    private static void resource_handler(String path) {
        try {
            FileReader fr = new FileReader(path, UTF-8);
            BufferedReader br = new BufferedReader(fr, 1024);
            while (br != null) {
                String line = br.readLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            br.close();
            fr.close();
        }
    }
    public static void main(String[] args) 
    {
        resource_handler("../Q1-a/JavaMagicNumberProgram.java");
    }
}