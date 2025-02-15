import java.util.HashSet;
import java.util.Set;

public class IsHappy {
    Set<Integer> seenNumbers = new HashSet<>();
    public boolean isHappy(int n) {
        while (n != 1) {
            int sum = 0;
            while (n > 0) {
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }
            if (seenNumbers.contains(sum)) {
                return false;
            }
            seenNumbers.add(sum);
            n = sum;
        }
        return true;
    }
}
