/*
isArraySorted: We want to check if the array is sorted or not.
We run a for loop and check if the previous element is smaller or equal to next element
then array is sorted in ascending order.
Time Complexity: O(n) - because for loop run for almost n times.
Space Complexity : O(1) - not using any extra variables, so space stays constant.
 */

public class IsArraySorted {

    public static void main(String[] args) {
        try {


            int[] arr = {1, 2, 3, 4, 5, 6, 7};
            System.out.println("Arr: " + arr + " is sorted " + checkIfArraySorted(arr));
            int[] arr1 = {8, 7, 6, 5, 4, 3};
            System.out.println("Arr: " + arr + " is sorted " + checkIfArraySorted(arr1));
            int[] arr2 = null;
            System.out.println("Arr: " + arr + " is sorted " + checkIfArraySorted(arr2));
            int[] arr3 = {};
            System.out.println("Arr: " + arr + " is sorted " + checkIfArraySorted(arr3));
        } catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

    }

    public static boolean checkIfArraySorted(int[] arr){
        if(arr==null){
            throw new IllegalArgumentException("Array is null");
        } else if
            (arr.length==0){
            throw new IllegalArgumentException("Array is empty");
        }
        for(int i=1;i<arr.length;i++){
            if(arr[i]>=arr[i-1]){

            }else {
                return false;
            }
        }
        return true;

    }
}
