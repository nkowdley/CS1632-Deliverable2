import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;
import org.mockito.Mockito;

public class RoomTest {

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
	public void testGetRoomDescriptionInvalid() {
		Room x = new Room(6);
	    assertEquals(x.roomAdj, "Error: Invalid room number");
	}

	@Test
	public void testGetObjDescription() {
		//adjectives that describe our wonderful teacher bill laboon
	    String[] objArray={"a statue of Bill Laboon", "Amazon's best-seller, \"A Friendly Introduction to Software Testing\" by THE Bill Laboon",
				"an autographed photo of Bill Laboon",  "\"Hackin' Fellow\" on repeat 'cause it's such an amazing song", "a broken record","RentACat cats"};
		for(int i=0;i<6;i++)
		{
			Room x = new Room(i);
			assertEquals(x.objAdj,objArray[i]);
		}
	}

	@Test
	public void testGetObjectInRoomCream() {
		Room x = new Room(0);
		assertEquals(x.getObjectInRoom(),2);
		
	}
	@Test
	public void testGetObjectInRoomCoffee() {
		Room x = new Room(1);
		assertEquals(x.getObjectInRoom(),3);
		
	}
	@Test
	public void testGetObjectInRoomSugar() {
		Room x = new Room(5);
		assertEquals(x.getObjectInRoom(),1);
		
	}
	@Test
	public void testGetObjectInRoomFail() {
		Room x = new Room(3);
		assertEquals(x.getObjectInRoom(),0);
		
	}
}
