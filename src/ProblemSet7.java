public class ProblemSet7 {
    public static void main(String[] args) {

    }

    /*
     * Exercise 1.
     *
     * Given two strings, return a new string built by surrounding in with the first
     * and last two characters of out.
     */
    public static String surroundMe(String in, String out) {
        if(in == null || out == null || out.length() != 4){
            return in;
        }
        String firstCharOut = Character.toString(out.charAt(0)) + Character.toString(out.charAt(1));
        String lastCharOut = Character.toString(out.charAt(out.length()-2)) + Character.toString(out.charAt(out.length()-1)) ;
        String result = firstCharOut;
        for(int i = 0; i < in.length(); i++) {
            result += Character.toString(in.charAt(i));
        }
        result+=lastCharOut;
        return result;
    }

    /*
     * Exercise 2.
     *
     * Given a string and an integer, return a new string that represents the first
     * and last n characters of text (overlapping, as needed).
     */
    public static String endsMeet(String text, int n) {
        int textLength = text.length();
        if(text == null || textLength > 10 || textLength < 1 || n > textLength || n <=0){
            return text;
        }

        String firstHalf = text.substring(0, n);
        String secondHalf = text.substring(textLength-n, textLength);
        return firstHalf + secondHalf;
    }

    /*
     * Exercise 3.
     *
     * Given a string, return a new string using the middle three characters of text.
     */
    public static String middleMan(String text) {
        if(text == null || text.length()%2 != 1 || text.length() < 3){
            return text;
        }

        int strlength = text.length();
        return text.substring(strlength/2 - 1, strlength/2 + 2);
    }

    /*
     * Exercise 4.
     *
     * Given two strings, determine whether or not target is equivalent to the middle
     * three characters of text.
     */
    public static boolean isCentered(String text, String target) {
        String test = middleMan(text);
        if(test.length()%2 == 0 || test == null || target == null || target.length() != 3 || !test.equals(target)){
            return false;
        }
        return true;
    }

    /*
     * Exercise 5.
     *
     * Given a string and a character, compute the number of words that end in suffix.
     */
    public static int countMe(String text, char suffix) {
        if(text == null || !Character.isLetter(suffix)){
            return -1;
        }
        int count = 0;
        String[] arr = text.split(" ");
        for(String i : arr){
            if(i.charAt(i.length()-1) == suffix){
                count++;
            }
        }
        return count;
    }

    /*
     * Exercise 6.
     *
     * Given a string, compute the number of triplets in text.
     */
    public static int triplets(String text) {
        if(text == null){
            return -1;
        }
        int tripCount = 0;
        for(int i = 0; i < text.length()-1; i++){
            if(text.charAt(i) == text.charAt(i+1) && text.charAt(i) == text.charAt(i+2)){
                tripCount++;
            }
        }
        return tripCount;
    }

    /*
     * Exercise 7.
     *
     * Given a string, compute the sum of the digits in text.
     */
    public static long addMe(String text) {
        if(text == null){
            return -1;
        }
        long sum = 0;
        for(int i = 0; i < text.length(); i++){
            char dig = text.charAt(i);
            if(Character.isDigit(dig)){
                sum += Integer.parseInt(Character.toString(dig));
            }
        }
        return sum;
    }

    /*
     * Exercise 8.
     *
     * Given a string, compute the length of the longest sequence.
     */
    public static long sequence(String text) {
        if(text == null){
            return -1;
        }
        int length = text.length();
        boolean end = true;
        long count = 0;
        for(int i = 0; i < length; i++){
            char current = text.charAt(i);
            if(i < length - 1){
                if(current == text.charAt((i+1)) && end){
                    end = false;
                }
                if(i > 0){
                    if(current == text.charAt(i - 1) && current != text.charAt(i+1)){
                        end = true;
                        count ++;
                    }
                }
            }else if(i == length - 1){
                if(current == text.charAt((i-1))){
                    end = true;
                    count ++;
                }
            }
        }
        return count;
    }

    /*
     * Exercise 9.
     *
     * Given two strings, return a new string built by intertwining each of the
     * characters of a and b.
     */
    public static String intertwine(String a, String b) {
        String intertwine = "";
        int length = Math.max(a.length(), b.length());
        for(int i = 0; i < length; i++){
            if(i < a.length()){
                intertwine+=Character.toString(a.charAt(i));
            }
            if(i < b.length()){
                intertwine+=Character.toString(b.charAt(i));
            }
        }
        return intertwine;
    }

    /*
     * Exercise 10.
     *
     * Given a string, determine whether or not it is a palindrome.
     */
    public static boolean isPalindrome(String text) {
        if(text == null){
            return false;
        }
        String reverseText = "";
        for(int i = text.length()-1; i >= 0; i--){
            reverseText += Character.toString(text.charAt(i));
        }
        if(reverseText.equals(text)){
            return true;
        }else{
            return false;
        }
    }
}
