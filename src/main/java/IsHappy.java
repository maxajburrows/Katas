import java.util.HashMap;
import java.util.HashSet;

public class IsHappy {
    HashSet<Integer> seenNumbers = new HashSet<>();
    int count = 0;
    public boolean isHappy(int n) {
        return splitN(n);
    }
    private boolean splitN(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        if (sum == 1) {
            return true;
        }
        if (seenNumbers.contains(sum)) {
            return false;
        }
        seenNumbers.add(sum);
        return splitN(sum);
    }
}
