public class Player {
	//globals
	private boolean hasSugar = false;
	private boolean hasCream = false;
	private boolean hasCoffee = false;
	
	public void getSugar() {
		//give the player sugar
		this.hasSugar = true;
	}
	
	public void getCream() {
		//give the player cream
		this.hasCream = true;
	}
	
	public void getCoffee() {
		//give the player coffee
		this.hasCoffee = true;
	}
	
	public boolean canWin() {
		//if the user has all 3 things, return true, else return false. This can be used to evaluate if the user can win
		return (this.hasCoffee) && (this.hasCream) && (this.hasSugar);
	}
	
	public String showInventory() {
		//show the inventory string when the user wants to see the inventory
		StringBuilder retStr = new StringBuilder("");
		if (this.hasCoffee)
			retStr.append("\nYou have a cup of delicious coffee.");
		if (this.hasCream)
			retStr.append("\nYou have some fresh cream.");
		 if (this.hasSugar)
			retStr.append("\nYou have some tasty sugar.");
		 
		 if (retStr.toString().equals(""))
			 retStr.append("You do not have any items in your inventory.");
		 
		 return retStr.toString();
	}
	
	public boolean drink() {
		//evaluate whether or not we can win by drinking the ingredients
		boolean win = false;
		
		showInventory();
		
		System.out.println();
		if (canWin()) {
			System.out.println("You drink the beverage and are ready to study!");
			win = true;
			System.out.println("You win!");
		}
		
		else if (this.hasCoffee) {
			if (!this.hasCream)	//has coffee but no cream
				System.out.println("Without cream, you get an ulcer and cannot study.\nYou lose!");
			else	//has coffee and cream but no sugar
				System.out.println("Without sugar, the coffee is too bitter. You cannot study.\nYou lose!");
		}
		
		else if (this.hasCream) {
			if (!this.hasSugar)	//has cream but no coffee or sugar
				System.out.println("You can drink the cream, but without caffeine, you cannot study.\nYou lose!");
			else	//has cream and sugar but no coffee
				System.out.println("You can drink the sweetened cream, but without caffeine, you cannot study.\nYou lose!");
		}
		
		else if (this.hasSugar) {	//has sugar but no coffee or cream
			System.out.println("You eat the sugar, but without caffeine, you cannot study.\nYou lose!");
		}
		
		else //has no coffee or cream or sugar
			System.out.println("You drink the air, as you have no coffee, sugar, or cream.\nThe air is invigorating, but not invigorating enough." +
				" You cannot study.\nYou lose!");
		
		return win;
	}
}