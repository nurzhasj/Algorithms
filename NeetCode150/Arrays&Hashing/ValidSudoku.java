class Solution {
    public boolean isValidSudoku(char[][] board) {
        int rows = board.length;
        int cols = board[0].length; 
        int[] arr; 

        for (int i = 0; i < rows; i++) {
            arr = new int[rows];

            for (int j = 0; j < cols; j++) {
                if (board[i][j] != '.') {
                    arr[board[i][j] - '1']++;
                
                    if (arr[board[i][j] - '1'] > 1) {
                        return false;
                    }
                }
            }
        }

        for (int i = 0; i < rows; i++) {
            arr = new int[rows];

            for (int j = 0; j < cols; j++) {
                if (board[j][i] != '.') {
                    arr[board[j][i] - '1']++;
                
                    if (arr[board[j][i] - '1'] > 1) {
                        return false;
                    }
                }
            }
        }

        List<Set<Integer>> list = new ArrayList<>();

        for (int i = 0; i < rows; i++) {
            list.add(new HashSet<Integer>());
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (board[i][j] != '.') {
                    if (! list.get((i / 3) * 3 + (j / 3)).add(board[i][j] - '0')) {
                       return false;
                    }
                }
            }
        }

        return true;
    }
}
