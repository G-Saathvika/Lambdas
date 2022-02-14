package com.lambdas;

import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;

public class PrimitiveFunctions {

    IntPredicate evenNumberPredicate = x->x%2==0;

    DoublePredicate doublePredicate = x->x>10;

    private void testPredicate(int i){
        System.out.println("Even number?"+evenNumberPredicate.test(i));
    }

    public static void main(String[] args) {
        int evenNum = 20;
        new PrimitiveFunctions().testPredicate(evenNum);
    }
}
