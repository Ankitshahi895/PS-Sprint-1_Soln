public class Narcissistic {
    static boolean isNarcissistic(int n)
    {
        int temp = n;
        int digits = countdig(n);
        int sum = 0;
        while (n > 0)
        {
            int res = n % 10;
            sum += (int) Math.pow(res , digits);
            n = n /10;
        }
        return temp == sum;
    }

    static int countdig(int n)
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
        if(isNarcissistic(153))
        {
            System.out.println("Narcissistic Number");
        }
        else {
            System.out.println("Not narcissistic Number");
        }
    }
}
