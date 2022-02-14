package com.lambdas;

import java.util.concurrent.Callable;

public class Runnables {
    public void methodAcceptingRunnable(Runnable r){
    }

    public void methodAcceptingCallable(Callable c){
    }

    public static void main(String[] args) {
        Runnable runnable = ()-> System.out.println("Hello, Lambda");

        new Runnables().methodAcceptingRunnable(runnable);

        new Runnables().methodAcceptingRunnable(()->{
            System.out.println("Complex lambda");
            persist();
            email();
        });

        Callable callable = ()->"Hello, Callable";
        new Runnables().methodAcceptingCallable(()->{
            return "Hello!";
        });

    }

    public static void email(){

    }
    public static void persist(){

    }

}
