public class Exercise7 {
    //a
    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
    //b
    public static void main(String[] args) {
        String input = "Baku";
        String result = reverseString(input);
        System.out.println("Original: " + input);
        System.out.println("Reverse: " + result);
    }
}