public class Fibo {
    static void fibo(int n) //n is the limit here
    {
        int i = 1;
        int x = 0;
        int y = 1;
        while (i <= n)
        {
            System.out.print(x + " ");
            int z = x + y;
            x = y;
            y = z;
            i++;
            if(x > 10)
                break;   //we can use arrayList here also but i don't have knowledge of arraylist so used break
        }
    }

    public static void main(String[] args) {
        fibo(10);
    }
}
