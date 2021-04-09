package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ExBufferedWriterAndFileWriter {
    public static void main(String[] args) {

        String[] lines = new String[]{"Good morning", "Good afternoon", "Good bight"};
        String path = "c:\\temp\\out.txt";

        // FileWriter(path,true) > adiciona no arquivo
        // FileWriter(path) > cria e recria o aquivo

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path,true))) {
            for(String line:lines){
                bw.write(line);
                bw.newLine();
            }
        }catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
