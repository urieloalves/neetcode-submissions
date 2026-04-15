class Solution {
    public int[] replaceElements(int[] arr) {

        // O(n^2) solution
        // int max;
        // for (int i = 0; i < arr.length; i++) {
        //     if(i == arr.length - 1) {
        //         arr[i] = -1;
        //         break;
        //     }
        //     max = 0;    
        //     for(int j = i + 1; j < arr.length; j++) {
        //         if (arr[j] > max) {
        //             max = arr[j];
        //         }
        //     }
        //     arr[i] = max;
        // }
        // return arr;

        // O(n) solution
        int max = -1;
        int temp;
        for(int i = arr.length - 1; i >= 0; i--) {
            temp = arr[i];
            arr[i] = max;
            max = Math.max(temp, max);
        }
        return arr;
    }
}