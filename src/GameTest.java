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
	public void testLook(){
		Room mockedRoom = Mockito.mock(Room.class);
		Mockito.when(mockedRoom.getObjectInRoom()).thenReturn(2);
		Game g = new Game();
		assertEquals(g.look(), "You found some creamy cream!");
	}


}
