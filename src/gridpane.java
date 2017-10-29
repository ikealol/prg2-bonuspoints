/**
 * Created by Richard on 29/10/2017.
 */
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.Optional;


public class gridpane extends Application {
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

        gridpane.setPadding(new Insets(5));
        gridpane.setHgap(5);
        gridpane.setVgap(5);

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
        ButtonField1.setMinSize(35,35);
        ButtonField2.setMinSize(35,35);
        ButtonField3.setMinSize(35,35);
        ButtonField4.setMinSize(35,35);
        ButtonField5.setMinSize(35,35);
        ButtonField6.setMinSize(35,35);
        ButtonField7.setMinSize(35,35);
        ButtonField8.setMinSize(35,35);
        ButtonField9.setMinSize(35,35);

        Scene scene = new Scene(gridpane, 125, 125);
        primaryStage.setTitle("Tic Tac Toe");
        primaryStage.setScene(scene);
        primaryStage.show();



        // Eventhandler Buttons
        ButtonField1.setOnAction((event) -> {
            setButtonGUI(1);
        });
        ButtonField2.setOnAction((event) -> {
            setButtonGUI(2);
        });
        ButtonField3.setOnAction((event) -> {
            setButtonGUI(3);
        });
        ButtonField4.setOnAction((event) -> {
            setButtonGUI(4);
        });
        ButtonField5.setOnAction((event) -> {
            setButtonGUI(5);
        });
        ButtonField6.setOnAction((event) -> {
            setButtonGUI(6);
        });
        ButtonField7.setOnAction((event) -> {
            setButtonGUI(7);
        });
        ButtonField8.setOnAction((event) -> {
            setButtonGUI(8);
        });
        ButtonField9.setOnAction((event) -> {
            setButtonGUI(9);
        });
    }

    public static void main(String[] args) {
        launch(args);
    }

    public void showWinner(String winner){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Winner");
        alert.setHeaderText("We have a winner!");
        alert.setContentText("Player " + winner + " won the game!");

        Optional<ButtonType> result = alert.showAndWait();
        if (result.get() == ButtonType.OK){
            System.exit(0);
        }
    }

    public void setButtonGUI(int buttonGUI) {
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

}
