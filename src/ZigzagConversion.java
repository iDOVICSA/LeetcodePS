public class ZigzagConversion {

    /**
     * 0+       6+        12+
     * 1+    5+ 7+    11+ 13+
     * 2+  4+   8+  10+   14+
     * 3+       9+        15+
     * expected output is = 0 6 12 1 5 7 11 13 2 4 8 10 14 3 9 15
     * 0 6 12 : first row
     * 1 5 7 11 13 : second row
     * 2 4 8 10 14 : third row
     * 3 9 15 : last row
     * notice that these numbers represents chars only
     * in this example we can notice that in each zigzag (0-9) down+diagonal+down  first and last rows have only two chars 0-6   and 3-9
     * but other rows have 3 chars two in the columns and one in the diagonal 1-5-7 __ 2,4,8
     * that why we seperate first and last rows processing from other rows
     * in this case
     * advanceBy = 2*(4-1) = 6 ; so first and last rows chars advance always by 6 : 0 6 12 18 .... and 3 9 15 ....
     * advanceBy = 2 * (numRows - 1) because  (numRows -1 on the columns) + (numsRows-1 on diagonal) = 2*(numsRows-1)
     * <p>
     * for middle rows :
     * for example second 1 5 7 11 13 the  changes once it is 4 next time is 2
     * for example third row : 2 4 8 10 14 the  is changing between  2  4
     * notice that the sum of the two values that middle rows advancing by  is 2*(numRows-1) == the advanceBy variable
     * b so this formula will give two values that switches
     * cte = advanceBy - cte;
     */
    public static String convert(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows) return s; // specific cases
        int advanceBy = 2 * (numRows - 1);
        int offset = 0;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            if (i == 0 || i == numRows - 1) { // first and last rows
                result.insert(offset, s.charAt(i));
                offset++;
                int nextPos = i + advanceBy; // next pos is where we are currently + (numRows -1 on the columns) + (numsRows-1 on diagonal) = i + 2*(numsRows-1)
                while (nextPos < s.length()) {
                    result.insert(offset, s.charAt(nextPos));
                    offset++;
                    nextPos = nextPos + advanceBy; // next pos is where we are currently + (numRows -1 on the columns) + (numsRows-1 on diagonal) = i + 2*(numsRows-1)
                }
            } else { // middle rows (other rows)
                result.insert(offset, s.charAt(i));
                offset++;
                int nextPos = advanceBy - i;
                int cte = nextPos - i;
                while (nextPos < s.length()) {
                    result.insert(offset, s.charAt(nextPos));
                    offset++;
                    cte = advanceBy - cte;
                    nextPos = nextPos + cte;
                }
            }
        }
        return result.toString();
    }
}
