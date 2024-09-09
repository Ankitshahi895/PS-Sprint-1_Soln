public class AddSingle {
    static int add(int n)
    {
        int s = sort(n);
        if(s > 9)
        {
            int res = sort(s);
        }
        return s;
    }
    static int sort(int a)
    {
        int sum = 0;
        while(a > 0)
        {
            int res = a % 10;
            sum += res;
            a = a / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int res = 9875;
        System.out.println(add(res));
    }
}
