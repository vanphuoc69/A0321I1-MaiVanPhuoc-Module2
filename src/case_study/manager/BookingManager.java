package case_study.manager;

import case_study.controllers.FuramaController;
import case_study.models.Booking;
import case_study.models.Contract;
import case_study.services.BookingServiceImpl;
import case_study.services.ContractServiceImpl;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.TreeSet;

public class BookingManager {
    static TreeSet<Booking> treeSet=new TreeSet<>();
    static Queue<Contract> queue= new LinkedList<>();
    public void bookingMenu(){
        treeSet.add(new Booking("B1","10/10/2020","05/12/2021","C1","Villa","VIP"));
        //treeSet.add(new Booking("B2","21/3/2019","05/04/2019","C2","House","tiêu chuẩn"));
        treeSet.add(new Booking("B3","10/10/2020","05/04/2019","C3","Room","business"));
        queue.add(new Contract(100,"B1",500,2000,"C1"));
        queue.add(new Contract(101,"B2",500,3000,"C2"));
        System.out.println("Booking Management ");
        System.out.println("1. Add new booking");
        System.out.println("2. Display list booking");
        System.out.println("3. Create new contracts");
        System.out.println("4. Display list contracts");
        System.out.println("5. Edit contracts");
        System.out.println("6. Return main menu");
        System.out.println("Enter choice");
        Scanner scanner=new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice){
            case 1:
                BookingServiceImpl.addBooking(treeSet);
                break;
            case 2:
                BookingServiceImpl.displayBooking(treeSet);
                break;
            case 3:
                ContractServiceImpl.addContract(queue);
                break;
            case 4:
                ContractServiceImpl.displayConTract(queue);
                break;
            case 5:
                ContractServiceImpl.editContract(queue);
                break;
            case 6:
                FuramaController controller=new FuramaController();
                controller.displayMainMenu();
                break;
            default:
                System.err.println("Errol! Enter again");
                break;
        }
    }
}
