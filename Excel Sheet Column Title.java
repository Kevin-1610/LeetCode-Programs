class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        while(columnNumber > 0){
            int remainder = columnNumber % 26;
            if(remainder == 0){
                remainder = 26;
                columnNumber--;
            }
            sb.insert(0, (char)('A' + remainder - 1));
            columnNumber /= 26;
        }
        return sb.toString();
    }
}
