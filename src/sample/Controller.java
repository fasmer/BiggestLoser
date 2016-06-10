package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class Controller {

    @FXML
    private ImageView BRimage;

    @FXML
    private Button btnOkay;

    @FXML
    private Button btnClear;

    @FXML
    private TextField txtOriginal;

    @FXML
    private TextField txtNew;

    @FXML
    private Label lblPercent;

    @FXML
    private void handleButtonAction(ActionEvent e){
        float numOriginal, numNew, percent;

        if (e.getSource() == btnClear) {
            txtOriginal.setText("");
            txtNew.setText("");
            lblPercent.setText("");
            txtOriginal.requestFocus();
            return;
        }
        numOriginal = Float.parseFloat(txtOriginal.getText());
        numNew= Float.parseFloat(txtNew.getText());

        if (e.getSource() == btnOkay) {
            percent = ((numOriginal-numNew)/numOriginal)*100;
            String percentFormat = String.format("%.2f", percent);
            lblPercent.setText(percentFormat + "%");
        }
    }
}
