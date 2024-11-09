package ch_02.sect_08;

import java.util.Arrays;

public class task_02_08_02 {
    public static void main(String[] args) {
        int[] numbers = {1, 19, 2, 83, 104};

        //toString
        System.out.println(Arrays.toString(numbers));

        //sort
        Arrays.sort(numbers);

        //binarySearch
        int index = Arrays.binarySearch(numbers, 83);
        System.out.println("index of 83 is " + index); //3

        //equals
        int[] numbers2 = {1, 2, 3, 50, 44};
        System.out.println("equals arrays? " + Arrays.equals(numbers, numbers2));//false


        //compare
        int[] array1 = {6, 7, 8, 11, 18, 8, 2, 5};
        int[] array2 = {3, 5, 9, 13, 28, 6, 8, 9};
        System.out.println("is array lexicographically same/greater/smaller " + Arrays.compare(array1, array2));//1
    }
}
