package ru.spbstu.telematics.java;

import java.io.IOException;

//import org.junit.jupiter.api.Assertions;

import org.junit.Test;
import static org.junit.Assert.*;

public class TextWorkerTest {

    @org.junit.Test
    public void generateText() throws IOException {
        TextWorker test = new TextWorker();
        try {
            test.generateText();
            test.generateText();
            test.generateText();
            test.printText();
            test.generateText();
            test.printText();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        test.printText();
    }

    @org.junit.Test
    public void printText() throws IOException {
        TextWorker test = new TextWorker();
        try {
            test.printText();
            test.generateText();
            test.printText();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        test.printText();
    }
}
