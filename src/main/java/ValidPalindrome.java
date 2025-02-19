public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        String cleanedString = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        for (int i = 0; i < cleanedString.length() / 2; i++) {
            if (cleanedString.charAt(i) != cleanedString.charAt(cleanedString.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
