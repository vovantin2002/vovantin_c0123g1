package bai_17;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileNhiPhan {
    public static void copyFile(String sourcePath, String targetPath) throws IOException {
        // Open input and output streams
        FileInputStream in = new FileInputStream(sourcePath);
        FileOutputStream out = new FileOutputStream(targetPath);

        // Buffer to store byte data
        byte[] buffer = new byte[1024];

        // Counter to keep track of bytes copied
        int bytesRead = 0;

        // Copy file byte by byte
        while ((bytesRead = in.read(buffer)) > 0) {
            out.write(buffer, 0, bytesRead);
        }

        // Close streams
        in.close();
        out.close();

        // Check if source file and target file are the same
        if (new File(sourcePath).getCanonicalPath().equals(new File(targetPath).getCanonicalPath())) {
            System.out.println("Source file and target file are the same.");
        }
        else {
            // Print the number of bytes copied
            File targetFile = new File(targetPath);
            System.out.println("Bytes copied: " + targetFile.length());
        }
    }

    public static void main(String[] args) {
        // Get source file and target file paths from user inputs
        String sourcePath = args[0];
        String targetPath = args[1];

        try {
            copyFile(sourcePath, targetPath);
        } catch (IOException e) {
            System.err.println("Error copying file: " + e.getMessage());
        }
    }
}
