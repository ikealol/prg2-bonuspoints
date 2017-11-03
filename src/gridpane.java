/**
 * Created by Richard on 29/10/2017.
 */
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.Optional;


public class gridpane extends Application implements GUIconfig {
    gamebuilder gamebuilder = new gamebuilder();

    Button ButtonField1 = new Button(gamebuilder.FieldButton1);
    Button ButtonField2 = new Button(gamebuilder.FieldButton2);
    Button ButtonField3 = new Button(gamebuilder.FieldButton3);
    Button ButtonField4 = new Button(gamebuilder.FieldButton4);
    Button ButtonField5 = new Button(gamebuilder.FieldButton5);
    Button ButtonField6 = new Button(gamebuilder.FieldButton6);
    Button ButtonField7 = new Button(gamebuilder.FieldButton7);
    Button ButtonField8 = new Button(gamebuilder.FieldButton8);
    Button ButtonField9 = new Button(gamebuilder.FieldButton9);

    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane gridpane = new GridPane();

        gridpane.setPadding(new Insets(gap));
        gridpane.setHgap(gap);
        gridpane.setVgap(gap);

        gridpane.add(ButtonField1, 0, 0);
        gridpane.add(ButtonField2, 0, 1);
        gridpane.add(ButtonField3, 0, 2);
        gridpane.add(ButtonField4, 1, 0);
        gridpane.add(ButtonField5, 1, 1);
        gridpane.add(ButtonField6, 1, 2);
        gridpane.add(ButtonField7, 2, 0);
        gridpane.add(ButtonField8, 2, 1);
        gridpane.add(ButtonField9, 2, 2);

        //ButtonField1.setPrefWidth(100);
        ButtonField1.setMinSize(buttonsize,buttonsize);
        ButtonField2.setMinSize(buttonsize,buttonsize);
        ButtonField3.setMinSize(buttonsize,buttonsize);
        ButtonField4.setMinSize(buttonsize,buttonsize);
        ButtonField5.setMinSize(buttonsize,buttonsize);
        ButtonField6.setMinSize(buttonsize,buttonsize);
        ButtonField7.setMinSize(buttonsize,buttonsize);
        ButtonField8.setMinSize(buttonsize,buttonsize);
        ButtonField9.setMinSize(buttonsize,buttonsize);

        Scene scene = new Scene(gridpane, 125, 125);
        primaryStage.setTitle("Tic Tac Toe");
        primaryStage.setScene(scene);
        primaryStage.show();

        // Display Rules of the game at the beginning
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Rules");
        alert.setHeaderText(null);
        alert.setContentText("Welcome to my TIC TAC TOE game.\n\n Player X will start the game.\n The first player who has three symbols in a row will win the game.\n\n Confirm with OK and click on your field where you want to put your cross.");

        alert.showAndWait();

        // Eventhandler Buttons
        ButtonField1.setOnAction((event) -> {
            try {
                setButtonGUI(1);
            } catch (IOException e) {
                showWriteLogWarning();
            }
        });
        ButtonField2.setOnAction((event) -> {
            try {
                setButtonGUI(2);
            } catch (IOException e) {
                showWriteLogWarning();
            }
        });
        ButtonField3.setOnAction((event) -> {
            try {
                setButtonGUI(3);
            }catch (IOException e) {
                showWriteLogWarning();
            }
        });
        ButtonField4.setOnAction((event) -> {
            try {
                setButtonGUI(4);
            } catch (IOException e) {
                showWriteLogWarning();
            }
        });
        ButtonField5.setOnAction((event) -> {
            try {
                setButtonGUI(5);
            } catch (IOException e) {
                showWriteLogWarning();
            }
        });
        ButtonField6.setOnAction((event) -> {
            try {
                setButtonGUI(6);
            } catch (IOException e) {
                showWriteLogWarning();
            }
        });
        ButtonField7.setOnAction((event) -> {
            try {
                setButtonGUI(7);
            } catch (IOException e) {
                showWriteLogWarning();
            }
        });
        ButtonField8.setOnAction((event) -> {
            try {
                setButtonGUI(8);
            } catch (IOException e) {
                showWriteLogWarning();
            }
        });
        ButtonField9.setOnAction((event) -> {
            try {
                setButtonGUI(9);
            } catch (IOException e) {
                showWriteLogWarning();
            }
        });
    }

    public static void main(String[] args) throws IOException {
        launch(args);
    }

    public void showWinner(String winner){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("We have a winner!");
        alert.setHeaderText(null);
        alert.setContentText("Player " + winner + " won the game!");

        Optional<ButtonType> result = alert.showAndWait();
        if (result.get() == ButtonType.OK){
            System.exit(0);
        }
    }

    public void setButtonGUI(int buttonGUI) throws IOException {
        switch (buttonGUI) {
            case 1:
                ButtonField1.setText(gamebuilder.setSign(0, 0));
                break;
            case 2:
                ButtonField2.setText(gamebuilder.setSign(0, 1));
                break;
            case 3:
                ButtonField3.setText(gamebuilder.setSign(0, 2));
                break;
            case 4:
                ButtonField4.setText(gamebuilder.setSign(1, 0));
                break;
            case 5:
                ButtonField5.setText(gamebuilder.setSign(1, 1));
                break;
            case 6:
                ButtonField6.setText(gamebuilder.setSign(1, 2));
                break;
            case 7:
                ButtonField7.setText(gamebuilder.setSign(2, 0));
                break;
            case 8:
                ButtonField8.setText(gamebuilder.setSign(2, 1));
                break;
            case 9:
                ButtonField9.setText(gamebuilder.setSign(2, 2));
                break;
        }
    }

    public void showWriteLogWarning(){
        Alert alert2 = new Alert(Alert.AlertType.WARNING);
        alert2.setTitle("IO Warning");
        alert2.setHeaderText(null);
        alert2.setContentText("There is a problem with the log file!\nPlease check if tictactoe_gamelog.txt is avaiable and writeable.");

        alert2.showAndWait();
    }

}

interface GUIconfig{
    int gap = 5;
    int buttonsize = 35;
}