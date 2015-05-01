package com.hrzn.multithreading;

public class  MyThread implements Runnable{
int  num1=1000;
int num2;
MyThread(int i)
{
num2=i;
}


public synchronized void text1(){
System.out.println("value is:"+num1);
if(num1>=num2){
Thread name =Thread.currentThread();//name is of type Thread not String
System.out.println(name);
try
{
Thread.sleep(1000);
num1=num1-num2;
}
catch(Exception e){
	

System.out.println(e);
}
}
else	
System.out.println("no sufficient Balance");
}

public void run(){
text1();
}
}

