class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || numRows >= s.length()) {
            return s;
        }

        List<StringBuilder> rows = new ArrayList<>();
        for (int row = 0; row < numRows; row++) {
            rows.add(new StringBuilder());
        }

        int currentRow = 0;
        int direction = -1;

        for (char c : s.toCharArray()) {
            rows.get(currentRow).append(c);
            if (currentRow == 0 || currentRow == numRows - 1) {
                direction *= -1;
            }
            currentRow += direction;
        }

        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }

        return result.toString();
    }
}