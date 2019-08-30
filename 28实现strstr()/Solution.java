//KMP算法
class Solution {
    public int strStr(String S, String T) {
        if (T == null || T.length() == 0) return 0;
        int[] next = new int[T.length()];
        getNext(T, next);
        int i = 0;
        int j = 0;
        while (i < S.length() && j < T.length()) {
            if (j == -1 || S.charAt(i) == T.charAt(j)) {
                i++;
                j++;
            } else j = next[j];
        }
        if (j == T.length()) return i - j;
        return -1;


    }

    private void getNext(String t, int[] next) {
        next[0] = -1;
        int i = 0;
        int j = -1;
        while (i < t.length() - 1) {
            if (j == -1 || t.charAt(i) == t.charAt(j)) {
                i++;
                j++;
                next[i] = j;
            } else {
                j = next[j];
            }
        }
    }
}
