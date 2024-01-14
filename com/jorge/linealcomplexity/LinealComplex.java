package com.jorge.linealcomplexity;

import java.util.ArrayList;

public class LinealComplex {

    public  static void cuadraticOrder(ArrayList<Integer> list1, ArrayList<Integer> list2 ){
        int count = 0;

        for (int firstListNumber : list1) {
            for(int secondListNumber: list2){
                if(firstListNumber == secondListNumber){
                    count += 1;
                }
            }
        }
        System.out.println(count + " repeat");

    }

    public  static void linealComplex(ArrayList<Integer> list){

        //=======constant time complexity o(1)===========
        int sum = 0;
        int product = 1;
        //===============================================

        //=======lineal time complexity o(n)=============
        for(int number: list) {
            sum += number;
        }
        //===============================================

        //=======lineal time complexity o(n)=============
        for(int number: list) {
            product *= number;
        }
        //===============================================

        System.out.println("The sum is " + sum);
        System.out.println("The sum product is " + product);
    }

    public static void main(String[]args){
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(3);
        list2.add(4);
        linealComplex(list1);
        cuadraticOrder(list1,list2);
    }
}
