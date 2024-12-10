package Games.TicTacToe;

public class Board {
    int size;
    char[][] matrix;

    public Board(int n){
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

    public void print(){
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                System.out.print("_");
            }
            System.out.println();
        }
    }

    public boolean check(){
        if(checkRows()) return true;
        else if (checkColumns()) return true;
        // else if (checkDiagonals()) return true;
        else return false;
    }

    public boolean checkRows(){
        int counter = 0;
        for (int i=0; i<size; i++){
            
            int count = 0;
            for (int j=1; j<size; j++){
                if (matrix[i][0] != matrix[i][j] || matrix[i][j] == '_' || matrix[i][0] == '_'){
                    break;
                }
                else count++;
            }
            if(count == size-1){
                break;
            }
            else counter++;
            
        }
        if (counter != size) return true;
        else return false;
    }
    
    public boolean checkColumns(){
        int counter = 0;
        for (int j=0; j<size; j++){
            int count = 0;
            for (int i=1; i<size; i++){
                if(matrix[0][j] != matrix[i][j] || matrix[i][j] == '_' || matrix[i][0] == '_'){
                    break;
                }
                else count++;
            }
            if (count == size-1){
                break;
            }
            else counter++;
        }
        if (counter == size) return false;
        else return true;
        
    }
    
    // public boolean checkDiagonals(){
        
        
    // }
    
}
