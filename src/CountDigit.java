public class CountDigit {
    static int spec_digit(int n , int target)
    {
        int cnt = 0;
        while (n > 0)
        {
            int res = n % 10;
            if (res == target)
            {
                cnt += 1;
            }
            n = n / 10;
        }
        return cnt;
    }

    public static void main(String[] args) {
        System.out.println(spec_digit(122333 , 2));
    }
}
