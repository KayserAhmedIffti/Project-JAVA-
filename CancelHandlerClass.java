import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class CancelHandlerClass implements EventHandler<ActionEvent> {
    @Override
    public void handle(ActionEvent e){
        System.out.println("Cancel button clicked");
    }
}
