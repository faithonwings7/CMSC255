package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/****************************************************************************
 * Final Project: Unit Conversion Tool
 ****************************************************************************
 * PNC accepts integer inputs from a user, and returns an converted number in
 * the new unit of measure. Invalid inputs are accounted for.
 *______________________________________________________________________________
 * Anne Szarek, Shaquan Hagans, Isaiah Crothers
 * Nov 19, 2019
 * CMSC_255- 004
 ****************************************************************************/


public class UnitConversionFinder extends Application {
    /*************************************
     * Create a text area for the output *
     ************************************/
    TextArea outputMessage = new TextArea();

    public static void main(String[] args) {
        Application.launch(args);
    }

    /********************************************************************************************************
     * Create a keyboard shortcut for 'Calculate' button (users can press 'Enter' and the program will run) *
     ********************************************************************************************************/
    private void setGlobalEventHandler(VBox root, Button btn) {
        root.addEventHandler(KeyEvent.KEY_PRESSED, ev -> {
            if (ev.getCode() == KeyCode.ENTER) {
                btn.fire();
                ev.consume();
            }
        });
    }


    @Override
    public void start(Stage stage) {
        /*************************************
         * Create a text field for user input *
         * ***********************************/
        final TextField numInput1 = new TextField();
        numInput1.setPromptText("Starting number");

        final TextField numInput2 = new TextField();
        numInput2.setPromptText("Enter a number between 1 and 8:");

        final TextField numInput3 = new TextField();
        numInput3.setPromptText("Enter a number between 1 and 8:");

        /********************************
         * Set the size of the text area *
         * ******************************/
        outputMessage.setPromptText("Results");
        outputMessage.setPrefColumnCount(20);
        outputMessage.setPrefRowCount(10);


        /********************************
         * Create a 'Calculate' button   *
         * ******************************/
        Button UnitConversionButton = new Button("Convert Units");
        // Add an EventHandler to the Button
        UnitConversionButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {


                /**********************************************************
                 * Sets up a loop that clears text field after user input *
                 **********************************************************/
                //(while (numInput.getText().length() > 0) {}
                while (numInput1.getText().length() > 0 && numInput2.getText().length() >= 1 && numInput2.getText().length() <= 8 && numInput3.getText().length() >= 1 && numInput3.getText().length() <= 8) {
                     /********************************
                      * Initialize convertUnits object *
                      *******************************/
                     //ChineseZodiac zodiac = new ChineseZodiac(); // Creates a ChineseZodiac object called zodiac

                    UnitConversion convertUnits = new UnitConversion();

                    /*
                    try {
                       int userInput = Integer.parseInt(numInput.getText()); // Retrieve user input from text field
                       zodiac.setYear(userInput); // Sets year for ChineseZodiac object
                       String outputVal = zodiac.determineSign();
                       outputMessage.setText(outputVal); // Fills large message window with results from determineSign method
                     }
                    */

                    try {
                        double numericUserInput1 = Double.parseDouble(numInput1.getText());
                        convertUnits.setBegValue(numericUserInput1);
                        int numericUserInput2 = Integer.parseInt(numInput2.getText());
                        convertUnits.setBeginUnit(numericUserInput2);
                        int numericUserInput3 = Integer.parseInt(numInput3.getText());
                        convertUnits.setEndUnit(numericUserInput3);

                        UnitConversion convertedNumber = new UnitConversion(numericUserInput1, numericUserInput2, numericUserInput3);
                        String outputVal = convertedNumber.toString();
                        outputMessage.setText(outputVal);
                    }

                    /*
                    catch (NumberFormatException ex) {
                        String errorStatement = "Error, you did not enter an integer.\n"; // Set error statement
                        outputMessage.setText(errorStatement);
                    }
                    */

                    catch (NumberFormatException ex) {
                        String errorStatement = "Error, you did not enter the correct number.\n"; // Set error statement
                        outputMessage.setText(errorStatement);
                    }

                    /*
                    finally {
                        numInput.setText("");
                    }
                    */

                    finally {
                        numInput1.setText("");
                        numInput2.setText("");
                        numInput3.setText("");
                    }
                }
            }
        });

        /***************************
         * Create a 'Reset' button  *
         * *************************/
        Button resetButton = new Button("Reset");

        // Add an EventHandler to the Button
        resetButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                numInput1.setText("");
                numInput2.setText("");
                numInput3.setText("");
                outputMessage.setText(""); // Clears large message window
            }
        });

        /*******************************
         * Create viewing window (root) *
         * *****************************/
        // Create window (VBox)
        VBox root = new VBox();
        // Add Labels, TextArea and TextField to the Window
        root.getChildren().addAll(new Label("Enter a number that you would like to convert:"), numInput1,
                new Label("Select original unit of measure: 1 - millimeter, 2 - centimeter, 3 - meter, 4 - kilometer, 5 - inch, 6 - feet, 7 - yard, 8 - mile:"),
                numInput2, new Label("Select unit of measure to convert to: 1 - millimeter, 2 - centimeter, 3 - meter, 4 - kilometer, 5 - inch,  6 - feet  7 - yard  8 - mile: "),
                numInput3, new Label("Converted Number:"), outputMessage, UnitConversionButton, resetButton);
        // Define size of window
        root.setMinSize(400, 200);
        // Set root to shortcut method
        setGlobalEventHandler(root, UnitConversionButton);

        /**********************************
         * Configure window (root) design *
         *********************************/
        root.setStyle("-fx-padding: 10;" +
                "-fx-border-style: solid inside;" +
                "-fx-border-width: 2;" +
                "-fx-border-insets: 5;" +
                "-fx-border-radius: 5;" +
                "-fx-border-color: yellow;" +
                "-fx-background-color : #c2edd4;");

        /********************
         * Create the Stage *
         *******************/
        Scene scene = new Scene(root);
        // Add the scene to the stage
        stage.setScene(scene);
        // Set the title of the Stage
        stage.setTitle("Unit Conversion Checker");

        // Display the Stage
        stage.show();
    }
}