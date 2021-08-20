package case_study.services;

import case_study.models.Booking;

import java.util.Scanner;
import java.util.TreeSet;

public class PromotionServiceImpl implements PromotionService {
    public static void displayUse(TreeSet<Booking> list){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập năm sử dụng dịch vụ");
        String inputYear=scanner.nextLine();
        for(Booking booking:list){
            String checkStart=booking.getStartDay().substring(6);
            String checkEnd=booking.getEndDay().substring(6);
            if(checkStart.equals(inputYear)||checkEnd.equals(inputYear)){
                System.out.println(booking);
            }
        }
    }
}
