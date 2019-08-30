class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashMap<String,Integer>[] rows = new HashMap[9];
        HashMap<String,Integer>[] cols = new HashMap[9];
        HashMap<String,Integer>[] subs = new HashMap[9];
        for(int i=0;i<9;i++){
            rows[i] = new HashMap<String,Integer>();
            cols[i] = new HashMap<String,Integer>();
            subs[i] = new HashMap<String,Integer>();
        }
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                int k = j/3 + i/3 * 3;
                String str = String.valueOf(board[i][j]);
                if(str.equals("."))
                    continue;
                rows[i].put(str,rows[i].getOrDefault(str,0)+1);
                cols[j].put(str,cols[j].getOrDefault(str,0)+1);
                subs[k].put(str,subs[k].getOrDefault(str,0)+1);
                if(rows[i].get(str) > 1 || cols[j].get(str) > 1 || subs[k].get(str) > 1)
                    return false;
            }
        }
        return true;
    }
}