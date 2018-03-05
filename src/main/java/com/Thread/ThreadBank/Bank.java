package com.Thread.ThreadBank;

/**
 * 两个人AB通过一个账户A在柜台取钱和B在ATM机取钱！

   程序分析：钱的数量要设置成一个静态的变量。两个人要取的同一个对象值
 */
public class Bank {

    //假设一个账户有1000块钱
    static int money = 1000;

    //柜台Counter取钱的方法,参数是每次取走的钱
    public void Counter(int money){
        //取钱后总数减少
        Bank.money -= money;
        System.out.println("A取走了"+money+"还剩下"+(Bank.money));
    }

    //ATM机取钱的方法
    public void ATM(int money){
        //取钱后总数减少
        Bank.money -= money;
        System.out.println("B取走了"+money+"还剩下"+(Bank.money));

    }
}
