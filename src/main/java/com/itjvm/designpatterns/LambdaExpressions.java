package com.itjvm.designpatterns;

public class LambdaExpressions {

    public static void main(String[] args) {


          // noisy code and can be simple replaced by lambda
//        Thread thread = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("inside another thread");
//            }
//        });

        // quite simply done with anonymous lambda
        Thread thread = new Thread(() -> System.out.println("inside another thread"));
        thread.start();
        System.out.println("inside main thread");
    }
}
