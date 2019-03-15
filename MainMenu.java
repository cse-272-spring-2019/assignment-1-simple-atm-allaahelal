import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class MainMenu {
	
	Scene scene;
	UserInfo user;
	Stage stage;
	WithDraw withdraw;
	Deposit deposit;
	ProgramLogic f;

public MainMenu(Stage stage,ProgramLogic f) {
	
	this.stage=stage;
	this.f=f;
	
}

public void prepareScene(){
	
	Button b1=new Button("Withdraw");
	Button b2= new Button("Deposit");
	Button b3= new Button("Balance Inquiry");
	Button b4= new Button("Previous");
	Button b5= new Button("Next");
	Label bal=new Label();
	Label prev=new Label();
	Label next=new Label();
	
	GridPane grid=new GridPane();
	grid.add(b1, 2, 0);
	grid.add(b2, 2, 1);
	grid.add(b3, 2, 2);
	grid.add(b4, 1, 3);
	grid.add(b5, 3, 3);
	grid.add(bal, 3, 4);
	grid.add(prev, 3, 5);
	grid.add(next, 3, 6);
	
	scene= new Scene(grid,600,400);
	
	b1.setOnAction(new EventHandler<ActionEvent>() {
		
		@Override
		public void handle(ActionEvent event) {
			stage.setScene(withdraw.getScene());
			
		}
	});
	b2.setOnAction(new EventHandler<ActionEvent>() {
		
		@Override
		public void handle(ActionEvent event) {
			stage.setScene(deposit.getScene());
			
		}
	});
	b3.setOnAction(new EventHandler<ActionEvent>() {
		
		@Override
		public void handle(ActionEvent event) {
			long out=f.GetCurrentBalance();
			bal.setText("Your current balance is "+String.valueOf(out));
			
		}
	});
	b4.setOnAction(new EventHandler<ActionEvent>() {
		
		@Override
		public void handle(ActionEvent event) {
			prev.setText(""+f.Previous());
			
		}
	});
	b5.setOnAction(new EventHandler<ActionEvent>() {
		
		@Override
		public void handle(ActionEvent event) {
			next.setText(""+f.Next());
			
		}
	});
	
}

public Scene getScene() {
	return scene;
}

public void setUser(UserInfo user) {
	this.user = user;
}


public void setWithdraw(WithDraw withdraw) {
	this.withdraw = withdraw;
}


public void setDeposit(Deposit deposit) {
	this.deposit = deposit;
}

}