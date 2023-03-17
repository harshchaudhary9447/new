import java.util.Arrays;

public class d5 {

    public static int fun(int arr[])
    {
        Arrays.sort(arr);
        int maxx = 0;
        int count =1;
        int k=0;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]==arr[i+1])
            {
                count++;
            }

            else {
               
                count =1;
                
            }
            maxx=Math.max(maxx,count);

            if(maxx>arr.length/2)
            {
                k= arr[i];
            }
        }
        return k;
    }
    public static void main(String args[])
    {
        int arr[]= {6,3,3};
        fun(arr);
        System.out.println(fun(arr));
    }
}
