public class BitwiseXor {

    public static int getMinStep(String binaryArr) {
        int result = 0;
        int i = 0;
        StringBuilder sb = new StringBuilder(binaryArr);
        while (i < binaryArr.length() -1) {
            if (sb.charAt(i) == '1') {
                if (sb.charAt(i + 1) == '1') {
                    result = result + 1;
                    sb.setCharAt(i, '0');
                    sb.setCharAt(i + 1, '0');
                    i = i + 2;
                } else {
                    result = result + 2;
                    sb.setCharAt(i, '0');
                    i = i + 2;
                }
            } else {
                i = i + 1;
            }
        }
        if (sb.charAt(binaryArr.length()-1)=='1') result = result+2;
        return result;
    }
}
