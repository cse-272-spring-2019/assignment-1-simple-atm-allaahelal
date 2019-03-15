import javafx.application.Application;
import javafx.stage.Stage;

public class MyATM extends Application
{
	
	public static void main(String[] args) {
		launch(args);
		}

     @Override
	public void start(Stage primaryStage) throws Exception {
    	 ProgramLogic amount1=new ProgramLogic();
    	 primaryStage.setTitle("ATM");
    	 UserInfo user=new UserInfo(primaryStage);
    	 MainMenu menu=new MainMenu(primaryStage,amount1);
    	 WithDraw withdraw=new WithDraw(primaryStage,amount1);
    	 Deposit deposit=new Deposit(primaryStage,amount1);
    	 
    	 user.prepareScene();
    	 menu.prepareScene();
    	 withdraw.preparescene();
    	 deposit.preparescene();
    	    	 
    	 user.setMenu(menu);
    	 menu.setWithdraw(withdraw);
    	 menu.setDeposit(deposit);
    	 withdraw.setMenu(menu);
    	 deposit.setMenu(menu);
    	 
    	 
    	 primaryStage.setScene(user.getScene());
		 primaryStage.show();
		
	}

}