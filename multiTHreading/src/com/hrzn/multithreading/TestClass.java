package com.hrzn.multithreading;

public class TestClass{
public static void main(String args[]){
MyThread  m=new MyThread(500);
Thread t1=new Thread(m);
Thread t2=new Thread(m);
Thread t3=new Thread(m);
t1.setName("Swathi");
t2.setName("Swetha");
t3.setName("Anu");
t1.start();
t2.start();
t3.start();
}
}