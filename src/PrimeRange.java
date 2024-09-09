import java.util.ArrayList;
import java.util.List;

public class PrimeRange {
    static List<Integer> priRan(int s, int e)
    {
        List<Integer> priRan = new ArrayList<>();
        for (int i = s; i <= e; i++)
        {
            if (isPrime(i))
            {
                priRan.add(i);
            }
        }
        return priRan;
    }

    static boolean isPrime(int n)
    {
        int cnt = 0;
        for(int i = 1; i * i <= n; i++) {
            if(n % i == 0){
                cnt += 1;
                if(n / i != i)
                {
                    cnt += 1;
                }
            }
        }
        if(cnt == 2){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        int start = 10;
        int end = 50;
        List<Integer> primes = priRan(start, end);
        System.out.println("Prime numbers between " + start + " and " + end + ": " + primes);
    }
}
