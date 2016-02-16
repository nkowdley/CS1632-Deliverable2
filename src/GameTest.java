import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

public class GameTest {

	@Test
	public void testMoveNorthFalse() {
		//verify that if the current room does not have a North Door, you cannot move north
		Room mockedRoom = Mockito.mock(Room.class);
		Mockito.when(mockedRoom.getNorthDoor()).thenReturn(false);
		Game g = new Game();
		g.setCurrentRoom(mockedRoom);
		assertFalse(g.moveNorth());
		
	}
	
	@Test
	public void testMoveNorthTrue() {
		//verify that if the current room has a north door, you can move north
		Room mockedRoom = Mockito.mock(Room.class);
		Mockito.when(mockedRoom.getNorthDoor()).thenReturn(true);
		Game g = new Game();
		g.setCurrentRoom(mockedRoom);
		assertTrue(g.moveNorth());
		
	}
	
	@Test
	public void testMoveSouthFalse() {
		//verify that if the current room does not have a South Door, you cannot move south
		Room mockedRoom = Mockito.mock(Room.class);
		Mockito.when(mockedRoom.getSouthDoor()).thenReturn(false);
		Game g = new Game();
		g.setCurrentRoom(mockedRoom);
		assertFalse(g.moveSouth());
		
	}
	
	@Test
	public void testMoveSouthTrue() {
		//verify that if the current room has a south Door, you cannot move south
		Room mockedRoom = Mockito.mock(Room.class);
		Mockito.when(mockedRoom.getSouthDoor()).thenReturn(true);
		Game g = new Game();
		g.setCurrentRoom(mockedRoom);
		assertTrue(g.moveSouth());
	}

	@Test
	public void testLookCream(){
		//verify that if the room has cream in it, the game tells you that you have cream
		Room mockedRoom = Mockito.mock(Room.class);
		Mockito.when(mockedRoom.getObjectInRoom()).thenReturn(2);
		Game g = new Game();
		g.setCurrentRoom(mockedRoom);
		assertEquals(g.look(), "You found some creamy cream!");
	}
	
	@Test
	public void testLookSugar(){
		//verify that if the room has sugar in it, the game tells you that you have sugar
		Room mockedRoom = Mockito.mock(Room.class);
		Mockito.when(mockedRoom.getObjectInRoom()).thenReturn(1);
		Game g = new Game();
		g.setCurrentRoom(mockedRoom);
		assertEquals(g.look(), "You found some sweet sugar!");
	}
	
	@Test
	public void testLookCoffee(){
		//verify that if the room has coffee in it, the game tells you that you have coffee
		Room mockedRoom = Mockito.mock(Room.class);
		Mockito.when(mockedRoom.getObjectInRoom()).thenReturn(3);
		Game g = new Game();
		g.setCurrentRoom(mockedRoom);
		assertEquals(g.look(), "You found some caffeinated coffee!");
	}
	
	@Test
	public void testLookNothing(){
		//verify that if the room has nothing in it, the game tells you that you have nothing
		Room mockedRoom = Mockito.mock(Room.class);
		Mockito.when(mockedRoom.getObjectInRoom()).thenReturn(0);
		Game g = new Game();
		g.setCurrentRoom(mockedRoom);
		assertEquals(g.look(), "You don't see anything out of the ordinary.");
	}


}
