class Solution {
    public int[] findEvenNumbers(int[] digits) {
        int[] digitCount = new int[10];
        for (int d : digits) digitCount[d]++;

        List<Integer> list = new ArrayList<>();

        for (int num = 100; num <= 998; num += 2) {
            int a = num / 100;
            int b = (num / 10) % 10;
            int c = num % 10;

            int[] temp = new int[10];
            temp[a]++;
            temp[b]++;
            temp[c]++;

            boolean valid = true;
            for (int i = 0; i < 10; i++) {
                if (temp[i] > digitCount[i]) {
                    valid = false;
                    break;
                }
            }
            if (valid) list.add(num);
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}
