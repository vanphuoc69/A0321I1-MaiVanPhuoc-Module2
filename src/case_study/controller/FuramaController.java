package case_study.controller;

import java.util.Scanner;

public class FuramaController {
    public void displayMainMenu(){
        Scanner scanner = new Scanner(System.in);
        int choice;
        System.out.println("Menu");
        System.out.println("1. Employee Management");
        System.out.println("2. Customer Management");
        System.out.println("3. Facility Management ");
        System.out.println("4. Booking Management ");
        System.out.println("5. Promotion Management ");
        System.out.println("6. Exit");
        System.out.println("Enter your choice ");
        choice = scanner.nextInt();
        switch (choice) {
            case 1:
                int choice1;
                System.out.println("Employee Management");
                System.out.println("1. Display list employees");
                System.out.println("2. Add new employee");
                System.out.println("3. Edit employee");
                System.out.println("4. Return main menu");
                System.out.println("Enter choice");
                choice1 = scanner.nextInt();
                switch (choice1){
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                }
            case 2:
                int choice2;
                System.out.println("Customer Management ");
                System.out.println("1. Display list customers");
                System.out.println("2. Add new customers");
                System.out.println("3. Edit customers");
                System.out.println("4. Return main menu");
                System.out.println("Enter choice");
                choice2 = scanner.nextInt();
                switch (choice2){
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                }
            case 3:
                int choice3;
                System.out.println("Facility Management ");
                System.out.println("1. Display list facility");
                System.out.println("2. Add new facility");
                System.out.println("3. Display list facility maintenance");
                System.out.println("4. Return main menu");
                System.out.println("Enter choice");
                choice3 = scanner.nextInt();
                switch (choice3){
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                }
            case 4:
                int choice4;
                System.out.println("Booking Management ");
                System.out.println("1. Add new booking");
                System.out.println("2. Display list booking");
                System.out.println("3. Create new contracts");
                System.out.println("4. Display list contracts");
                System.out.println("5. Edit contracts");
                System.out.println("6. Return main menu");
                System.out.println("Enter choice");
                choice4 = scanner.nextInt();
                switch (choice4){
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                }
            case 5:
                int choice5;
                System.out.println("Promotion Management");
                System.out.println("1. Display list customers use service");
                System.out.println("2. Display list customers get voucher");
                System.out.println("3. Return main menu");
                System.out.println("Enter choice");
                choice5 = scanner.nextInt();
                switch (choice5){
                    case 1:
                    case 2:
                    case 3:
                }
            case 6:
                System.exit(6);
        }
    }

    public static void main(String[] args) {
        FuramaController furamaController=new FuramaController();
        furamaController.displayMainMenu();
    }
}
