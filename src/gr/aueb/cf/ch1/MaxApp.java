package gr.aueb.cf.ch1;

import java.util.Scanner;

public class MaxApp {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 5, 7};
        int MaxPos;


        MaxPos = getMaxPosition(arr, 0, arr.length - 1);
        if (MaxPos == -1) {
            System.out.println("no such element");
            System.exit(1);
        }
        System.out.println(arr[MaxPos]);
    }









        public static int getMaxPosition(int [] arr,int low, int high){
            int MaxPosition = 0;
            int MaxValue;

            if (( arr == null) || (arr.length < 1 ) ) return -1;
            if ( (low < 0 ) || (high > arr.length - 1 ) || (low > high)) {
                return -1;
            }
            MaxValue = arr[low];
            for (int i = low; i <= high; i++){
                if (arr[i] > MaxValue){
                    MaxValue = arr[i];
                    MaxPosition = i;

                }
            }
            return MaxPosition;


    }
}

