public class Player {
	
	private boolean hasSugar = false;
	private boolean hasCream = false;
	private boolean hasCoffee = false;
	
	public void getSugar() {
		System.out.println("You found some sweet sugar!");
		this.hasSugar = true;
	}
	
	public void getCream() {
		System.out.println("You found some creamy cream!");
		this.hasCream = true;
	}
	
	public void getCoffee() {
		System.out.println("You found some caffeinated coffee!");
		this.hasCoffee = true;
	}
	
	public boolean canWin() {
		return (this.hasCoffee) && (this.hasCream) && (this.hasSugar);
	}
	
	public void showInventory() {
		if (this.hasCoffee)
			System.out.println("You have a cup of delicious coffee.");
		if (this.hasCream)
			System.out.println("You have some fresh cream.");
		if (this.hasSugar)
			System.out.println("You have some tasty sugar.");
	}
	
	public boolean drink() {
		boolean win = false;
		
		showInventory();
		
		System.out.println();
		if ((this.hasCoffee) && (this.hasCream) && (this.hasSugar)) {
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