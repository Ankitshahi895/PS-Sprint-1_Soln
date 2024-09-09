public class Power {
    static int expo(int n , int e)
    {
        int res = 1;
        for(int i = 1; i <= e; i++)
        {
            res *= n;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(expo(5 , 5));
    }
}
