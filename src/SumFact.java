import java.nio.file.attribute.FileAttribute;

public class SumFact {
    static int Fact(int n){
        if(n <= 1)
            return 1;
        else
            return n * Fact(n - 1);
    }
    static int count(int a)
    {
        int sum = 0;
        while (a > 0)
        {
            int res = a % 10;
            sum += res;
            a = a / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int a = Fact(4);
        System.out.println(count(a));
    }
}
