package application;

import java.io.File;
import java.util.Scanner;

public class ExFileInformation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a file path");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        System.out.println("getName: " + path.getName()); //nome do arquivo
        System.out.println("getParent: " + path.getParent()); //diretorio do arquivo
        System.out.println("getPath: " + path.getPath()); //caminho completo do arquivo

        sc.close();
    }
}
