import java.util.ArrayList;
import java.util.List;

public class PriRanSum
{
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
        for(int i = 1; i * i <= n; i++)
        {
            if(n % i == 0)
            {
                cnt += 1;
                if(n / i != i)
                {
                    cnt += 1;
                }
            }
        }
        if(cnt == 2)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    static int sumOfPrimes(List<Integer> primes)
    {
        int sum = 0;
        for (int i = 0; i < primes.size(); i++) {
            sum += primes.get(i);
        }
        return sum;
    }

    public static void main(String[] args)
    {
        int start = 1;
        int end = 10;
        List<Integer> primes = priRan(start, end);
        int summ = sumOfPrimes(primes);
        System.out.println("Prime numbers between " + start + " and " + end + ": " + primes);
        System.out.println("Sum of Prime numbers is : "+ summ);
    }
}
