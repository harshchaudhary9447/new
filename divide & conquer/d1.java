public class d1{

    public static void print(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    public static void fun(int arr[], int start, int end)
    {
        if(start>=end)
        {
            return;
        }
        
            int mid = start+(end-start)/2;

            fun(arr, start, mid);
            fun(arr, mid+1, end);

            merge(arr,start,mid,end);
        

    }
    public static void merge(int arr[],int si, int mi, int ei)
    {
        int temp[]= new int[ei-si+1];
        int i=si;
        int j=mi+1;
        int k=0;

        while(i<=mi && j<=ei)
        {
            if(arr[i]<arr[j])
            {
               temp[k]=arr[i];
               i++;
            }

            else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        if(i<=mi){
         while(i<=mi)
         {
            temp[k++]=arr[i++];
         }
        }
        else{
            while(j<=ei)
            {
                temp[k++]=arr[j++];
            }   
        } 
        for(k=0, i=si; k<temp.length;i++ , k++)
        {
            arr[i]=temp[k];
        }
    }
    public static void main(String args[])
    {
        int arr[]= {3,1,22,9};
        fun(arr, 0, arr.length-1);
        print(arr);
    }
}