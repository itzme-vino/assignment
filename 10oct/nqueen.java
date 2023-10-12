class Solution {

    public List<List<String>> solveNQueens(int n) {
        
        // Initialize the chess board with empty cells represented by '.'
        char[][] board = new char[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                board[i][j] = '.';
            }
        }

        // Initialize lists to store the solutions
        List<List<String>> res = new ArrayList<>();

        // Initialize arrays to keep track of used rows and diagonals
        int[] rows = new int[n];
        int[] diagonal = new int[2 * n - 1];
        int[] anti = new int[2 * n - 1];

        // Call the recursive solve method
        solve(0, board, res, rows, diagonal, anti);

        // Return the solutions
        return res;
    }

    // Recursive function to solve the N-Queens problem
    public void solve(int col, char[][] board, List<List<String>> res, int[] rows, int[] diagonal, int[] anti){

        // If all columns are filled with queens, add the solution to the list and return
        if(col == board.length){
            res.add(construct(board));
            return;
        }

        // Try placing a queen in each row of the current column
        for(int row = 0; row < board.length; row++){

            // Check if the current cell is safe for a queen
            
            if(rows[row] == 0 && diagonal[row + col] == 0 && anti[board.length - 1 + col - row] == 0){

                // Place the queen in the current cell
                board[row][col] = 'Q';

                // Mark the used row and diagonals
                rows[row] = 1;
                diagonal[row + col] = 1;
                anti[board.length - 1 + col - row] = 1;

                // Recursively solve for the next column
                solve(col + 1, board, res, rows, diagonal, anti);

                // Remove the queen from the current cell
                board[row][col] = '.';

                // Unmark the used row and diagonals
                rows[row] = 0;
                diagonal[row + col] = 0;
                anti[board.length - 1 + col - row] = 0;
            }
        }
    }

    public List<String> construct(char board[][]){

        List<String> res = new LinkedList<>();

        for(int i = 0; i < board.length; i++){
            String s = new String(board[i]);
            res.add(s);
        }

        return res;
    }
}