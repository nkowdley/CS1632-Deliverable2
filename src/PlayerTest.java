import static org.junit.Assert.*;

import org.junit.Test;

public class PlayerTest {

	@Test
	public void testCanWinTrue() {
		//verify that canWin returns true when the player has cream, coffee and sugar
		Player x = new Player();
		x.getCoffee();
		x.getCream();
		x.getSugar();
		assertTrue(x.canWin());
	}
	
	@Test
	public void testCanWinFalse() {
		//verify that canWin returns false when the player has only cream and coffee
		Player x = new Player();
		x.getCoffee();
		x.getCream();
		assertFalse(x.canWin());
	}

	@Test
	public void testShowInventorySugar() {
		//verify that inventory returns the correct string when the player has sugar
		Player x = new Player();
		x.getSugar();
		assertEquals(x.showInventory(), "\nYou have some tasty sugar.");
	}
	
	@Test
	public void testShowInventoryCoffee() {
		//verify that inventory returns the correct string when the player has  coffee
		Player x = new Player();
		x.getCoffee();
		assertEquals(x.showInventory(), "\nYou have a cup of delicious coffee.");
	}
	
	@Test
	public void testShowInventoryCream() {
		//verify that inventory returns the correct string when the player has cream
		Player x = new Player();
		x.getCream();
		assertEquals(x.showInventory(), "\nYou have some fresh cream.");
	}
	
	@Test
	public void testShowInventoryNone() {
		//verify that inventory returns the correct string when the player has nothing
		Player x = new Player();
		assertEquals(x.showInventory(), "You do not have any items in your inventory.");
	}
	
	@Test
	public void testShowInventoryCoffeeAndCream() {
		//verify that inventory returns the correct string when the player has cream and coffee
		Player x = new Player();
		x.getCream();
		x.getCoffee();
		assertEquals(x.showInventory(), "\nYou have a cup of delicious coffee.\nYou have some fresh cream.");
	}

	@Test
	public void testDrinkFalse() {
		//verify that drink returns false when the player only has coffee
		Player x = new Player();
		x.getCoffee();
		assertFalse(x.drink());
	}
	
	@Test
	public void testDrinkTrue() {
		//verify that drink returns true, when the player has gotten all 3.
		Player x = new Player();
		x.getCoffee();
		x.getSugar();
		x.getCream();
		assertTrue(x.drink());
	}
	
	@Test
	public void testDrinkCreamAndCoffee() {
		//verify that drink returns false when the player only has cream and coffee
		Player x = new Player();
		x.getCoffee();
		x.getCream();
		assertFalse(x.drink());
	}
	
	
	@Test
	public void testDrinkSugar() {
		//verify that drink returns false when the player only has sugar
		Player x = new Player();
		x.getSugar();
		assertFalse(x.drink());
	}
	
	@Test
	public void testDrinkCream() {
		//verify that drink returns false when the player only has cream
		Player x = new Player();
		x.getCream();
		assertFalse(x.drink());
	}
	
	
	@Test
	public void testDrinkCreamAndSugar() {
		//verify that drink returns false when the player only has cream and sugar
		Player x = new Player();
		x.getSugar();
		x.getCream();
		assertFalse(x.drink());
	}
	
	@Test
	public void testDrinkNothing() {
		//verify that drink returns false when the player only has nothing
		Player x = new Player();
		assertFalse(x.drink());
	}

}
