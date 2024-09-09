public class PerfectSq {
    static boolean perfectSquare(int n)
    {
        for(int i = 0; i * i <= n; i++)
        {
            if(i * i == n)
            {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int a = 27;
        if(perfectSquare(a))
        {
            System.out.println(a + " is a perfect square");
        }
        else
            System.out.println(a +" is not a perfect square");
    }
}
