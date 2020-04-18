package com.zte.lgf;

public class Main {
    public static void main(String[] args){
        for(int i = 1; i <= 800; i++) {
            System.out.println(i + "=" + fibonacci(i));
        }
    }

    private static Num fibonacci(int limit){
        if(limit == 1 || limit == 2){
            return new Num("1");
        }
        int i = 3;
        Num first = new Num("1");
        Num second = new Num("1");
        Num tempNum;
        while(i++ <= limit){
            tempNum = first.add(second);
            first = second;
            second = tempNum;
        }
        return second;
    }
}
