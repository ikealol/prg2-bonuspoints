/**
 * Created by Richard on 21/10/2017.
 */
public class gamebuilder {

    private int lastSet = 0;
    // build gamedashboard
    static String[][] gamefield = {{"1", "2", "3"},{"4", "5", "6"},{"7", "8", "9"}};

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
   public String setSign(int PosX,int PosY){
       String whatsSet;
       // 0 = O und 1 = X

       if (lastSet == 0){
           //add write into file
           lastSet = 1;
           gamefield[PosX][PosY] = "X";
           whatsSet = gamefield[PosX][PosY];
           checkWinner();
       }
       else{
           lastSet = 0;
           gamefield[PosX][PosY] = "O";
           whatsSet = gamefield[PosX][PosY];
           checkWinner();
       }
       return whatsSet;
   }

   public void checkWinner(){

       if (gamefield[0][0] == "X" && gamefield[0][1] == "X" && gamefield[0][2] == "X"){
           System.out.println("Player X won!");
       }else if(gamefield[1][0] == "X" && gamefield[1][1] == "X" && gamefield[1][2] == "X"){
           System.out.println("Player X won!");
       }else if(gamefield[2][0] == "X" && gamefield[2][1] == "X" && gamefield[2][2] == "X"){
           System.out.println("Player X won!");
       }else if(gamefield[0][0] == "X" && gamefield[1][0] == "X" && gamefield[2][0] == "X"){
           System.out.println("Player X won!");
       }else if(gamefield[0][1] == "X" && gamefield[1][1] == "X" && gamefield[2][1] == "X"){
           System.out.println("Player X won!");
       }else if(gamefield[0][2] == "X" && gamefield[1][2] == "X" && gamefield[2][2] == "X"){
           System.out.println("Player X won!");
       }else if(gamefield[0][0] == "X" && gamefield[1][1] == "X" && gamefield[2][2] == "X"){
           System.out.println("Player X won!");
       }else if(gamefield[2][0] == "X" && gamefield[1][1] == "X" && gamefield[0][2] == "X"){
           System.out.println("Player X won!");
       }

       if (gamefield[0][0] == "O" && gamefield[0][1] == "O" && gamefield[0][2] == "O"){
           System.out.println("Player O won!");
       }else if(gamefield[1][0] == "O" && gamefield[1][1] == "O" && gamefield[1][2] == "O"){
           System.out.println("Player O won!");
       }else if(gamefield[2][0] == "O" && gamefield[2][1] == "O" && gamefield[2][2] == "O"){
           System.out.println("Player O won!");
       }else if(gamefield[0][0] == "O" && gamefield[1][0] == "O" && gamefield[2][0] == "O"){
           System.out.println("Player O won!");
       }else if(gamefield[0][1] == "O" && gamefield[1][1] == "O" && gamefield[2][1] == "O"){
           System.out.println("Player O won!");
       }else if(gamefield[0][2] == "O" && gamefield[1][2] == "O" && gamefield[2][2] == "O"){
           System.out.println("Player O won!");
       }else if(gamefield[0][0] == "O" && gamefield[1][1] == "O" && gamefield[2][2] == "O"){
           System.out.println("Player O won!");
       }else if(gamefield[2][0] == "O" && gamefield[1][1] == "O" && gamefield[0][2] == "O"){
           System.out.println("Player O won!");
       }
   }

}
