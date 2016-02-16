import static org.junit.Assert.*;

import org.junit.Test;

public class PlayerTest {

	@Test
	public void testCanWinTrue() {
		Player x = new Player();
		x.getCoffee();
		x.getCream();
		x.getSugar();
		assertTrue(x.canWin());
	}
	
	@Test
	public void testCanWinFalse() {
		Player x = new Player();
		x.getCoffee();
		x.getCream();
		assertFalse(x.canWin());
	}

	@Test
	public void testShowInventorySugar() {
		Player x = new Player();
		x.getSugar();
		assertEquals(x.showInventory(), "\nYou have some tasty sugar.");
	}
	
	@Test
	public void testShowInventoryCoffee() {
		Player x = new Player();
		x.getCoffee();
		assertEquals(x.showInventory(), "\nYou have a cup of delicious coffee.");
	}
	
	@Test
	public void testShowInventoryCream() {
		Player x = new Player();
		x.getCream();
		assertEquals(x.showInventory(), "\nYou have some fresh cream.");
	}
	
	@Test
	public void testShowInventoryNone() {
		Player x = new Player();
		assertEquals(x.showInventory(), "You do not have any items in your inventory.");
	}
	
	@Test
	public void testShowInventoryCoffeeAndCream() {
		Player x = new Player();
		x.getCream();
		x.getCoffee();
		assertEquals(x.showInventory(), "\nYou have a cup of delicious coffee.\nYou have some fresh cream.");
	}

	@Test
	public void testDrinkFalse() {
		Player x = new Player();
		x.getCoffee();
		assertFalse(x.drink());
	}
	
	@Test
	public void testDrinkTrue() {
		Player x = new Player();
		x.getCoffee();
		x.getSugar();
		x.getCream();
		assertTrue(x.drink());
	}
	
	@Test
	public void testDrinkCreamAndCoffee() {
		Player x = new Player();
		x.getCoffee();
		x.getCream();
		assertFalse(x.drink());
	}
	
	
	@Test
	public void testDrinkSugar() {
		Player x = new Player();
		x.getSugar();
		assertFalse(x.drink());
	}
	
	@Test
	public void testDrinkCream() {
		Player x = new Player();
		x.getCream();
		assertFalse(x.drink());
	}
	
	
	@Test
	public void testDrinkCreamAndSugar() {
		Player x = new Player();
		x.getSugar();
		x.getCream();
		assertFalse(x.drink());
	}
	
	@Test
	public void testDrinkNothing() {
		Player x = new Player();
		assertFalse(x.drink());
	}

}
