package bai_17;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileNhiPhan {
    public static void copyFile(String sourcePath, String targetPath) throws IOException {
        FileInputStream in = new FileInputStream(sourcePath);
        FileOutputStream out = new FileOutputStream(targetPath);

        byte[] buffer = new byte[1024];

        int bytesRead = 0;

        while ((bytesRead = in.read(buffer)) > 0) {
            out.write(buffer, 0, bytesRead);
        }

        in.close();
        out.close();

        if (new File(sourcePath).getCanonicalPath().equals(new File(targetPath).getCanonicalPath())) {
            System.out.println("Source file and target file are the same.");
        } else {
            File targetFile = new File(targetPath);
            System.out.println("Bytes copied: " + targetFile.length());
        }
    }

    public static void main(String[] args) {
        String sourcePath = args[0];
        String targetPath = args[1];

        try {
            copyFile(sourcePath, targetPath);
        } catch (IOException e) {
            System.err.println("Error copying file: " + e.getMessage());
        }
    }
}
