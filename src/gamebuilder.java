import java.io.*;

/**
 * Created by Richard on 21/10/2017.
 */
public class gamebuilder {

    private int lastSet = 0;
    private int gameStart = 0;
    // build gamedashboard
    static String[][] gamefield = {{"?", "?", "?"},{"?", "?", "?"},{"?", "?", "?"}};

    public static String FieldButton1 = gamefield[0][0];
    public static String FieldButton2 = gamefield[0][1];
    public static String FieldButton3 = gamefield[0][2];
    public static String FieldButton4 = gamefield[1][0];
    public static String FieldButton5 = gamefield[1][1];
    public static String FieldButton6 = gamefield[1][2];
    public static String FieldButton7 = gamefield[2][0];
    public static String FieldButton8 = gamefield[2][1];
    public static String FieldButton9 = gamefield[2][2];

    // This method sets a sign into a file and var
   public String setSign(int PosX,int PosY) throws IOException {
       String whatsSet;

       // Message for log that a new game started
       if (gameStart == 0){
           writeLog("###################################################################################");
           writeLog("################################ New game started! ################################");
           writeLog("###################################################################################");

           gameStart = 1;
       }

       if (lastSet == 0){
           //add write into file
           lastSet = 1;
           gamefield[PosX][PosY] = "X";
           whatsSet = gamefield[PosX][PosY];
           writeLog("Player X plays - Position X: " + PosX + " Position Y: " + PosY);
           checkWinner();
       }
       else{
           lastSet = 0;
           gamefield[PosX][PosY] = "O";
           whatsSet = gamefield[PosX][PosY];
           writeLog("Player O plays - Position X: " + PosX + " Position Y: " + PosY);
           checkWinner();
       }
       return whatsSet;
   }

   public void checkWinner() throws IOException {
       gridpane gridpane = new gridpane();

       if (gamefield[0][0] == "X" && gamefield[0][1] == "X" && gamefield[0][2] == "X"){
           writeLog("Player X won!");
           gridpane.showWinner("X");
       }else if(gamefield[1][0] == "X" && gamefield[1][1] == "X" && gamefield[1][2] == "X"){
           writeLog("Player X won!");
           gridpane.showWinner("X");
       }else if(gamefield[2][0] == "X" && gamefield[2][1] == "X" && gamefield[2][2] == "X"){
           writeLog("Player X won!");
           gridpane.showWinner("X");
       }else if(gamefield[0][0] == "X" && gamefield[1][0] == "X" && gamefield[2][0] == "X"){
           writeLog("Player X won!");
           gridpane.showWinner("X");
       }else if(gamefield[0][1] == "X" && gamefield[1][1] == "X" && gamefield[2][1] == "X"){
           writeLog("Player X won!");
           gridpane.showWinner("X");
       }else if(gamefield[0][2] == "X" && gamefield[1][2] == "X" && gamefield[2][2] == "X"){
           writeLog("Player X won!");
           gridpane.showWinner("X");
       }else if(gamefield[0][0] == "X" && gamefield[1][1] == "X" && gamefield[2][2] == "X"){
           writeLog("Player X won!");
           gridpane.showWinner("X");
       }else if(gamefield[2][0] == "X" && gamefield[1][1] == "X" && gamefield[0][2] == "X"){
           writeLog("Player X won!");
           gridpane.showWinner("X");
       }

       if (gamefield[0][0] == "O" && gamefield[0][1] == "O" && gamefield[0][2] == "O"){
           writeLog("Player O won!");
           gridpane.showWinner("O");
       }else if(gamefield[1][0] == "O" && gamefield[1][1] == "O" && gamefield[1][2] == "O"){
           writeLog("Player O won!");
           gridpane.showWinner("O");
       }else if(gamefield[2][0] == "O" && gamefield[2][1] == "O" && gamefield[2][2] == "O"){
           writeLog("Player O won!");
           gridpane.showWinner("O");
       }else if(gamefield[0][0] == "O" && gamefield[1][0] == "O" && gamefield[2][0] == "O"){
           writeLog("Player O won!");
           gridpane.showWinner("O");
       }else if(gamefield[0][1] == "O" && gamefield[1][1] == "O" && gamefield[2][1] == "O"){
           writeLog("Player O won!");
           gridpane.showWinner("O");
       }else if(gamefield[0][2] == "O" && gamefield[1][2] == "O" && gamefield[2][2] == "O"){
           writeLog("Player O won!");
           gridpane.showWinner("O");
       }else if(gamefield[0][0] == "O" && gamefield[1][1] == "O" && gamefield[2][2] == "O"){
           writeLog("Player O won!");
           gridpane.showWinner("O");
       }else if(gamefield[2][0] == "O" && gamefield[1][1] == "O" && gamefield[0][2] == "O"){
           writeLog("Player O won!");
           gridpane.showWinner("O");

       }
   }

   void writeLog(String log) throws IOException {
       BufferedWriter writer = new BufferedWriter(new FileWriter("tictactoe_gamelog.txt", true));

       writer.append(log + "\n");
       writer.close();
   }

}
