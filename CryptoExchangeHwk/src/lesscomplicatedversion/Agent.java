package lesscomplicatedversion; //That's a joke
import java.util.Scanner;
import java.util.TreeMap;


public class Agent extends Client {
	
	//Scanner in Agent.java - redundant as Agent inherits what's in Client.java
	public static Scanner scan = new Scanner(System.in);
	
	//Crypto Prices in USD
	protected float BTCPrice = 52284.95f;
	protected float ETHPrice = 1896.71f;
	protected float DOTPrice = 31.88f;
	protected float CELPrice = 5.79f;
	protected float AAVEPrice = 468.76f;

	//Crypto Price List Function
	protected void CryptoPrices () {
		System.out.println("");
		System.out.println("Crypto Prices Today in Alphabetical Order: ");
		
		TreeMap<String, Float> CryptoPrices = new TreeMap<String, Float>();
		
		CryptoPrices.put("BTC", BTCPrice);
		CryptoPrices.put("ETH", ETHPrice);
		CryptoPrices.put("DOT", DOTPrice);
		CryptoPrices.put("CEL", CELPrice);
		CryptoPrices.put("AAVE", AAVEPrice);
		
		for (String i: CryptoPrices.keySet()) {
			System.out.println("1 " + i + " " + "=" + " $" + CryptoPrices.get(i) + " USD");
		}
	}

//BTC Agent Functions -----------------------
	
	//Agent Buy
	 void AgentBuyBTC() {
		System.out.print("How much BTC would you like to buy today?");
		float amount = scan.nextFloat();
			if((amount * BTCPrice) <= ClientUSDBalance) {
				ClientUSDBalance = ClientUSDBalance - (amount * BTCPrice);
				ClientBTCBalance = ClientBTCBalance + amount;
			}
			else {
				System.err.println("Transaction cancelled due to insufficient funds available");
			}
	}
	
	//Agent Sell
	void AgentSellBTC() {
		System.out.print("How much BTC would you like to sell today? \n");
		float amount = scan.nextFloat();
			if(amount <= ClientBTCBalance) {
				ClientBTCBalance = ClientBTCBalance - amount;
				ClientUSDBalance = ClientUSDBalance + (amount * BTCPrice);
			}
			else {
				System.err.println("Transaction cancelled due to insufficient funds available");
			}
	}
	
	//Price Lookup
	void AgentPriceLookUpBTC() {
		System.out.println("The current price of 1 BTC is: " + "$" + BTCPrice + " USD");
	}
		
	
// ETH Agent Functions ----------------------
	
	//Agent Buy
	 void AgentBuyETH() {
		System.out.print("How much ETH would you like to buy today?");
		float amount = scan.nextFloat();
		if((amount * ETHPrice) <= ClientUSDBalance) {
			ClientUSDBalance = ClientUSDBalance - (amount * ETHPrice);
			ClientETHBalance = ClientETHBalance + amount;
		}
		else {
			System.err.println("Transaction cancelled due to insufficient funds available");
		}
		
	}
		
		//Agent Sell
	void AgentSellETH() {
		System.out.println("How much ETH would you like to sell today?");
		float amount = scan.nextFloat();
		if(amount <= ClientETHBalance) {
			ClientETHBalance = ClientETHBalance - amount;
			ClientUSDBalance = ClientUSDBalance + (amount * ETHPrice);
		}
		else {
			System.err.println("Transaction cancelled due to insufficient funds available");
		}
		
	}
		
		//Price Lookup
	void AgentPriceLookUpETH() {
		System.out.println("The current price of 1 ETH is: " + "$" + ETHPrice + " USD");
	}

// DOT Agent Functions ----------------------
	
	//Agent Buy
	 void AgentBuyDOT() {
		System.out.println("How much DOT would you like to buy today?");
		float amount = scan.nextFloat();
		if((amount * DOTPrice) <= ClientUSDBalance) {
			ClientUSDBalance = ClientUSDBalance - (amount * DOTPrice);
			ClientETHBalance = ClientETHBalance + amount;
		}
		else {
			System.err.println("Transaction cancelled due to insufficient funds available");
		}
		
	}
		
		//Agent Sell
	void AgentSellDOT() {
		System.out.println("How much DOT would you like to sell today?");
		float amount = scan.nextFloat();
		if(amount <= ClientDOTBalance) {
			ClientDOTBalance = ClientDOTBalance - amount;
			ClientUSDBalance = ClientUSDBalance + (amount * DOTPrice);
		}
		else {
			System.err.println("Transaction cancelled due to insufficient funds available");
		}
	}
		
		//Price Lookup
	void AgentPriceLookUpDOT() {
		System.out.println("The current price of 1 DOT is: " + "$" + DOTPrice + " USD");
	}
	
// CEL Agent Functions --------
	
	//Agent Buy
	 void AgentBuyCEL() {
		System.out.println("How much CEL would you like to buy today?");
		float amount = scan.nextFloat();
		if((amount * CELPrice) <= ClientUSDBalance) {
			ClientUSDBalance = ClientUSDBalance - (amount * CELPrice);
			ClientCELBalance = ClientCELBalance + amount;
		}
		else {
			System.err.println("Transaction cancelled due to insufficient funds available");
		}
	}
		
		//Agent Sell
	void AgentSellCEL() {
		System.out.println("How much CEL would you like to sell today?");
		float amount = scan.nextFloat();
		if(amount <= ClientCELBalance) {
			ClientCELBalance = ClientCELBalance - amount;
			ClientUSDBalance = ClientUSDBalance + (amount * CELPrice);
		}
		else {
			System.err.println("Transaction cancelled due to insufficient funds available");
		}
	}
		
		//Price Lookup
	void AgentPriceLookUpCEL() {
		System.out.println("The current price of 1 CEL is: " + "$" + CELPrice + " USD");
	}
	
// AAVE Agent Functions --------
	
	//Agent Buy
	 void AgentBuyAAVE() {
		System.out.println("How much AAVE would you like to buy today?");
		float amount = scan.nextFloat();
		if((amount * AAVEPrice) <= ClientUSDBalance) {
			ClientUSDBalance = ClientUSDBalance - (amount * AAVEPrice);
			ClientAAVEBalance = ClientAAVEBalance + amount;
		}
		else {
			System.err.println("Transaction cancelled due to insufficient funds available");
		}
	}
		
		//Agent Sell
	void AgentSellAAVE() {
		System.out.println("How much AAVE would you like to sell today?");
		float amount = scan.nextFloat();
		if(amount <= ClientAAVEBalance) {
			ClientAAVEBalance = ClientAAVEBalance - amount;
			ClientUSDBalance = ClientUSDBalance + (amount * AAVEPrice);
		}
		else {
			System.err.println("Transaction cancelled due to insufficient funds available");
		}
	}
		
		//Price Lookup
	void AgentPriceLookUpAAVE() {
		System.out.println("The current price of 1 AAVE is: " + "$" + AAVEPrice + " USD");
	}
	

	
	
}
