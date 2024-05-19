import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesFile {
    public static void main(String[] args) {

        // This class many methods from Map and some its own.
        Properties properties = new Properties();

        //Loading
        try (FileInputStream fis = new FileInputStream(new File(System.getProperty("user.home") + File.separator + "Desktop" + File.separator + "config.properties"))) {
            properties.load(fis);
        } catch (Exception e) {
            System.out.println("Could not load, file not found, New file will me created when saving.");
        }

        //Storing
        properties.setProperty("key1", "value1");
        //Retrieving
        System.out.println(properties.getProperty("key1"));

        //Saving
        try (FileOutputStream fos = new FileOutputStream(new File(System.getProperty("user.home") + File.separator + "Desktop" + File.separator + "config.properties"))) {
            properties.store(fos, "some description");
            System.out.println("File saved successfully");
        } catch (Exception e) {
            System.out.println("Error while saving.");
        }
    }
}