package com.samiksha;

public class Floor {
    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 8, 9,12};
        int target = 13;
        int ans = floor(arr, target);
        System.out.println(ans);
    }
    // returning the index: greatest number <= target
    static int floor(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(target < arr[mid]) {
                end = mid - 1;
            } else if(target > arr[mid]) {
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return end;
    }
}
