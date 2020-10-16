package TicketMachine;

import java.util.Scanner;

public class TicketCmd {
    public static void main(String[] args) {
        TicketMachine ticketMachine = new TicketMachine();
        ticketMachine.setPrice(2);
        boolean flag = true;
        Scanner in = new Scanner(System.in);
        String str;
        System.out.println("欢迎使用");
        while (flag) {
            str = in.nextLine();
            switch (str) {
                case "投币" :
                    ticketMachine.insertMoney(in.nextFloat());
                    ticketMachine.getBalance();
                    break;
                case "请选票" :
                    ticketMachine.setPrice(in.nextFloat());break;
                case "打印车票" :
                    System.out.println("请输入票数");
                    ticketMachine.printTicket(in.nextInt());
                    ticketMachine.getBalance();
                    break;
                case "结束" : ticketMachine.refund();
                    System.out.println("==================================");
                    System.out.println("欢迎使用");
                    break;
                case "重启" :
                    ticketMachine.getTotal();flag = false;in.close();break;
            }


        }
    }
}
