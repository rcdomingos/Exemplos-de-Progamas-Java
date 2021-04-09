package application;

import entities.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Product> productList = new ArrayList<>();

        System.out.println("Enter a products file: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            while (line != null) {
                String[] product = line.split(",");
                String name = product[0];
                double price = Double.parseDouble(product[1]);
                int quantity = Integer.parseInt(product[2]);

                productList.add(new Product(name, price, quantity));

                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }

        boolean success = new File(path.getParent() + "\\out").mkdir();

        String pathSumary = path.getParent() + "\\out\\sumary.csv";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(pathSumary))) {
            for (Product pr : productList) {
                bw.write(pr.getName() + "," + pr.totalPrice());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }

        sc.close();
    }
}
