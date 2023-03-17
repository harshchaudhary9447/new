public class rec4 {

    public static int fun(String str,int i,int j, int n)
    {
        int res =0;
       

        if(n==1)
        {
            return 1;
        }
       
        if(n<=0)
        {
            return 0;
        }
 
        res= fun(str, i+1, j, n-1)+fun(str, i, j-1, n-1)
        -fun(str, i+1, j-1, n-2);

        if(str.charAt(i)==str.charAt(j))
        {
            res++;
        }

        return res;
    }
    public static void main(String args[])
    {
        String str= "aba";
        int n=str.length();
        System.out.println(fun(str, 0, n-1, n));
    }
}
