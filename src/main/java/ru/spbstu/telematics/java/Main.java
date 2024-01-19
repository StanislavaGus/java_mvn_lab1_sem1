package ru.spbstu.telematics.java;

import java.io.IOException;
//Чтение из двух файлов текстовой информации и запись данных в стандартный поток вывода по очереди
// построчно (строка из первого файла, затем строка из второго файла, итд)


public class Main {

    public static void main(String[] args) throws IOException {
        TextWorker text = new TextWorker();

        text.generateText();
        text.printText();

    }
}
