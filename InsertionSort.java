package Sorting;

public class InsertionSort {
    class Solution {
        public int[] insertionSort(int[] arr) {
            for(int i=1;i<arr.length;i++){
                int key=arr[i];
                int j=i-1;
                while (j>=0 && arr[j]>key) {
                    arr[j+1]=arr[j];
                    j--;
                    
                }
                arr[j+1]=key;
            }
            return arr;
        }
    }

    public static void main(String[] args) {
        InsertionSort out = new InsertionSort();
        InsertionSort.Solution sol = out.new Solution();
        int[] arr = { 5, 6,1, 3 };
       arr= sol.insertionSort(arr);
       for(int i:arr) System.out.print(i+" ");
        
    }

}
