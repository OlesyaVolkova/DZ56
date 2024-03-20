//Даны два отсортированных массива данных произвольной длины.
//Написать метод, принимающий на вход 2 массива данных и возвращающий результирующий массив,
//состоящий из элементов обоих массивов, в отсортированном виде.

public class MergeArraysExample {

    public static void main(String[] args) {

        int[] firstArray = {1, 4, 7};
        int[] secondArray = {2, 3, 5, 6};


        int[] mergedArray = mergeSortedArr(firstArray, secondArray);


        for (int i = 0; i < mergedArray.length; i++) {
            System.out.print(mergedArray[i] + " ");
        }
    }


    public static int[] mergeSortedArr(int[] arr1, int[] arr2) {

        int[] merged = new int[arr1.length + arr2.length];

        int i = 0;
        int j = 0;
        int k = 0;


        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                merged[k] = arr1[i];
                i++;
            } else {
                merged[k] = arr2[j];
                j++;
            }
            k++;
        }


        while (i < arr1.length) {
            merged[k] = arr1[i];
            i++;
            k++;
        }

       while (j < arr2.length) {
            merged[k] = arr2[j];
            j++;
            k++;
        }

        return merged;
    }
}