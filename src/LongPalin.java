public class LongPalin {
    static String longestPalindrome(String s)
    {
        if (s == null || s.length() < 1) return "";

        int start = 0 , end = 0;
        for(int i = 0; i < s.length(); i++)
        {
            int len1 = expandAroundCenter(s, i, i); //odd position
            int len2 = expandAroundCenter(s, i, i+1); //even position
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2; // Update start index
                end = i + len / 2;        // Update end index
            }
        }
        return s.substring(start  , end + 1);
    }
    static int expandAroundCenter(String s, int left, int right)
    {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right))
        {
            left--;
            right++;
        }
        return right - left - 1;  // Length of the palindrome
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad"));
    }
}
