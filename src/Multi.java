public class Multi {
    static void table(int n)
    {
        int cnt = 1;
        while(cnt <= 10)
        {
            int res = n * cnt;
            System.out.println(n+" * "+cnt+" = "+res);
            cnt++;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        table(4);
    }
}
