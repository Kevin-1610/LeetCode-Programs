class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] sMap = new int[512];
        int[] tMap = new int[512];

        for(int i = 0; i < s.length(); i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if(sMap[sChar] != tMap[tChar]){
                return false;
            }
            sMap[sChar] = i + 1;
            tMap[tChar] = i + 1;
        }
        return true;
    }
}
