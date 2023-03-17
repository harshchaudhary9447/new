public class d4 {

    public static void print(String arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

        public static void fun(String arr[], int si, int ei)
        {
            if(si>=ei)
            {
                return;
            }
            int mid = si+(ei-si)/2;
            fun(arr, si, mid);
            fun(arr, mid+1,ei);

            merge(arr,si,mid,ei);
        }

        public static void merge(String arr[], int si,int mid,int ei)
        {
            String temp[]= new String[ei-si+1];
            int i = si;
            int j= mid+1;
            int k=0;
            while(i<=mid && ei>=j)
            {
                if(arr[j].compareTo(arr[i])>0)
                {
                    temp[k]= arr[i];
                    i++;
                }
                else{
                    temp[k]= arr[j];
                    j++;
                }
                k++;
            }
            if(i<=mid){
            while(i<=mid){
                temp[k++]= arr[i++];
            }
        }
            else
            {
                while(j<=ei)
                {
                    temp[k++]= arr[j++];
                }
            }
            for( k=0,i=si; k<temp.length;k++)
            {
                arr[i]=temp[k];
                i++;
            }
        }
    public static void main(String args[])
    {
        String arr[] = { "sun", "earth", "mars", "mercury"};
        fun(arr, 0, arr.length-1);
        print(arr);
    }
}
