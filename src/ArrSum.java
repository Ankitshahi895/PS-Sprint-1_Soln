public class ArrSum {
    static int ArrSum(int[] arr){
        int n = arr.length;
        int sum = 0;
        for(int i = 0; i < n; i++)
        {
            sum +=arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int res = ArrSum(arr);
        System.out.println(res);
    }
}
