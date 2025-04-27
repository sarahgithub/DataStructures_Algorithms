import java.util.Arrays;
/*

SecondLargestElementInArray - We will sort the array first.
Time complexity : sorting + looping thru n elements
= O(nlogn) + O(n)
Space complexity: O(1)

 */
public class SecondLargestElementInArray {

    public static void main(String[] args) {
        int[] arr={1,9,4,9,6,4};
        int[] arr1=null;
        try{
            System.out.println("Second Largest Element is " + secondLargestElementOptimal(arr));
            System.out.println("Second Largest Element is " + secondLargestElementOptimal(arr1));

        }catch(IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
        }
    }

    /* Brute force approach */
    public static int secondLargestElement(int[] arr){

        //Throw exception if array is null or has less than 2 elements.
        if(arr==null || arr.length<2){
            throw new IllegalArgumentException("Array should be atleast 2 elements");
        }
        //Initialize secondLargest to Integer Min Value.
        int secondLargest=Integer.MIN_VALUE;
        //Sort the array.
        Arrays.sort(arr);

        //Largest element is last element after sorting.
        int largest=arr[arr.length-1];

        //Find second largest. Run the loop from end and find element that is not equal to largest element.
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]!=largest){
                secondLargest=arr[i];
                break;
            }
        }
        return secondLargest;
    }

    /*Better Approach - Here we get largest in first pass and second largest in second pass

    */

    /* Optimal Approach:
    Time Complexity: O(n)
    */

    public static int secondLargestElementOptimal(int[] arr) {

        //Throw exception if array is null or has less than 2 elements.
        if(arr==null || arr.length<2){
            throw new IllegalArgumentException("Array should be atleast 2 elements");
        }

        int largest=arr[0];
        int secondLargest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>largest){
                secondLargest=largest;
                largest=arr[i];
            }else if (arr[i]<largest && arr[i]>secondLargest){
                secondLargest=arr[i];
            }
        }
        return secondLargest;


    }

    }
