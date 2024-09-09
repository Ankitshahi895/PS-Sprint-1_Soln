public class SeconLargest {
    static int secLar(int[] arr)
    {
        int n = arr.length;
        int largest = Integer.MIN_VALUE;
        int second_large = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++)
        {
            largest = Math.max(largest , arr[i]);
        }
        for (int i = 0; i < n; i++)
        {
            if(arr[i] > second_large && arr[i] != largest)
            {
                second_large = arr[i];
            }
        }
        return second_large;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 4, 45, 99};
        int res = secLar(arr);
        System.out.println(res);
    }
}
