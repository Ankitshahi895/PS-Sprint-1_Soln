public class StrLen {
    static int Strlen(String str)
    {
        int cnt = 0;
        for(int i = 0; i < str.length();i++)
        {
            cnt += 1;
        }
        return cnt;
    }

    public static void main(String[] args) {
        System.out.println(Strlen("Hello"));
    }
}
