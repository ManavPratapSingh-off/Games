package Games.TicTacToe;

public class Board {
    int size;
    char[][] matrix;

    Board(int n){
        this.size = n;
        this.matrix = new char[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                set(i, j, '_');
            }
        }
    }

    public char get(int i, int j){
        return this.matrix[i][j];
    }

    public void set(int i, int j, char ch){
        this.matrix[i][j] = ch;
    }
    
}
