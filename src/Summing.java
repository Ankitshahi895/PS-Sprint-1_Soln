public class Summing {
    static void sum(int n)
    {
        int sum = 0;
        while (n > 0)
        {
            int res = n % 10;
            sum = sum + res;
            n = n / 10;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        sum(81);
    }
}
