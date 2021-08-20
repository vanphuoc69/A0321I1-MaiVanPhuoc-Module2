package case_study.controllers;

import case_study.manager.*;
import java.util.*;

public class FuramaController {
    public void displayMainMenu(){
        while (true){
            System.out.println("Menu");
            System.out.println("1. Employee Management");
            System.out.println("2. Customer Management");
            System.out.println("3. Facility Management ");
            System.out.println("4. Booking Management ");
            System.out.println("5. Promotion Management ");
            System.out.println("6. Exit");
            System.out.println("Enter your choice ");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    EmployeeManager employeeManager=new EmployeeManager();
                    employeeManager.employeeMenu();
                    break;
                case 2:
                    CustomerManager customerManager=new CustomerManager();
                    customerManager.customerMenu();
                    break;
                case 3:
                    FacilityManager facilityManager=new FacilityManager();
                    facilityManager.facilityMenu();
                    break;
                case 4:
                    BookingManager bookingManager=new BookingManager();
                    bookingManager.bookingMenu();
                    break;
                case 5:
                    PromotionManager promotionManager=new PromotionManager();
                    promotionManager.promotionMenu();
                    break;
                case 6:
                    System.exit(6);
                    break;
                default:
                    System.err.println("Errol! Enter again");
                    break;
            }
        }
    }
    public static void main(String[] args) {
        FuramaController furamaController=new FuramaController();
        furamaController.displayMainMenu();
    }
}
