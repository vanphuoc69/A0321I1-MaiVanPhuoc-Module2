package bai1_intro_java.thuc_hanh;

import java.util.Scanner;

public class dayOfMonth {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Which month that you want to count days? ");
        int month = scanner.nextInt();
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("The month '" + month + "' has 31 days!");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("The month '" + month + "' has 30 days!");
                break;
            case 2:
                System.out.println("28 or 29 day");
                break;
            default:
                System.out.println("errol");
                break;
        }
    }
}
