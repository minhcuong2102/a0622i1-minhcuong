package bai_16.bai_tap.copy_file_text;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyFileExample {
    public static void main(String[] args) throws IOException {
        InputStream inStream = null;
        OutputStream outStream = null;

        try {
            inStream = new FileInputStream(new File("E:\\Codegym\\module_2\\src\\bai_16\\bai_tap\\copy_file_text\\source.txt"));
            outStream = new FileOutputStream(new File("E:\\Codegym\\module_2\\src\\bai_16\\bai_tap\\copy_file_text\\destination.txt"));

            int length;
            byte[] buffer = new byte[1024];

            while ((length = inStream.read(buffer)) > 0) {
                outStream.write(buffer, 0, length);
            }
            System.out.println("File is copied successful!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            assert inStream != null;
            inStream.close();
            assert outStream != null;
            outStream.close();
        }
    }
}
