package com.Thread.ThreadBank;

/**
 * 两个人AB通过一个账户A在柜台取钱和B在ATM机取钱
 */
public class BankTest {
    public static void main(String[] args) {
        //实例化一个银行对象
        Bank bank = new Bank();
        //实例化两个人，传入同一个银行对象
        PersonA personA = new PersonA(bank);
        PersonB personB = new PersonB(bank);
        //两个人开始取钱
        personA.start();
        personB.start();
    }
}
