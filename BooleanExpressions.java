
public class BooleanExpressions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// 2 A-C) Boolean Variables		
boolean isHotOutside = true;
boolean isWeekday = true;
boolean hasMoneyInPocket = true;


// 3 A-C) Create Variables
double costOfMilk = 2.97;
double moneyInWallet = 47.55;
int thirstLevel = 4;

// 4 A-D) Create Variables for Listed Scenarios

boolean shouldBuyIcecream = isHotOutside && hasMoneyInPocket;
System.out.println(shouldBuyIcecream);

boolean willGoSwimming = isHotOutside && !isWeekday;
System.out.println(willGoSwimming);

boolean isAGoodDay = isHotOutside && hasMoneyInPocket && !isWeekday;
System.out.println(isAGoodDay);

boolean willBuyMilk = isHotOutside && thirstLevel >= 3 && moneyInWallet >= 2 * costOfMilk;
System.out.println(willBuyMilk);
	}

}
