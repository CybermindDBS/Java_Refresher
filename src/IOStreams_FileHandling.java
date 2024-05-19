import java.io.*;
import java.util.Scanner;

public class IOStreams_FileHandling {
    public static void main(String[] args) {
        // Reader or Writer means Character Streams
        // InputStream or OutputStream means Byte Streams

        // Some Example I/O are
        // BufferedReader and BufferedWriter
        // ObjectInputStream and ObjectOutputStream
        // FileInputStream and FileOutputStream

        try {
//          USER INPUT:
            String in;
//          Reading from User Input(method 1):
            Scanner sc = new Scanner(System.in);
            while (sc.hasNext())
                System.out.println(sc.nextLine());

//          Reading from User Input(method 2):
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            while ((in = br.readLine()) != null)
                System.out.println(in);


//          SERIALIZATION:
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("")));
            oos.writeObject(in);
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("")));
            in = (String) ois.readObject();


//          File Handling
            FileInputStream fis = new FileInputStream(new File(""));
            FileOutputStream fos = new FileOutputStream(new File(""));
            byte[] arr = new byte[1024];
            int bytesRead;
            while ((bytesRead = fis.read(arr)) != -1)
                fos.write(arr, 0, bytesRead);


        } catch (Exception e) {

        }
    }
}
