package iopack;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("C:\\Users\\welcome\\Desktop\\word &document files\\1.txt");
            fw.write("i am harish");
            fw.close();
            System.out.println("✅ File written successfully!");
        } catch (IOException e) {
            System.out.println("❌ Error writing file: " + e.getMessage());
        }
    }
}
