package Games.TicTacToe;

public class Game {
    Player p1, p2, currentPlayer;
    Board board;

    public Game(int n){
        this.board = new Board(n);
        this.p1 = new Player('X');
        this.p2 = new Player('O');
        this.currentPlayer = new Player(p1.symbol);

    }

    public void launch(){
        board.print();
        int turns = board.size*board.size;
        while(turns > 0){
            currentPlayer.provideInput(this.board);
            board.print();
            turns--;
            if(turns<5 && turns>0){
                if(board.check()){
                    System.out.println("Player "+currentPlayer.symbol+" won the game!");
                    return;
                }
            }
            else if (turns == 0){
                System.out.println("The game ended in draw.");
            }
            changePlayer(currentPlayer);
                
        }

    }

    void changePlayer(Player p){
        if(p.symbol == 'X') p.symbol = 'O';
        else if(p.symbol == 'O') p.symbol = 'X';
    }

    




}
