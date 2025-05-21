class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if(digits.length() == 0){
            return result;
        }
        String[] mapping = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        backtrack(result, mapping, digits, "", 0);
        return result;
    }
    private void backtrack(List<String>result, String[] mapping, String digits, String current, int index){
        if(index == digits.length()){
            result.add(current);
            return;
        }
        String letters = mapping[digits.charAt(index) - '0'];
        for(int i = 0; i < letters.length(); i++){
            backtrack(result, mapping, digits, current + letters.charAt(i), index + 1);
        }
    }
}
