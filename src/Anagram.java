import java.util.Arrays;

public class Anagram {
    static boolean anagram(String s1 , String s2)
    {
        s1 = s1.replaceAll("\\s", "").toLowerCase();  //to remove all spaces and convert upperCase to lowerCase
        s2 = s2.replaceAll("\\s", "").toLowerCase();
        char[]  ch1 = s1.toCharArray();
        char[]  ch2 = s2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return Arrays.equals(ch1 , ch2);
    }

    public static void main(String[] args)
    {
        String str1 = "Listen";
        String str2 = "Silent";
        if(anagram(str1 , str2))
        {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}
