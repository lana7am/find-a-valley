
/**
 *
 * @author Lana
 */

public class findvalley {
    
public static void main(String[] args) {

        int arr[] = {1,1,1};
        int valley = findvalley(arr,0, arr.length-1);
        System.out.println(valley +" with a value of "+arr[valley]);
    }

    public static int findvalley(int arr[], int left, int right)
    {
        int mid = left + (right - left) / 2; // splits the array into 2 search area

        
        if ((mid == 0 || arr[mid - 1] >= arr[mid]) 
        && (mid == arr.length - 1 || arr[mid + 1] >= arr[mid])){
            
            return mid;
        }
            
        
        /* checks if the index(mid) is at the first value or 
        the value on the left side of the index is larger than the value of the index 
        and 
        if the index is at the last element of the array or 
        the value on the right side of the index is larger than the value of the index 
        if the statment returns true it means that the value that the index is on is the valley 
        */
        
        if (mid > 0 && arr[mid - 1] < arr[mid]){
            
            
            return findvalley(arr, left, (mid - 1));}
        /*if the index(mid) is not the first value and the left side element is smaller 
        than the index then we call the function again but move the search to the leftside*/
        
        return findvalley(arr, (mid + 1), right);
        
        /* if both if statment don't apply this means that the array[i] > array[i + 1] 
        so we are going to call the function again but shift the search to the rightside */
    }
}

