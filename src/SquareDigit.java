public class SquareDigit {
    static int sqd(int n)
    {
        int sum = 0;
        int res = 0;
        while( n > 0)
        {
            int temp = n % 10;
            temp *= temp;
            sum += temp;
            n = n / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sqd(123));
    }
}
