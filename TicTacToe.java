import java.util.Scanner;

public class TicTacToe {
    int userNum;
    String userSymbol;
    String [][] board = {{"0"," | ", "1" ," | ", "2"},
    {"--", "--", "--", "--", "--"},
    {"3", " | ", "4", " | ", "5"}   ,
    {"--", "--", "--", "--", "--"},
    {"6", " | ", "7", " | ", "8"}};
    Scanner scanner;
       

    public void displayRules(){
        System.out.println("Welcome to Tic Tac Toe!. Below are the rules for the game. Have fun!");
        System.out.println("1. The game is playable by two players");
        System.out.println("2. Each of the players choose either a X or an O as their symbol for the game and place it on the board alternately");
        System.out.println("3. Enter your co-ordinate for the board followed by your symbol on the next line as prompted by the console.");
        System.out.println("4. The aim is to get your symbol to occur across a row, down a column or through a diagonal of the board without a break.");
        System.out.println("5. The game ends as a draw if nobody is able to do so by the time the board fills up");


    }
    public void displayBoard(){
       
        System.out.println("Choose a number present on the board below to place your symbol");
    
        for(int i = 0; i < 5; i++){
            for(int j = 0; j<5; j++){
                System.out.print(board[i][j]);
            }
            System.out.println("");
        }
    }
    public void getInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number");
        userNum = scanner.nextInt();
            
        while(userNum > 8){
            System.out.println("Number Invalid, please try again");
            System.out.println("Enter your number");
            userNum = scanner.nextInt();            
            if(userNum <= 8){
                break;
            }          
        }
        System.out.println("Enter your symbol: X or O");
        userSymbol = scanner.next();
        
        while(userSymbol.equalsIgnoreCase("X") == false && userSymbol.equalsIgnoreCase("O") == false){
            System.out.println("Invalid Symbol, try again.");
            System.out.println("Enter your symbol: X or O");
            userSymbol = scanner.next();              
        }       
                               
    }
    public boolean checkX() {
        boolean row1X = (board[0][0].equalsIgnoreCase("x") && board[0][2].equalsIgnoreCase("x") && board[0][4].equalsIgnoreCase("x"));
        boolean row2X = (board[2][0].equalsIgnoreCase("x") && board[2][2].equalsIgnoreCase("x") && board[2][4].equalsIgnoreCase("x"));
        boolean row3X = (board[4][0].equalsIgnoreCase("x") && board[4][2].equalsIgnoreCase("x") && board[4][4].equalsIgnoreCase("x"));

        boolean col1X = (board[0][0].equalsIgnoreCase("x") && board[2][0].equalsIgnoreCase("x") && board[4][0].equalsIgnoreCase("x"));
        boolean col2X = (board[0][2].equalsIgnoreCase("x") && board[2][2].equalsIgnoreCase("x") && board[4][2].equalsIgnoreCase("x"));
        boolean col3X = (board[0][4].equalsIgnoreCase("x") && board[2][4].equalsIgnoreCase("x") && board[4][4].equalsIgnoreCase("x"));

        boolean diag1X = (board[0][0].equalsIgnoreCase("X") && board[2][2].equalsIgnoreCase("X")&& board[4][4].equalsIgnoreCase("X"));
        boolean diag2X = (board[0][4].equalsIgnoreCase("X") && board[2][2].equalsIgnoreCase("X")&& board[4][0].equalsIgnoreCase("X"));

        if(row1X || row2X || row3X || col1X || col2X || col3X || diag1X || diag2X) return true;
        else return false;
        
    }
    public boolean checkO(){
        boolean row1O = (board[0][0].equalsIgnoreCase("o") && board[0][2].equalsIgnoreCase("o") && board[0][4].equalsIgnoreCase("o"));
        boolean row2O = (board[2][0].equalsIgnoreCase("o") && board[2][2].equalsIgnoreCase("o") && board[2][4].equalsIgnoreCase("o"));
        boolean row3O = (board[4][0].equalsIgnoreCase("o") && board[4][2].equalsIgnoreCase("o") && board[4][4].equalsIgnoreCase("o"));

        boolean col1O = (board[0][0].equalsIgnoreCase("o") && board[2][0].equalsIgnoreCase("o") && board[4][0].equalsIgnoreCase("o"));
        boolean col2O = (board[0][2].equalsIgnoreCase("o") && board[2][2].equalsIgnoreCase("o") && board[4][2].equalsIgnoreCase("o"));
        boolean col3O = (board[0][4].equalsIgnoreCase("o") && board[2][4].equalsIgnoreCase("o") && board[4][4].equalsIgnoreCase("o"));

        boolean diag1O = (board[0][0].equalsIgnoreCase("o") && board[2][2].equalsIgnoreCase("o")&& board[4][4].equalsIgnoreCase("o"));
        boolean diag2O = (board[0][4].equalsIgnoreCase("o") && board[2][2].equalsIgnoreCase("o")&& board[4][0].equalsIgnoreCase("o"));

        if(row1O || row2O || row3O || col1O || col2O || col3O || diag1O || diag2O) return true;
        else return false;
    }
    public boolean boardFull(){
        boolean row1Full = board[0][0] != "0" && board[0][2] != "1" && board[0][4] != "2";
        boolean row2Full = board[2][0] != "3" && board[2][2] != "4" && board[2][4] != "5";
        boolean row3Full = board[4][0] != "6" && board[4][2] != "7" && board[4][4] != "8";

        if(row1Full && row2Full && row3Full) return true;
        else return false;

    }
    public void assignInput(){
        userSymbol = userSymbol.toUpperCase();

        if (userNum == 0){
            board[0][0] = userSymbol;            
        }
        else if (userNum == 1){
            board[0][2] = userSymbol;
        }   
        else if (userNum == 2){
            board[0][4] = userSymbol;
        }
        else if (userNum == 3){
            board[2][0] = userSymbol;
        }
        else if (userNum == 4){
            board[2][2] = userSymbol;
        }
        else if (userNum == 5){
            board[2][4] = userSymbol;
        }
        else if (userNum == 6){
            board[4][0] = userSymbol;
        }
        else if (userNum == 7){
            board[4][2] = userSymbol;
        }
        else if (userNum == 8){
            board[4][4] = userSymbol;
        }
        for(int i = 0; i < 5; i++){
            for(int j = 0; j<5; j++){
                System.out.print(board[i][j]);
            }
            System.out.println("");
        }              
            
    }
    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.displayRules();
        game.displayBoard();
        while(!game.checkX() && !game.checkO()){
            game.getInput();
            game.assignInput();
            if(game.checkX()){
                System.out.println("X wins!");
            }
            else if (game.checkO()){
                System.out.println("O wins!");
            }
            else if (game.boardFull()){
                System.out.println("It's a Draw!");
                break;
                
            }
        }
    }  
    
}
