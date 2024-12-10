package Games.TicTacToe;
import java.util.Scanner;

public class Player {
    char symbol;

    public Player(char ch){
        this.symbol = ch;
    }

    public void provideInput(Board b){
        Scanner sc = new Scanner(System.in);
        System.out.print("Make your move : ");
        int i = sc.nextInt();
        int j = sc.nextInt();
        if(i<0 || j<0 || i>=b.size || j>=b.size || b.get(i, j) != '_' ){
            System.out.println("Invalid Input! Pls try again.");
            this.provideInput(b);
        }
        else{
            b.set(i, j, symbol);
            // b.matirx[i][j] = this.symbol;
        }
    }
    
}
