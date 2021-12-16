package com.codechef;
import java.lang.Thread;
public class Main {

    public static void main(String[] args) {
	// question2
    Prime thread1 = new Prime();
    Even thread2  = new Even();
    thread2.setPriority(10);
    thread2.start();
    thread1.start();
    }
}
class Prime extends Thread{
    public void run(){
        for(int i=10;i<=50;i++){
            if(i%2==0 || i%3==0 || i%5==0 || i%7==0){
                continue;
            }
            else{
                System.out.println(i);
            }
        }
    }
}
class Even extends Thread{
    public void run(){
        for(int i=50;i<=100;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}
