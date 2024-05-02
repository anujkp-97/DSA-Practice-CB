package LeetCode;

public class first_last_position {
    public static void print(int nums[], int target){
       
        int prev =-1;
        int next =-1;
        
        int low =0;
        int high = nums.length-1;

        while(low<=high)
        {
            int mid = (low+high)/2;

            if(nums[mid] == target)
            {
                if(nums[mid+1] == target){
                    prev = mid;
                    next = mid+1;
                }
                else{
                    prev = mid-1;
                    next = mid;
                }
                break;
            }
            else if(nums[mid] < target){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }

        // arr[0] = prev;
        // arr[1] = next;
        System.out.println(prev + " "+ next);
        


    }
    public static void main(String[] args) {
        int arr[] = {5,7,7,8,8,10};
        int target =8;

        print(arr, target);
    }
    
}
