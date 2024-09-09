public class Mode {
    static int majority(int[] arr)
    {
        int n = arr.length;
        int cnt = 0;
        int elt = 0;
        for(int i = 0; i < n; i++)
        {
            if(cnt == 0)
            {
                elt = arr[i];
            }
            if(arr[i] == elt)
            {
                cnt++;
            }
            else
                cnt--;
        }
        return elt;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 4};
        System.out.println(majority(arr));
    }
}
