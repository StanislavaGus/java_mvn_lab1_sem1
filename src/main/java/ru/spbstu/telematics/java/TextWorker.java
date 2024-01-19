package ru.spbstu.telematics.java;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class TextWorker {

    public static void generateText() throws IOException {
        try {
            FileWriter writer1 = new FileWriter("file1.txt", false);
            FileWriter writer2 = new FileWriter("file2.txt", false);

            for (int i = 1; i < 51; i++) {
                String tmpStr = "file 1: string " + Integer.toString(i) + "\n";
                writer1.write(tmpStr);

                tmpStr = "file 2: string " + Integer.toString(i) + "\n";
                writer2.write(tmpStr);
            }
            writer1.close();
            writer2.close();

        } catch (IOException e) {
            System.out.println("Возникла ошибка во время записи, проверьте данные.");

        }
    }

    public static void printText() throws IOException {
        try {
            BufferedReader reader1 = new BufferedReader(new FileReader("file1.txt"));
            BufferedReader reader2 = new BufferedReader(new FileReader("file2.txt"));
            String line1 = reader1.readLine();
            String line2 = reader2.readLine();
            while ((line1 != null) || (line2 != null)) {
                System.out.println(line1);
                line1 = reader1.readLine();
                System.out.println(line2);
                line2 = reader2.readLine();
            }
            reader1.close();
            reader2.close();

        } catch (IOException e) {
            System.out.println("Возникла ошибка во время считывания, проверьте данные.");

        }
    }
}
