package com.khushboo;

public class CitiInterview implements Runnable{

    public void run(){
        System.out.println("Hello world");
    }

    public static void main(String[] args) {

        CitiInterview citi= new CitiInterview();

        Thread th = new Thread(citi);
        th.start();
    }

}
