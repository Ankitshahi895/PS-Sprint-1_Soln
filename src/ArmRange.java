import java.util.ArrayList;
import java.util.List;

/*                 THIS IS IMPORTANT              */

public class ArmRange {
    static List<Integer> findArmstrongNumbers(int start, int end) {
        List<Integer> armstrongNumbers = new ArrayList<>();

        for (int num = start; num <= end; num++) {
            int originalNumber = num;
            int sum = 0;
            int digits = countDigits(num);
            if (digits == 1 && num != 1) {
                continue;
            }

            while (num > 0) {
                int digit = num % 10;
                sum += Math.pow(digit, digits);
                num /= 10;
            }

            num = originalNumber;
            if (sum == originalNumber) {
                armstrongNumbers.add(originalNumber);
            }
        }
        return armstrongNumbers;
    }

    static int countDigits(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        int start = 1;
        int end = 500;
        List<Integer> result = findArmstrongNumbers(start, end);
        System.out.println(result);
    }
}