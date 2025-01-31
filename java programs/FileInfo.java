import java.io.File;
import java.util.Scanner;

public class FileInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the file name from the user
        System.out.print("Enter the file name: ");
        String fileName = scanner.nextLine();
        
        // Create a File object
        File file = new File(fileName);
        
        // Check if the file exists
        if (file.exists()) {
            System.out.println("File exists: Yes");
            
            // Check if the file is readable
            System.out.println("Readable: " + file.canRead());
            
            // Check if the file is writable
            System.out.println("Writable: " + file.canWrite());
            
            // Get the type of file
            if (file.isFile()) {
                System.out.println("File type: Regular file");
            } else if (file.isDirectory()) {
                System.out.println("File type: Directory");
            } else {
                System.out.println("File type: Other");
            }
            
            // Get the length of the file in bytes
            System.out.println("File length (in bytes): " + file.length());
        } else {
            System.out.println("File does not exist.");
        }
        
        scanner.close();
    }
}
