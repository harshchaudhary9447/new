public class d2 {

    public static void fun(int arr[], int start, int end)
    {
        if(start>=end)
        {
            return;
        }

        int piv_ind = pivot( arr, start,  end);

        fun(arr, start, piv_ind-1);
        fun(arr, piv_ind+1, end);
    }

    public static int pivot(int arr[], int si, int ei)
    {
        for(int j=si; j<)
    }
    public static void main(String args[])
    {

    }
}
