import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class MedicalLogReader {
    public static void main(String[] args) {
        File medicalLogFile = new File("medical_logs.txt");
        
        try (BufferedReader reader = new BufferedReader(new FileReader(medicalLogFile))) {
            System.out.println("Medical Log Contents:");
            System.out.println("---------------------");
            
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            
        } catch (FileNotFoundException e) {
            System.err.println("Error: Medical log file not found at " + medicalLogFile.getPath());
        } catch (IOException e) {
            System.err.println("Error reading medical log: " + e.getMessage());
        }
    }
}
