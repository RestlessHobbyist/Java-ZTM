package org.example;

public class TestReading {
    public static void main(String[] args) {
        String fileLocation = "testFiles.txt";
        ReadFromFile.readFile(fileLocation);
        System.out.println("Graceful exit");
    }
}
