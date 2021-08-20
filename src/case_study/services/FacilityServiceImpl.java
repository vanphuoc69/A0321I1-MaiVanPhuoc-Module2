package case_study.services;

import case_study.models.*;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;

public class FacilityServiceImpl implements FacilityService{
    public static void addRoom(LinkedHashMap<Facility,Integer> list){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập tên dịch vụ miễn phí đi kèm");
        String inputName=scanner.nextLine();
        list.put(new Room(inputName),0);
        display(list);
    }
    public static void addHouse(LinkedHashMap<Facility,Integer> list){
        Scanner scanner=new Scanner(System.in);
        scanner.nextLine();
        System.out.println("Nhập tiêu chuẩn phòng");
        String inputStandard=scanner.nextLine();
        System.out.println("Nhập số tầng");
        int inputFloor=scanner.nextInt();
        list.put(new House(inputStandard,inputFloor),0);
        display(list);
    }
    public static void addVilla(LinkedHashMap<Facility,Integer> list){
        Scanner scanner=new Scanner(System.in);
        scanner.nextLine();
        System.out.println("Nhập tiêu chuẩn phòng");
        String inputStandard=scanner.nextLine();
        System.out.println("Nhập diện tích hồ bơi");
        double inputArea=scanner.nextDouble();
        System.out.println("Nhập số tầng");
        int inputFloor=scanner.nextInt();
        list.put(new Villa(inputStandard,inputArea,inputFloor),0);
        display(list);
    }
    public static void display(LinkedHashMap<Facility,Integer> linkedHashMap){
        Set<Facility> keySet=linkedHashMap.keySet();
        for (Facility key:keySet){
                System.out.println(key + " " + linkedHashMap.get(key));
        }
    }
    public static void displayRepair(LinkedHashMap<Facility,Integer> linkedHashMap){
        boolean check=false;
        Set<Facility> keySet=linkedHashMap.keySet();
        for (Facility key:keySet){
            if(linkedHashMap.get(key)>=5){
                System.out.println(key + " " + linkedHashMap.get(key));
                check=true;
            }
        }
        if(!check){
            System.out.println("không có dịch vụ cần bảo dưỡng");
        }
    }
}
