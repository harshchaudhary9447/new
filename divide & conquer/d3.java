public class d3 {

    public static int found(int arr[], int tar, int start, int end)
    {
        
        if(start>end)
        {
            return -1;
        }
        int  mid = (start+end)/2;

        if(arr[mid]==tar)
        {
            return mid;
        }  
      
        if(arr[start]<=arr[mid])
        {
            if(arr[start]<=tar && tar<=arr[mid])
            {
               return found(arr, tar, start, mid-1);
            }else{
              return found(arr, tar, mid+1, end);
            }
        }

        else{
        if( arr[mid]<=tar && tar<=arr[end])
            {
             return found(arr, tar, mid+1, end);
            }else{
             return found(arr, tar, start,  mid-1);
            }
            
        }
       
    }
    public static void main(String args[])
    {
         int arr[] = {4,5,6,7,8,0,1,2};
         int target =1;
         found(arr, target, 0, arr.length-1);
        
         System.out.println(found(arr, target, 0, arr.length-1));
    }
}
