package com.company;

public class Main {

    public static void main(String[] args) {
        int[] numbers = new int[]{9,8,7,6,5,4,3,2,1,0};

        int i;
        for (i = 0; i < numbers.length; i++)
        {
            for(int d:numbers){
            System.out.println(d);
        }
        }
    }
}
