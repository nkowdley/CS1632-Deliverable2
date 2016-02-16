import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

public class GameTest {

	@Test
	public void testMoveNorthFalse() {
		Room mockedRoom = Mockito.mock(Room.class);
		Mockito.when(mockedRoom.getNorthDoor()).thenReturn(false);
		Game g = new Game();
		g.setCurrentRoom(mockedRoom);
		assertFalse(g.moveNorth());
		
	}
	
	@Test
	public void testMoveNorthTrue() {
		Room mockedRoom = Mockito.mock(Room.class);
		Mockito.when(mockedRoom.getNorthDoor()).thenReturn(true);
		Game g = new Game();
		g.setCurrentRoom(mockedRoom);
		assertTrue(g.moveNorth());
		
	}
	
	@Test
	public void testMoveSouthFalse() {
		Room mockedRoom = Mockito.mock(Room.class);
		Mockito.when(mockedRoom.getSouthDoor()).thenReturn(false);
		Game g = new Game();
		g.setCurrentRoom(mockedRoom);
		assertFalse(g.moveSouth());
		
	}
	
	@Test
	public void testMoveSouthTrue() {
		Room mockedRoom = Mockito.mock(Room.class);
		Mockito.when(mockedRoom.getSouthDoor()).thenReturn(true);
		Game g = new Game();
		g.setCurrentRoom(mockedRoom);
		assertTrue(g.moveSouth());
	}

	@Test
	public void testLookCream(){
		Room mockedRoom = Mockito.mock(Room.class);
		Mockito.when(mockedRoom.getObjectInRoom()).thenReturn(2);
		Game g = new Game();
		g.setCurrentRoom(mockedRoom);
		assertEquals(g.look(), "You found some creamy cream!");
	}
	
	@Test
	public void testLookSugar(){
		Room mockedRoom = Mockito.mock(Room.class);
		Mockito.when(mockedRoom.getObjectInRoom()).thenReturn(1);
		Game g = new Game();
		g.setCurrentRoom(mockedRoom);
		assertEquals(g.look(), "You found some sweet sugar!");
	}
	
	@Test
	public void testLookCoffee(){
		Room mockedRoom = Mockito.mock(Room.class);
		Mockito.when(mockedRoom.getObjectInRoom()).thenReturn(3);
		Game g = new Game();
		g.setCurrentRoom(mockedRoom);
		assertEquals(g.look(), "You found some caffeinated coffee!");
	}
	
	@Test
	public void testLookNothing(){
		Room mockedRoom = Mockito.mock(Room.class);
		Mockito.when(mockedRoom.getObjectInRoom()).thenReturn(0);
		Game g = new Game();
		g.setCurrentRoom(mockedRoom);
		assertEquals(g.look(), "You don't see anything out of the ordinary.");
	}


}
