public class Pyr {
    static void  pyramid(int n)
    {
        int num = 1;
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        pyramid(4);
    }
}
