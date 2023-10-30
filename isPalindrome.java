public class isPalindrome {
        public static void main(String[] args) {
            System.out.println(isPalindrome.isEnglishPalindrome("Madam, I'm Adam."));
        }
    public static boolean isEnglishPalindrome(String s) {
        int front = 0;
        int back = s.length() - 1;
        while (front > back) {
            if (!Character.isLetter(s.charAt(front)))
                front++;
            else if (!Character.isLetter(s.charAt(back)))
                back--;
            else if (Character.toUpperCase(s.charAt(front)) == Character.toUpperCase(s.charAt(back))) {
                front++;
                back--;
            }
            else
                return false;
        }
        return true;
    }
}





