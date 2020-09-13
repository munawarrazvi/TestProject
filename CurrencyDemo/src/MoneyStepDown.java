import java.util.*;

public class MoneyStepDown {
	
	public static void getMoney(int currency){
		int currentnotes = 0;
		int money[] = {2000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
		for(int i=0; i<money.length; i++){
			if(currency >= money[i] && currency > 0){
				currentnotes = currency/money[i];
				currency = currency%money[i];
				System.out.println(money[i]+"-"+currentnotes);
			}else{
				continue;
			}
		}
	}

	public static void main(String[] args) {
		
		int userCurrency;
		Scanner read = new Scanner(System.in);
		System.out.println("Enter the currency :");
		userCurrency = read.nextInt();
		getMoney(userCurrency);
	}

}
