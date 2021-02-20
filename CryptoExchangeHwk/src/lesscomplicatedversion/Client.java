package lesscomplicatedversion;
import java.util.Scanner;

public class Client {
	
	//Scanner Set up in Client.java
	public static Scanner scan = new Scanner(System.in);
	
	//Customer's Starting Currency balances
	float ClientUSDBalance = 5000000.00f; //USD
	float ClientBTCBalance = 0.00f; //BTC
	float ClientETHBalance = 0.00f; //ETH
	float ClientDOTBalance = 0.00f;	//DOT
	float ClientCELBalance = 0.00f; //CEL
	float ClientAAVEBalance = 0.00f; //AAVE
	
	//Customer's Name
	public String CustomerName;
	
	
	//Function for inputting Cx name
	public void InputCustomerName() {
		System.out.println("Now who are you? (Please enter your name) ");
		CustomerName = scan.nextLine();
	}
	
	public String PrintCustomerName() {
		return CustomerName;
	}
	
	public float ClientUSDBalance () {
		return ClientUSDBalance;
	
	}
	
	public float ClientBTCBalance() {
		return ClientBTCBalance;
	}
	
	public float ClientETHBalance() {
		return ClientETHBalance;
	}
	
	public float ClientDOTBalance() {
		return ClientDOTBalance;
	}
	
	public float ClientCELBalance() {
		return ClientCELBalance;
	}
	
	public float ClientAAVEBalance() {
		return ClientAAVEBalance;
	}


	
	
}
