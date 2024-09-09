public class Triangular {
    static int triangle(int n)
    {
        int sum = 0;
        for(int i = 0; i < n; i++)
        {
            sum = (n  * (n + 1)) / 2;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(triangle(1));
    }
}

