public class FibRange {
    static int fibP(int n)
    {
        if(n <= 1)
        {
            return n;
        }
        int a = 0;
        int b = 1;
        int fib = 0;
        for(int i = 2; i <= n; i++)
        {
            fib = a + b;
            a = b;
            b = fib;
        }
        return fib;
    }

    public static void main(String[] args) {
        System.out.println(fibP(5));
    }
}
