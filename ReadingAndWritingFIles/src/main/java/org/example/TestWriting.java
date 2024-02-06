package org.example;

import java.io.FileNotFoundException;

public class TestWriting {
    public static void main(String[] args) {
        String outputFilePath = "lookNames.txt";
        String[] names = {"Seana", "Mike", "Kate", "Billy"};
        try {
            WriteToFile.writeNames(outputFilePath, names);
        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
       }
    }
}
