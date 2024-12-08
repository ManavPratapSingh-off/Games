package Games.TicTacToe;
import java.util.Scanner;

public class Player {
    char symbol;

    Player(char ch){
        this.symbol = ch;
    }

    public void provideInput(Board b){
        Scanner sc = new Scanner();
        int i = sc.nextInt();
        int j = sc.nextInt();
        if(i<0 || j<0 || i>=b.size || j>=b.size || b.get(i, j) != '_' ){
            System.out.println("Invalid Input! Pls try again.");
            this.provideInput(b);
        }
        else{
            b.set(i, j, this.symbol);
        }
    }
    
}
