public class ArrMiss {
    static int missing(int[] n , int z)
    {
        int sum = 0;
        for(int i = 0; i < z - 1; i++)
        {
            sum += n[i];
        }
        int expSum = (z * (z + 1)) / 2;  //expected sum formula
        return expSum - sum;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5 };
        int n = 5;
        System.out.println(missing(arr , n));
    }
}
