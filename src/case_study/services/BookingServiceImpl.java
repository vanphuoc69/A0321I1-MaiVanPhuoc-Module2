package case_study.services;

import case_study.models.Booking;

import java.util.Scanner;
import java.util.TreeSet;

public class BookingServiceImpl implements BookingService{
    public static void addBooking(TreeSet<Booking> list){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập id booking");
        String inputId=scanner.nextLine();
        System.out.println("Nhập ngày bắt đầu");
        String inputStart=scanner.nextLine();
        System.out.println("Nhập ngày kết thúc");
        String inputEnd=scanner.nextLine();
        System.out.println("nhập mã khách hàng");
        String inputCusId=scanner.nextLine();
        System.out.println("nhập tên dịch vụ");
        String inputName=scanner.nextLine();
        System.out.println("nhập loại dịch vụ");
        String inputType=scanner.nextLine();
        list.add(new Booking(inputId,inputStart,inputEnd,inputCusId,inputName,inputType));
        displayBooking(list);
    }
    public static void displayBooking(TreeSet<Booking> list){
        for(Booking booking:list){
            System.out.println(booking);
        }
    }
}
