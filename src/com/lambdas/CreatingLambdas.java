package com.lambdas;

public class CreatingLambdas {
    interface Greeting{
        public String sayHello(String str);
    }

    public void testGreeting(String str,Greeting g){
        String result = g.sayHello(str);

        System.out.println("Result: "+result);
    }

    public static void main(String[] args) {

        new CreatingLambdas().testGreeting("Harry",(String s) -> "Hello, "+s);

        new CreatingLambdas().testGreeting("",(String s) -> !s.isEmpty()? "Howdy. "+s : "Did you miss something?");

    }
}