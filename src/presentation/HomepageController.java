package presentation;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;


public class HomepageController {
    @FXML
    void commandUiSelect(ActionEvent event) throws IOException, CloneNotSupportedException {
   	 CommandUIController commandUIController = new CommandUIController();
   	 commandUIController.createCommandUI();
    }

    @FXML
    void interactiveUiSelect(ActionEvent event) throws IOException {
    	RichrailController richRailController = new RichrailController();
    	richRailController.createInteractiveUi();
    }
}
