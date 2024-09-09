public class ReverseString {
    static String revStr(String s)
    {
        String sc = "";
        for(int i = s.length()-1; i >= 0; i--)
        {
            sc = sc + s.charAt(i);
        }
        return sc;
    }

    public static void main(String[] args) {
        String res = revStr("programming");
        System.out.println("reverse of programming is "+ res);
    }
}
