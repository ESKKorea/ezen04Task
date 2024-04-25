package com.javalab.sort;


public class SelectionSort {
    public static void main(String[] args) {


        int[] arr = {7, 3, 9, 1};

        // 1회차 1 3 9 7
        // 2회차 1 3 9 7
        // 3회차 1 3 7 9


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
            for (int j = i + 1; j < n; j++) {

                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // 최소값과 현재 위치의 값을 교환
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}






