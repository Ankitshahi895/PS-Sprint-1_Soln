public class VowelConst {
    static void vc(String s)
    {
        String sc = s.toLowerCase();
        int n = sc.length();
        int cntV = 0;
        int cntC = 0;
        for(int i = 0; i < n; i++)
        {
            char ch = sc.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            {
                cntV += 1;
            }
            else if(ch >= 'a' && ch <= 'z')
            {
                cntC += 1;
            }
        }
        System.out.println("vowel = "+ cntV +" consonent = "+ cntC);
    }

    public static void main(String[] args) {
        vc("hello world");
    }
}
