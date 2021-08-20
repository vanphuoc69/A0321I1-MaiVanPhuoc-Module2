package case_study.manager;

import case_study.controllers.FuramaController;
import case_study.models.Customer;
import case_study.services.CustomerServiceImpl;

import java.util.LinkedList;
import java.util.Scanner;

public class CustomerManager {
    static LinkedList<Customer> linkedList=new LinkedList<>();
    public void customerMenu(){
        linkedList.add(0,new Customer("C1","Member","Hà Nội"));
        linkedList.add(1,new Customer("C2","Silver","Đà Nẵng"));
        linkedList.add(2,new Customer("C3","Gold","Huế"));
        System.out.println("Customer Management ");
        System.out.println("1. Display list customers");
        System.out.println("2. Add new customers");
        System.out.println("3. Edit customers");
        System.out.println("4. Return main menu");
        System.out.println("Enter choice");
        Scanner scanner=new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice){
            case 1:
                CustomerServiceImpl.display(linkedList);
                break;
            case 2:
                CustomerServiceImpl.add(linkedList);
                break;
            case 3:
                CustomerServiceImpl.edit(linkedList);
                break;
            case 4:
                FuramaController controller=new FuramaController();
                controller.displayMainMenu();
                break;
            default:
                System.err.println("Errol! Enter again");
                break;
        }
    }
}
