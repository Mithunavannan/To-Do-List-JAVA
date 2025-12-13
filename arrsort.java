import java.util.*;


public class arrsort {
    

        public static double calculateMedian() {
            int[] arr1 = {1, 4, 5};
            int[] arr2 = {2, 9, 8};

        int[] mergedArr = new int[arr1.length + arr2.length];
        System.arraycopy (arr1, 0, mergedArr, 0, arr1.length);
        System.arraycopy (arr2, 0, mergedArr, arr1.length, arr2.length);
       
        Arrays.sort(mergedArr);
         System.out.println("Sorted Array" +java.util.Arrays.toString (mergedArr));

        int length = mergedArr.length;
        int middleIndex = length /2;

        if (length / 2 == 1) {
            return mergedArr[middleIndex]; 
        } else{
            return ((mergedArr[middleIndex - 1] + mergedArr[middleIndex]) / 2.0);
        }
    }

    public static void main(String[] args) {
        
        double result = calculateMedian();
        System.out.println( "Median:"+ result);
        }

        
}
