package TicketMachine;

import java.util.Scanner;
public class TicketMachine {
    private float price;
    private float balance;
    private float total;

    public void setPrice(float price) {
        this.price = price;
    }

    public void insertMoney( float money) {
        boolean flag = true;
        Scanner in = new Scanner(System.in);
        while (flag) {
            if (money >= 0) {
                balance += money;
                System.out.println("请稍后！");
                flag = false;
            }else {
                System.out.println("ERROR ,请重试！");
                money = in.nextFloat();
            }
        }
    }

    public void getBalance() {
        System.out.println("您的余额为: " + balance );
    }

    public void printTicket(int piece) {
        boolean flag = true;
        int i = 0;
        Scanner in = new Scanner(System.in);
        while (flag || i < piece) {
            if(balance >= price) {
                System.out.println("--------------------");
                System.out.println("Your ticket is here");
                System.out.println("--------------------");
                piece++;
                total += price;
                balance = balance - price;
            }else {
                System.out.println("余额不足，请投币或退出");
                switch (in.nextLine()) {
                    case "投币" :
                        insertMoney(in.nextFloat());
                        break;
                    case "退出" :
                        flag = false;
                }
            }
        }
    }

    public void refund() {
        if(balance > 0) {
            System.out.println("Here you are : " + balance);
            System.out.println("谢谢惠顾！");
        }else {
            System.out.println("谢谢惠顾！");
        }

    }

    public void getTotal() {
        System.out.println("今天的营业总额：" + total);
        total = 0;
    }



}

