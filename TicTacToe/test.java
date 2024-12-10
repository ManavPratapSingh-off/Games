import Games.TicTacToe.Board;
import Games.TicTacToe.Game;

public class test {
    public static void main(String args[]){
        Game game = new Game(3);
        game.launch();
    }
}

// class Board {
//     int size;
//     char[][] matrix;

//     Board(int n){
//         this.size = n;
//         this.matrix = new char[n][n];
//         for(int i=0; i<n; i++){
//             for(int j=0; j<n; j++){
//                 set(i, j, '_');
//             }
//         }
//     }
// }
