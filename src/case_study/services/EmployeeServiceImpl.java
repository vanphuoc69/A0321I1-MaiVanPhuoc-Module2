package case_study.services;

import case_study.models.Employee;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService{
    public static void add(ArrayList<Employee> list){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập id nhân viên");
        String inputId=scanner.nextLine();
        System.out.println("nhập trình độ nhân viên (Trung cấp, Cao đẳng, Đại học và sau đại học)");
        String inputLevel=scanner.nextLine();
        System.out.println("nhập vị trí nhân viên (Lễ tân, phục vụ, chuyên viên, giám sát, quản lý, giám đốc)");
        String inputPosition=scanner.nextLine();
        System.out.println("nhập lương nhân viên");
        double inputSalary=scanner.nextDouble();
        list.add(new Employee(inputId,inputLevel,inputPosition,inputSalary));
        display(list);
    }
    public static void edit(ArrayList<Employee> list){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập id nhân viên cần sửa");
        String inputId=scanner.nextLine();
        for(Employee employee:list){
            if(employee.getEmployeeId().equals(inputId)){
                System.out.println("nhập trình độ nhân viên (Trung cấp, Cao đẳng, Đại học và sau đại học)");
                String inputLevel=scanner.nextLine();
                System.out.println("nhập vị trí nhân viên (Lễ tân, phục vụ, chuyên viên, giám sát, quản lý, giám đốc)");
                String inputPosition=scanner.nextLine();
                System.out.println("nhập lương nhân viên");
                double inputSalary=scanner.nextDouble();
                employee.setLevel(inputLevel);
                employee.setPosition(inputPosition);
                employee.setSalary(inputSalary);
                display(list);
            }
        }
    }
    public static void display(ArrayList<Employee> list){
        for(Employee employee:list){
            System.out.println(employee);
        }
    }
}
