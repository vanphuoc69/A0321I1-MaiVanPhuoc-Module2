package case_study.services;

import case_study.models.Contract;

import java.util.Queue;
import java.util.Scanner;

public class ContractServiceImpl implements ContactService{
    public static void addContract(Queue<Contract> list){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập số hợp đồng");
        int inputNum=scanner.nextInt();
        scanner.skip("\\R");
        System.out.println("Nhập id booking");
        String inputBookId=scanner.nextLine();
        System.out.println("Nhập số tiền cọc trước");
        double inputDeposit=scanner.nextDouble();
        System.out.println("nhập tổng số tiền thanh toán");
        double inputAmount=scanner.nextDouble();
        scanner.skip("\\R");
        System.out.println("nhập id khách hàng");
        String inputCusId=scanner.nextLine();
        list.add(new Contract(inputNum,inputBookId,inputDeposit,inputAmount,inputCusId));
        displayConTract(list);
    }
    public static void editContract(Queue<Contract> list){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập số hợp đồng cần sửa");
        int inputId=scanner.nextInt();
        for(Contract contract:list){
            if(contract.getContractNumber()==inputId){
                scanner.nextLine();
                System.out.println("Nhập id booking");
                String inputBookId=scanner.nextLine();
                System.out.println("Nhập số tiền cọc trước");
                double inputDeposit=scanner.nextDouble();
                System.out.println("nhập tổng số tiền thanh toán");
                double inputAmount=scanner.nextDouble();
                scanner.skip("\\R");
                System.out.println("nhập id khách hàng");
                String inputCusId=scanner.nextLine();
                contract.setBookingId(inputBookId);
                contract.setDepositAmount(inputDeposit);
                contract.setTotalAmount(inputAmount);
                contract.setCustomerId(inputCusId);
                displayConTract(list);
            }
        }
    }
    public static void displayConTract(Queue<Contract> list){
        for(Contract contract:list){
            System.out.println(contract);
        }
    }
}
