public class rec2 {

    static String arr[]=  {"zero","one","two","three","four",
"five","six","seven","eight","nine",};

    public static void fun(int number)
    {
        if(number==0)
        {
            return;
        }

        int final_digit= number%10;
        fun(number/10);

        System.out.print(arr[final_digit]+" ");
    }
    public static void main(String[] args) {
        int number =2019;
        fun(number);
    }
}
