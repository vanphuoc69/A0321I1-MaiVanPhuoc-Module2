package case_study.services;

import case_study.models.Customer;
import java.util.LinkedList;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService{
    public static void add(LinkedList<Customer> list){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập id khách hàng");
        String inputId=scanner.nextLine();
        System.out.println("nhập loại khách hàng (Diamond, Platinium, Gold, Silver, Member)");
        String inputType=scanner.nextLine();
        System.out.println("nhập địa chỉ khách hàng");
        String inputAddress=scanner.nextLine();
        list.add(new Customer(inputId,inputType,inputAddress));
        display(list);
    }
    public static void edit(LinkedList<Customer> list){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập id khách hàng cần sửa");
        String inputId=scanner.nextLine();
        for(Customer customer:list){
            if(customer.getCustomerId().equals(inputId)){
                System.out.println("nhập loại khách hàng");
                String inputType=scanner.nextLine();
                System.out.println("nhập địa chỉ khách hàng");
                String inputAddress=scanner.nextLine();
                customer.setCustomerType(inputType);
                customer.setCustomerAddress(inputAddress);
                display(list);
            }
        }
    }
    public static void display(LinkedList<Customer> list){
        for(Customer customer:list){
            System.out.println(customer);
        }
    }
}
