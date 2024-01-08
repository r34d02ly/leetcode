package funWithArrays;

/**
Given a fixed-length integer array arr, duplicate each occurrence of zero, shifting the remaining elements to the right.

Note. that elements beyond the length of the original array are not written. Do the above modifications to the input array in place and do not return anything.

Example 1:
Input: arr = [1,0,2,3,0,4,5,0]
Output: [1,0,0,2,3,0,0,4]
Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]

 Example 2:
Input: arr = [1,2,3]
Output: [1,2,3]
Explanation: After calling your function, the input array is modified to: [1,2,3]

Constraints:
1 <= arr.length <= 10^4
0 <= arr[i] <= 9
*/


public class Problem04 {
    public static void main(String[] args) {
        int[] nums1 = {1,0,2,3,0,4,5,0};
        int[] nums2 = {1,2,3};
        int[] nums3 = {0,0,0,0,0,0,0};

//        Problem04.duplicateZeros(nums1);
//        Problem04.duplicateZeros(nums2);
        Problem04.duplicateZeros(nums3);
    }

//    1,0,2,3,0,4,5,0
//    0 1 2 3 4 5 6 7
//      1 0 0

    public static void duplicateZeros(int[] arr){

        int[] newNums = new int[arr.length];
        int j = 0;
        for (int i = 0; i < newNums.length; i++) {

            if(j == newNums.length) break;

            if(arr[i] == 0) {
                newNums[j] = arr[i];
                j++;
                if(j == newNums.length) break;
                newNums[j] = 0;
            } else {
                newNums[j] = arr[i];
            }
            j++;
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = newNums[i];
        }

    }
}
