import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class WithDraw {

	Scene scene;
	Stage stage;
	MainMenu menu;
	ProgramLogic amount2;
	
	public WithDraw(Stage stage ,ProgramLogic amount2) {
		
		this.stage=stage;
		this.amount2=amount2;
	}
	
	public void preparescene() {
		
	
		Button a=new Button("Submit");
		Label label=new Label("Enter the amount you want to withdraw ");
		TextField text=new TextField();
		Label w=new Label();
		Button b=new Button("Back");
		
		GridPane grid=new GridPane();
		grid.add(a, 1, 1);
		grid.add(label, 0, 0);
		grid.add(text, 1, 0);
		grid.add(w,1 , 2);
		grid.add(b, 1, 3);
		
		scene =new Scene(grid,600,400);
		
		a.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				int x = Integer.parseInt(text.getText());
				 long v = (long)x ;
				boolean o=amount2.WithDraw(v);
				if(o) {
					w.setText("Successful operation!");
				}
				
				else {
					w.setText("Not enough balance ");
				}
			}
		});
		
		b.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				stage.setScene(menu.getScene());
				
			}
		});
		
}
	
	public Scene getScene() {
		return scene;
	}
	
	public void setMenu(MainMenu menu) {
		this.menu = menu;
	}
	
}
