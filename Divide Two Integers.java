class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1){
            return Integer.MAX_VALUE;
        }
        boolean negative = (dividend < 0) ^ (divisor < 0);

        long absDividend = Math.abs((long) dividend);
        long absDivisor = Math.abs((long) divisor);
        long Quotient = 0;

        while (absDividend >= absDivisor){
            long temp = absDivisor;
            long multiple = 1;
            while (absDividend >= (temp << 1)){
                temp <<= 1;
                multiple <<= 1;
            }
            absDividend -= temp;
            Quotient += multiple;
        }
        return negative ? (int) -Quotient : (int) Quotient;
    }
}
