package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.util.Map;

public class Controller {
    @FXML
    public TextArea textArea;
    @FXML
    public TextField textFieldForNumber;
    @FXML
    public TextField textFieldForName;
    TelDirectory telDirectory = new TelDirectory();

    @FXML
    private void addToDirect() {
        String strNumber = textFieldForNumber.getText();
        String strName = textFieldForName.getText();
        telDirectory.add(strNumber, strName);
        showAllNum();
        textFieldForName.clear();
        textFieldForNumber.clear();
    }

    @FXML
    private void getNumber() {
        String strName = textFieldForName.getText();
        textArea.clear();
        for (String str : telDirectory.get(strName)) {
            textArea.appendText(str + "\n");
        }
    }

    @FXML
    private void showAllNum() {
        textArea.clear();
        for (Map.Entry<String, String> entry : telDirectory.telDirMap.entrySet()) {// accessing directly a field that should be private
            textArea.appendText(entry.getValue() + " " + entry.getKey() + "\n");
        }
    }
}
