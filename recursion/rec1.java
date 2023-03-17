public class rec1
{
    public static void fun(int arr[], int index, int value,int str)
    {
      
        if(index== arr.length)
        {
            return;
        }
        if(arr[index]==value)
        {
            str= index;
            System.out.print(str+" "); 
        } 
        fun(arr, index+1, value,str);
           
    }
    public static void main(String[] args) {
        int arr[]={3,2,4,5,6,2,7,2,2};
        int index=0;
        int value= 2;
        int str=0;
        fun(arr, index, value,str);
        
    }
}