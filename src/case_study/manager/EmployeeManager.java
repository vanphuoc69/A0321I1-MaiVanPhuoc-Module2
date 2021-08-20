package case_study.manager;

import case_study.controllers.FuramaController;
import case_study.services.EmployeeServiceImpl;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeManager {
    static ArrayList<case_study.models.Employee> list = new ArrayList<>();
    public void employeeMenu(){
        list.add(0,new case_study.models.Employee("E1","Trung cấp","Lễ tân",45000));
        list.add(1,new case_study.models.Employee("E2","Cao đẳng","Phục vụ",55000));
        list.add(2,new case_study.models.Employee("E3","Đại học","Quản lý",70000));
        System.out.println("Employee Management");
        System.out.println("1. Display list employees");
        System.out.println("2. Add new employee");
        System.out.println("3. Edit employee");
        System.out.println("4. Return main menu");
        System.out.println("Enter choice");
        Scanner scanner=new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice){
            case 1:
                EmployeeServiceImpl.display(list);
                break;
            case 2:
                EmployeeServiceImpl.add(list);
                break;
            case 3:
                EmployeeServiceImpl.edit(list);
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
