package com.jorge.binarysearch;

import java.util.ArrayList;
import java.util.List;

public class BinarySearch {

    public static void main(String[] args) {
        ArrayList<Integer> listScope = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32));
        int searchingValue = 29;
        //Integer val = binarySearch(listScope, searchingValue);
        Integer position = binarySearch2(listScope, searchingValue);
        System.out.println("the position are " + position);
    }

    /***
     * Este metodo recursivo, si bien comple su funcion, es elegante y facil de leer tiene un problema.
     * Cada llamada recursiva añade una nueva capa en la pila de llamadas, lo que puede llevar a
     * un uso significativo de la memoria para listas muy grandes o búsquedas profundas.
     * @param list
     * @param searchingValue
     * @return
     */
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

    /***
     * En cada iteracion, se corta a la mitad el tamaño de la lista, o sea que cada vez es mas pequeña y la busqueda sera mas corta,
     * incluso si los numeros de la lista crecen.
     * Complejidad Logarítmica (O(log n)): Debido a que el algoritmo divide la lista a la mitad en cada iteración,
     * el número de pasos necesarios para llegar al resultado (o concluir que el valor no está en la lista)
     * crece logarítmicamente con respecto al tamaño de la lista. Esto es lo que llamamos complejidad logarítmica, denotada como O(log n).
     * @param list
     * @param searchingValue
     * @return
     */
    /*
     *
     * */
    public static Integer binarySearch2(List<Integer> list, int searchingValue) {
        int low = 0;
        int high = list.size() - 1;
        int step = 0;

        while (low <= high) {
            System.out.println("Paso " + ++step );
            int mid = (low + high)/2;
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
