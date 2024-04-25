package com.javalab.sort;

public class SelectionSort {
    public static void main(String[] args) {


        int[] arr = {7, 3, 9, 1};

        selectionSort(arr);

        System.out.println("선택정렬된 배열:");

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void selectionSort(int[] arr) {

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1 ; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        }
    }
}






