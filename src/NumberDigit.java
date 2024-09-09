public class NumberDigit {
    static int digit(int n)
    {
        int cnt = 0;
        if(n == 0)
            return 1;
        while(n > 0)
        {
            n = n / 10;
            cnt += 1;
        }
        return cnt;
    }

    public static void main(String[] args) {
        System.out.println(digit(1463));
    }
}
