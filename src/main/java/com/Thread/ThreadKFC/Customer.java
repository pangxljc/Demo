package com.Thread.ThreadKFC;

public class Customer extends Thread {
    KFC kfc;
    //KFC要传入，保证每一个服务员和用户在同一个KFC对象内
    public Customer(KFC kfc){
        this.kfc = kfc;
    }

    public void run(){
        //每次要消费食物的数量
        int size = (int)(Math.random()*5);
        while (true){
            //在消费的方法里传入参数
            kfc.consu(size);
        }
    }

}
