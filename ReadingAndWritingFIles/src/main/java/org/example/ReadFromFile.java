package org.example;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile {
    public static void readFile(String filePath){
        try(FileReader reader = new FileReader(filePath)){
            int input;
            while((input = reader.read()) != -1){
                System.out.print((char) input);
            }
        }catch(IOException e){
            System.out.println(e.getClass());
            System.out.println(e.getMessage());
        }
    }
}
