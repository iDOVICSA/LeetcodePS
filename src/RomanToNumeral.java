public class RomanToNumeral {
    public static int romanToInt(String s) {
        StringBuilder sb = new StringBuilder(s);
        int result = 0;
        for (int i = 0; i < sb.length(); i++) {
            switch (sb.charAt(i)) {
                case 'I':
                    if ((i + 1 < sb.length()) && (sb.charAt(i + 1) == 'V')) {
                        result = result + 4;
                        i++;
                    } else if ((i + 1 < sb.length()) && (sb.charAt(i + 1) == 'X')) {
                        result = result + 9;
                        i++;
                    } else result = result + 1;
                    break;
                case 'V':
                    result = result + 5;
                    break;
                case 'X':
                    if ((i + 1 < sb.length()) && (sb.charAt(i + 1) == 'L')) {
                        result = result + 40;
                        i++;
                    } else if ((i + 1 < sb.length()) && (sb.charAt(i + 1) == 'C')) {
                        result = result + 90;
                        i++;
                    } else result = result + 10;
                    break;
                case 'L':
                    result = result + 50;
                    break;
                case 'C':
                    if ((i + 1 < sb.length()) && (sb.charAt(i + 1) == 'D')) {
                        result = result + 400;
                        i++;
                    } else if ((i + 1 < sb.length()) && (sb.charAt(i + 1) == 'M')) {
                        result = result + 900;
                        i++;
                    } else result = result + 100;
                    break;
                case 'D':
                    result = result + 500;
                    break;
                case 'M':
                    result = result + 1000;
                    break;
            }

        }
        return result;
    }
}
