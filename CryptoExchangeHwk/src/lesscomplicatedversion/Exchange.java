package lesscomplicatedversion; //lol just kidding
import java.util.Scanner;


public class Exchange {

	public static Scanner scan = new Scanner(System.in);
	public static Agent a = new Agent();
	
	public static void main(String[] args) {
		
		System.out.println("Welcome Fellow Crypto Degenerate xD");
		System.out.println("");
		
		//Input Customer Name to bring up menu
		a.InputCustomerName();
		a.PrintCustomerName();
		System.out.println("");
		
		//Main Menu
		System.out.println("");
		boolean mainLoop = true;
		int choice;
		while(mainLoop) {
			System.out.println("Welcome to the No Fee Crypto Exchange" + " " + a.PrintCustomerName() + "\n");
			System.out.println("Main Menu\n");
			System.out.print("1. Check your balances \n");
			System.out.print("2. Check today's crypto prices \n");
			System.out.print("3. Buy BTC \n");
			System.out.print("4. Sell BTC \n");
			System.out.print("5. Buy ETH \n");
			System.out.print("6. Sell ETH \n");
			System.out.print("7. Buy DOT \n");
			System.out.print("8. Sell DOT \n");
			System.out.print("9. Buy CEL \n");
			System.out.print("10. Sell CEL \n");
			System.out.print("11. Buy AAVE \n");
			System.out.print("12. Sell AAVE \n");
			System.out.print("13. Exit \n");
			System.out.print("");
			System.out.print("\n Please Enter Your Menu Choice: ");
			
			// Recording Customer Selection
			choice = scan.nextInt();
			
			switch(choice) {
			case 1:
				//Check Your Balances
				currentBalance();
				System.out.println("");
				pushEnter();
				break;
			case 2:
				//Check today's crypto prices
				a.CryptoPrices();
				System.out.println("");
				pushEnter();
				break;
			case 3:
				a.AgentBuyBTC();
				System.out.println("");
				currentBalance(); 
				System.out.println("");
				pushEnter();
				break;
			case 4:
				a.AgentSellBTC();
				System.out.println("");
				currentBalance(); 
				System.out.println("");
				pushEnter();
				break;
			case 5:
				a.AgentBuyETH();
				System.out.println("");
				currentBalance(); 
				System.out.println("");
				pushEnter();
				break;
			case 6:
				a.AgentSellETH();
				System.out.println("");
				currentBalance(); 
				System.out.println("");
				pushEnter();
				break;
			case 7:
				a.AgentBuyDOT();
				System.out.println("");
				currentBalance(); 
				System.out.println("");
				pushEnter();
				break;
			case 8:
				a.AgentSellDOT();
				System.out.println("");
				currentBalance(); 
				System.out.println("");
				pushEnter();
				break;
			case 9:
				a.AgentBuyCEL();
				System.out.println("");
				currentBalance(); 
				System.out.println("");
				pushEnter();
				break;
			case 10:
				a.AgentSellCEL();
				System.out.println("");
				currentBalance(); 
				System.out.println("");
				pushEnter();
				break;
			case 11:
				a.AgentBuyAAVE();
				System.out.println("");
				currentBalance(); 
				System.out.println("");
				pushEnter();
				break;
			case 12:
				a.AgentSellAAVE();
				System.out.println("");
				currentBalance(); 
				System.out.println("");
				pushEnter();
				break;
			case 13:
				System.out.println("Exiting Program... "
						+ "and remember, we do not speak about the No Fee Crypto Exchange");
				System.exit(0);;
				break;
			default:
				System.out.print("Option not valid, please try another option");
				break;	
			}
			
		}
	
	//End of Main Function	
	}

	public static void currentBalance() {
		//Customer Balances
		System.out.println(a.PrintCustomerName() + "'s current balances are: ");
		System.out.println("USD Balance = $" + a.ClientUSDBalance() + " USD");
		System.out.println("BTC Balance = " + a.ClientBTCBalance() +" BTC" + " or " + " $"+ (a.ClientBTCBalance() * a.BTCPrice) + " USD");
		System.out.println("ETH Balance = " + a.ClientETHBalance() +" ETH" + " or " + " $"+ (a.ClientETHBalance() * a.ETHPrice) + " USD");
		System.out.println("DOT Balance = " + a.ClientDOTBalance() +" DOT" + " or " + " $"+ (a.ClientDOTBalance() * a.DOTPrice) + " USD");
		System.out.println("CEL Balance = " + a.ClientCELBalance() +" CEL" + " or " + " $"+ (a.ClientCELBalance() * a.CELPrice) + " USD");
		System.out.println("AAVE Balance = " + a.ClientAAVEBalance() +" AAVE" + " or " + " $"+ (a.ClientAAVEBalance() * a.AAVEPrice) + " USD");
		
	//End Current Balance Function
	}
	
	public static void pushEnter() {
		System.out.println("");
		System.out.println("Press Enter to continue...");
		Scanner input = new Scanner(System.in);
		String cont = input.nextLine();
		while(cont.equals(" ")) {
			cont = input.nextLine();
		}
		
	//End of Input Function	
	}
	
	
}
