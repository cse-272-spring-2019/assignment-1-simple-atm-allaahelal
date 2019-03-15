    import javafx.event.ActionEvent;
	import javafx.event.EventHandler;
	import javafx.scene.Scene;
	import javafx.scene.control.Button;
	import javafx.scene.control.Label;
	import javafx.scene.control.PasswordField;
	import javafx.scene.layout.GridPane;
	import javafx.stage.Stage;

	public class UserInfo{
		Stage stage;
         Scene scene;
         MainMenu menu;
       authentication auth;
       
         
	     public UserInfo(Stage stage) {
			this.stage = stage;
		}

		public void prepareScene() {
			
			auth=new authentication();
			Label cardnumber= new Label("Card Number: ");
			PasswordField card= new PasswordField();
			Button enter=new Button("Enter");
			Label authenticationlabel= new Label();
			GridPane grid= new GridPane();
			grid.add(cardnumber, 0, 0);
			grid.add(card, 1, 0);
			grid.add(enter, 1, 1);
			grid.add(authenticationlabel,1 , 2);
			
			scene=new Scene(grid,600,400);
			
			enter.setOnAction(new EventHandler<ActionEvent>() {
				
				@Override
				public void handle(ActionEvent event) {
					String cardnum=card.getText();
					boolean valid = auth.validate(cardnum);
					if(valid) {
						
						stage.setScene(menu.getScene());
					}
					else
					{
						authenticationlabel.setText("Wrong card number");
					}
				}
			});
		}
       
	     public Scene getScene(){
	    	 return this.scene;
	     }

		public void setMenu(MainMenu menu) {
			this.menu = menu;
		}
	     
	}


