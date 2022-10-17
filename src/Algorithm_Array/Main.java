package Algorithm_Array;

import java.util.Arrays;

public class Main {

    public static void bubblesSort(int[] arr){

        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i; j++) {
                if(arr[j]>arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }


        for (int i = arr.length -1; i > 0 ; i--) {
            for (int j = 0; j < i; j++) {
                if(arr[j] > arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
    }



    public static void insertionSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if(arr[j] < arr[j-1]){
                    int tmp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = tmp;
                }else{
                    break;
                }
            }
        }
    }

    public static void selectionSort(int[] arr){
//        for (int i = 0; i < arr.length; i++) {
//            int min = i;
//            for (int j = i+1; j < arr.length; j++) {
//                if(arr[j] < arr[min]){
//                    min = j;
//                }
//            }
//            int tmp = arr[i];
//            arr[i] = arr[min];
//            arr[min] = tmp;
//        }

        for (int i = arr.length-1; i > 0; i--) {
            int max = i;
            for (int j = i-1; j >= 0; j--) {
                if(arr[j] > arr[max]){
                    max = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[max];
            arr[max] = tmp;
        }
    }


    public static void main(String[] args) {
//        Test code
        int[] arr = {3, 5, 2, 7, 1, 4};
        bubblesSort(arr);
        System.out.println("버블 정렬: " + Arrays.toString(arr));

        arr = new int[]{3, 5, 2, 7, 1, 4};
        insertionSort(arr);
        System.out.println("삽입 정렬: " + Arrays.toString(arr));

        selectionSort(arr);
        System.out.println("선택 정렬: " + Arrays.toString(arr));

    }
}
