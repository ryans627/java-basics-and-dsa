package com.ryans.basics.homework.day05.hw02;

/**
 * 2、定义一个员工employee类，公有方法work()、sleep()。
 *
 * employee类有程序员（Coder），测试（Tester），经理（Manager）三个子类，都重写了work方法。
 *
 * a、使用多态的方式创建三个子类对象（父类类型接受子类对象），调用工作work和sleep方法。
 *
 * b、编写一个method方法能够同时接收Coder、Tester、Manager对象并且调用work和sleep方法。（多态）
 */
public class Employee {
    public void work() {
        System.out.println("我就是干活");
    }

    public void sleep() {
        System.out.println("我就是睡觉");
    }
}


