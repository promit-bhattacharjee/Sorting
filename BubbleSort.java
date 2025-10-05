package Sorting;

public class BubbleSort {
    class Solution {
        public int[] bubbleSort(int[] arr) {
            for(int i=0;i<arr.length-1;i++){
                for(int j=0;j<arr.length-i-1;j++){
                    if (arr[j]>arr[j+1]) {
                        int temp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                    }
                }
            }
            return arr;
        }
    }

    public static void main(String[] args) {
        BubbleSort out = new BubbleSort();
        BubbleSort.Solution sol = out.new Solution();
        int[] arr = { 5, 6,1, 3 };
       arr= sol.bubbleSort(arr);
       for(int i:arr) System.out.print(i+" ");
        
    }

}
