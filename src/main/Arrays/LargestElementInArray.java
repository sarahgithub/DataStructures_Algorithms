import java.util.Arrays;

/*
LargestElementInArray: Find largest Element in Array.

Brute Force Solution: Sort the Array and get the last element of Array
TimeComplexity: O(n log n) ( to sort the array)
Space Complexity: O(1)

Optimal Solution: Loop through the Array and get the largest element.
Time Complexity: O(n) : You loop through the array once to find the largest element.
So if there are n elements, it takes O(n) time.

Space Complexity: O(1): You're using only a constant amount of extra space:
One variable largest to store the result.No extra data structures are created that grow with the input.
 */

public class LargestElementInArray {
    public static void main(String[] args) {
        //Scenario 1 - Regular array
        int[] arr1= {1,3,2,6,3,8,0,9,5,6};
        //Scenario 4 - Single Element Array
        int[] arr2={42};
        //Scenario 5 - All Elements are Same
        int[] arr3 = {7, 7, 7, 7, 7};
        //Scenario 6- Array with negative values only
        int[] arr4 = {-5, -9, -2, -8};
        //Scenario 7 - Array with Max integer value
        int[] arr5 = {Integer.MAX_VALUE, 1, 2};
        //Scenario 2 - Null array
        int[] arr6=null;
        //Scenario 3 - Empty array
        int[] arr7={};


        try {
            System.out.println("Largest Element in Array is : " + findLargestElementInArray(arr1));
            System.out.println("Largest Element in Array is : " + findLargestElementInArray(arr2));
            System.out.println("Largest Element in Array is : " + findLargestElementInArray(arr3));
            System.out.println("Largest Element in Array is : " + findLargestElementInArray(arr4));
            System.out.println("Largest Element in Array is : " + findLargestElementInArray(arr5));
            System.out.println("Largest Element in Array is : " + findLargestElementInArray(arr6));
            System.out.println("Largest Element in Array is : " + findLargestElementInArray(arr7));

        }catch (IllegalArgumentException e){
            System.out.println("Error " + e.getMessage());
        }
    }

    public static int findLargestElementInArray(int arr[]){
        //Check if Array is Null
        if(arr==null){
            throw new IllegalArgumentException("Array is Null");
        }
        //Check if Array is Empty
        else if (arr.length==0){
          throw new IllegalArgumentException("Array is Empty");
        }

        //Brute Force Approach
        //Arrays.sort(arr);
        //int largest=arr[arr.length-1];

       //Optimal Solution
        //Using Java 8 streams
        int largest = Arrays.stream(arr).max().getAsInt();

        //Using regular for loop
        /*int largest=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i] > largest){
                largest=arr[i];
            }
        }*/
        //Return the largest element value.
        return largest;
    }

}


