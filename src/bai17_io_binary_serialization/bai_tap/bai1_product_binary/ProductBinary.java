package bai17_io_binary_serialization.bai_tap.bai1_product_binary;

import java.util.LinkedList;
import java.util.Scanner;

public class ProductBinary {
    public static void main(String[] args) {
        LinkedList<Product> list=new LinkedList<>();
        list.add(new Product("AS","Asus Gaming","Asus",25000,"no des"));
        list.add(new Product("DE","Dell Attitude","DELL",30000,"no des"));
        list.add(new Product("LE","Lenovo","Lenovo",20000,"no des"));
        while (true){
            System.out.println("Menu");
            System.out.println("1. Add Product");
            System.out.println("2. Display Product");
            System.out.println("3. Search Product ");
            System.out.println("4. Exit ");
            System.out.println("Enter your choice ");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    ProductManager.add(list);
                    break;
                case 2:
                    ProductManager.display(list);
                    break;
                case 3:
                    ProductManager.search(list);
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Enter again!!");
            }
        }
    }
}
