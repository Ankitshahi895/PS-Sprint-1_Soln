public class Pascal {
    static void pascal(int n)
    {
        for(int i = 0; i < n; i++)
        {
            int cnt = 1;
            for(int j = 0; j <= i; j++)
            {
                System.out.print(cnt +" ");
                cnt = cnt * (i - j) / (j + 1);  // smjh nhi aya important hai ye first question nhi bna
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pascal(4);
    }
}
