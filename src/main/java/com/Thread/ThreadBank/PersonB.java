package com.Thread.ThreadBank;

public class PersonB extends Thread {
    //创建银行对象
    Bank bank;

    //通过构造器传入银行对象，确保两个人进入的是一个银行
    public PersonB(Bank bank){
        this.bank = bank;
    }

    //重写run方法，在里面实现用ATM机取钱
    public void run(){
        while (Bank.money >= 200){
            //每次取200
            bank.ATM(200);
            try {
                //取完休息0.1s
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
