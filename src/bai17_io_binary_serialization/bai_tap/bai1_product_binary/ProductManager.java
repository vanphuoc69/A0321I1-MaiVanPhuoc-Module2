package bai17_io_binary_serialization.bai_tap.bai1_product_binary;

import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    static Scanner scanner=new Scanner(System.in);
    public static void add(LinkedList<Product> list){
        System.out.println("Nhập mã sản phẩm");
        String productId=scanner.nextLine();
        System.out.println("Nhập tên sản phẩm");
        String productName=scanner.nextLine();
        System.out.println("Nhập thương hiệu sản phẩm");
        String productBrand=scanner.nextLine();
        System.out.println("Nhập giá sản phẩm");
        double productPrice=scanner.nextDouble();
        scanner.skip("\\R");
        System.out.println("Nhập mô tả sản phẩm");
        String productDesc=scanner.nextLine();
        list.add(new Product(productId,productName,productBrand,productPrice,productDesc));
        write("D:\\BTcodegym\\Module2\\src\\bai17_io_binary_serialization\\bai_tap\\bai1_product_binary\\product.txt");
        display(list);
    }
    public static void search(LinkedList<Product> list){
        read("D:\\BTcodegym\\Module2\\src\\bai17_io_binary_serialization\\bai_tap\\bai1_product_binary\\product.txt");
        System.out.println("nhập tên sản phẩm bạn cần tìm");
        String input=scanner.nextLine();
        for(Product product:list){
            if (product.getProductName().equals(input)){
                System.out.println("có sản phẩm bạn cần "+product);
                return;

            }
        }
        System.out.println("không có sản phẩn bạn cần");
    }
    public static void display(LinkedList<Product> list){
        read("D:\\BTcodegym\\Module2\\src\\bai17_io_binary_serialization\\bai_tap\\bai1_product_binary\\product.txt");
        for (Product product:list){
            System.out.println(product);
        }
    }
    public static void write(String path){
        List<Product>list=new LinkedList<>();
        try {
            FileOutputStream fileOutputStream=new FileOutputStream(path);
            ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(list);
            objectOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void read(String path){
        List<Product>list=new LinkedList<>();
        try {
            FileInputStream fileInputStream=new FileInputStream(path);
            ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
            list=(List<Product>) objectInputStream.readObject();
            objectInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
