class Solution {
    public int minMaxDifference(int num) {
        String s = String.valueOf(num);
        int max = num, min = num;

        for(int i = 0; i < s.length(); i++){
            char originalDigit = s.charAt(i);
            for(char d = '0'; d <= '9'; d++){
                if(d != originalDigit){
                    String maxStr = s.replace(originalDigit, d);
                    max = Math.max(max, Integer.parseInt(maxStr));

                    String minStr = s.replace(originalDigit, d);
                    min = Math.min(min, Integer.parseInt(minStr));
                }
            }
        }
        return max - min;
    }
}
