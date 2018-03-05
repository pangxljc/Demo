package com.Thread.ThreadBank;

public class PersonA extends Thread {
    //创建银行对象
    Bank bank;

    //通过构造器传入银行对象，确保两个人进入的是同一个银行
    public PersonA(Bank bank){
        this.bank = bank;
    }

    //重写run方法，在里面实现柜台取钱
    public void run(){
        while (Bank.money >= 100){
            //每次取100
            bank.Counter(100);
            try {
                //取完休息0.1s
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
