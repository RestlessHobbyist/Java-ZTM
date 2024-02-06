package org.example;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) {
        copyFile("sourceFile.txt", "destFile.txt");
    }
    public static void copyFile(String sourcePath, String destinationPath){
        try(FileReader reader = new FileReader(sourcePath);
            FileWriter writer = new FileWriter(destinationPath,true)){
            int intake;
            while((intake = reader.read()) != -1){
                writer.write(intake);
            }
        }catch(IOException e){
            System.out.println(e.getClass());
            System.out.println(e.getMessage());
        }
    }
}
