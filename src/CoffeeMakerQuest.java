public class CoffeeMakerQuest {

	Game game = new Game();

	public static void main(String[] args)
	{
		System.out.println("Coffee Maker Quest v1.1");
		System.out.println("Instructions for Coffee Maker Quest - ");
		System.out.println("You are a brave student trying to finish Deliverable 2 for Bill Laboon's Software Testing Class, but you need caffeine.");
		System.out.println("The goal of the game is to collect sugar, coffee, and cream so that you can study.");
		game.startGame();
		game.Actions();
	}
}