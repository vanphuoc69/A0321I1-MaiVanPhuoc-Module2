package case_study.manager;

import case_study.controllers.FuramaController;
import case_study.models.Facility;
import case_study.models.House;
import case_study.models.Room;
import case_study.models.Villa;
import case_study.services.FacilityServiceImpl;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class FacilityManager {
    static LinkedHashMap<Facility,Integer> linkedHashMap=new LinkedHashMap<>();
    public void facilityMenu(){
        linkedHashMap.put(new Room("buffet sáng"),4);
        linkedHashMap.put(new House("VIP",3),0);
        linkedHashMap.put(new Villa("tiêu chuẩn",20,2),0);
        System.out.println("Facility Management ");
        System.out.println("1. Display list facility");
        System.out.println("2. Add new facility");
        System.out.println("3. Display list facility maintenance");
        System.out.println("4. Return main menu");
        System.out.println("Enter choice");
        Scanner scanner=new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice){
            case 1:
                FacilityServiceImpl.display(linkedHashMap);
                break;
            case 2:
                int choice1;
                System.out.println("Add new facility");
                System.out.println("1. Add new Villa");
                System.out.println("2. Add new House");
                System.out.println("3. Add new Room");
                System.out.println("4. Return main menu");
                System.out.println("Enter choice");
                choice1 = scanner.nextInt();
                switch (choice1){
                    case 1:
                        FacilityServiceImpl.addVilla(linkedHashMap);
                        break;
                    case 2:
                        FacilityServiceImpl.addHouse(linkedHashMap);
                        break;
                    case 3:
                        FacilityServiceImpl.addRoom(linkedHashMap);
                        break;
                    case 4:
                        break;
                }
                break;
            case 3:
                FacilityServiceImpl.displayRepair(linkedHashMap);
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
