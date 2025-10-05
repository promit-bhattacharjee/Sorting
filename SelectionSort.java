package Sorting;

public class SelectionSort {
    class Solution {
        public int[] selectionSort(int[] arr) {
            for (int i = 0; i < arr.length - 1; i++) {
                // int smallest = Integer.MAX_VALUE;
                int smallestIdx = i;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[smallestIdx] > arr[j]) {
                        smallestIdx = j;
                    }
                }
                int temp=arr[i];
                arr[i]=arr[smallestIdx];
                arr[smallestIdx]=temp;
            }
            return arr;
        }
    }

    public static void main(String[] args) {
        SelectionSort out = new SelectionSort();
        SelectionSort.Solution sol = out.new Solution();
        int[] arr = { 5, 6, 1, 3 };
        arr = sol.selectionSort(arr);
        for (int i : arr)
            System.out.print(i + " ");

    }

}
