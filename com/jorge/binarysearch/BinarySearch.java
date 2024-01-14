package com.jorge.binarysearch;

import java.util.ArrayList;
import java.util.List;

public class BinarySearch {

    public static void main(String[] args) {
        ArrayList<Integer> listScope = new ArrayList<>(List.of(1, 3, 5, 8));
        int searchingValue = 5;
        Integer val = binarySearch(listScope, searchingValue);
        Integer position = binarySearch2(listScope, searchingValue);

        if (val != null) {
            System.out.println("The number is " + val);
        } else {
            System.out.println("The search number is not present in the list");
        }

        System.out.println("the position are " + position);
    }


    public static Integer binarySearch(List<Integer> list, int searchingValue){

        if (list.isEmpty()) {return null;}

        int middlePoint = list.size() / 2;
        int valueInPosition = list.get(middlePoint);

        if (searchingValue == valueInPosition) {
            return valueInPosition;
        } else if (searchingValue > valueInPosition) {
            return binarySearch(list.subList(middlePoint + 1, list.size()), searchingValue);
        } else {
            return binarySearch(list.subList(0, middlePoint), searchingValue);
        }
    }

    public static Integer binarySearch2(List<Integer> list, int searchingValue) {
        int low = 0;
        int high = list.size() - 1;

        while (low <= high) {
            int mid = (low + high);
            int guess = list.get(mid);
            if (guess == searchingValue) {
                return mid;
            }
            if (guess > searchingValue) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
            return -1;

    }


}
