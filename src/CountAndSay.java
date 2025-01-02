public class CountAndSay {

    public static String countAndSay(int n) {
        if (n==1) return "1";
        else return runLengthEncode(countAndSay(n-1));
    }

    public static String runLengthEncode(String input) {
        if (input == null || input.isEmpty()) {
            return "";
        }

        StringBuilder encoded = new StringBuilder();
        int count = 1;
        char currentChar = input.charAt(0);

        for (int i = 1; i < input.length(); i++) {
            char nextChar = input.charAt(i);
            if (nextChar == currentChar) {
                count++;
            } else {
                encoded.append(count).append(currentChar);
                currentChar = nextChar;
                count = 1;
            }
        }
        encoded.append(count).append(currentChar);
        return encoded.toString();
    }
}
