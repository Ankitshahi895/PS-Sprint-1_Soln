public class Palin {
    public static boolean palindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right)
        {
            if (s.charAt(left) != s.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "radar";
        if (palindrome(s)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}

