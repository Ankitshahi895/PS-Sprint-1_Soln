public class Gcd {
    static int GCD(int n , int m)
    {
        int res = 0;
        int n1 = n;
        while(m > 0)
        {
            res = n1 % m;
            n1 = m;
            m = res;
        }
        return n1;
    }

    public static void main(String[] args) {
        int result = GCD(48 , 18);
        System.out.println(result);
    }
}
