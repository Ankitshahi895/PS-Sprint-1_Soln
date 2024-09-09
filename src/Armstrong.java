public class Armstrong {
    static void arm(int n)
    {
        int sum = 0;
        int a = n;
        while (n > 0)
        {
            int res = n % 10;
            sum += res * res * res;
            n = n / 10;
        }
        if(sum == a)
        {
            System.out.println(a +" is armstrong");
        }
        else
            System.out.println(a +" is not armstrong");
    }

    public static void main(String[] args) {
        arm(13); //we can also do this by user input
    }
}
