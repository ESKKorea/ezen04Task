package com.javalab.sort;

public class BubbleSort {

    public static void main(String[] args) {

        int[] arr = {7, 3, 9, 1};

        bubbleSort(arr);

        System.out.println("버블 정렬된 배열:");

        for (int num : arr) {

            System.out.print(num + " ");
        }
    }


    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // 인접한 두 요소를 비교하여 정렬
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}