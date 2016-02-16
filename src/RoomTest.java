import static org.junit.Assert.*;

import org.junit.Test;

public class RoomTest {

	@Test
	public void testRoom() {
		assertTrue(true);
	}

	@Test
	public void testPopulateRoom0() {
		//check that all variables are set properly for each room
		Room x = new Room(0);
		assertTrue(x.northDoor);
		assertFalse(x.southDoor);
		assertTrue(x.cream);
		assertFalse(x.coffee);
		assertFalse(x.sugar);
	}
	@Test
	public void testPopulateRoom1() {
		//check that all variables are set properly for each room
		Room x = new Room(1);
		assertTrue(x.northDoor);
		assertTrue(x.southDoor);
		assertFalse(x.cream);
		assertTrue(x.coffee);
		assertFalse(x.sugar);
	}
	@Test
	public void testPopulateRoom2() {
		//check that all variables are set properly for each room
		Room x = new Room(2);
		assertTrue(x.northDoor);
		assertTrue(x.southDoor);
		assertFalse(x.cream);
		assertFalse(x.coffee);
		assertFalse(x.sugar);
	}
	@Test
	public void testPopulateRoom3() {
		//check that all variables are set properly for each room
		Room x = new Room(3);
		assertTrue(x.northDoor);
		assertTrue(x.southDoor);
		assertFalse(x.cream);
		assertFalse(x.coffee);
		assertFalse(x.sugar);
	}
	@Test
	public void testPopulateRoom4() {
		//check that all variables are set properly for each room
		Room x = new Room(4);
		assertTrue(x.northDoor);
		assertTrue(x.southDoor);
		assertFalse(x.cream);
		assertFalse(x.coffee);
		assertFalse(x.sugar);
	}
	@Test
	public void testPopulateRoom5() {
		//check that all variables are set properly for each room
		Room x = new Room(5);
		assertFalse(x.northDoor);
		assertTrue(x.southDoor);
		assertFalse(x.cream);
		assertFalse(x.coffee);
		assertTrue(x.sugar);
	}
	
	@Test
	public void testGetRoomDescription() {
	    //adjectives that describe our wonderful teacher bill laboon
	    String[] adjArray={"Inspirational", "Cool-Dude","Chili-Pepper","Smart", "Fun", "Hilarious"};
		for(int i=0;i<6;i++)
		{
			Room x = new Room(i);
			assertEquals(x.roomAdj,adjArray[i]);
		}
	}

	@Test
	public void testGetObjDescription() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetObjectInRoom() {
		fail("Not yet implemented");
	}

}
