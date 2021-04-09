package application;

import java.io.File;
import java.util.Scanner;

public class ExWorkingWithFolders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a folder path");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        // Listar os diretorios
        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("FOLDERS:");
        for (File folder : folders) {
            System.out.println(folder);
        }

        // Listar os arquivos
        File[] files = path.listFiles(File::isFile);
        for(File file : files){
            System.out.println(file);
        }

        // criar uma pasta
        boolean success = new File(strPath + "\\subDirCreate").mkdir();
        System.out.println("Directory created successfully: " + success);

        sc.close();
    }
}
