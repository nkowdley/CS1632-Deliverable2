/**
* Write a description of class Room here.
*
* @author Neel Kowdley <nkowdley@gmail.com>
* @version 1.1.0
*/
import java.util.*;
import java.io.*;
//import java.lang.*;

public class Room
{
  //initialize the state of coffee cream and sugar as global variables
  boolean coffee=false;
  boolean  cream=false;
  boolean  sugar=false;
  public boolean northDoor=false;
  public boolean southDoor=false;
  public String roomAdj, objAdj;
  /**
  * A constructor to create a room in the game using the "number" of the room
  * The player starts in room 0, and goes north to get into room 1, etc.
  *
  * @param  roomNum  The "number" of the room the user is trying to enter.
  */
  public Room(int roomNum)
  {
    populateRoom(roomNum);
    roomAdj = getRoomDescription(roomNum);
	objAdj = getObjDescription(roomNum);
  }

  /**
  * A switch case that determines what room numbers each object should be in
  * It also sets the states for the North and South Doors
  * The player starts in room 0, and goes north to get into room 1, etc.
  * This method changes the global variables for coffee cream and sugar
  *
  * @param  roomNum  The "number" of the room the user is trying to enter.
  */
  void populateRoom(int roomNum)
  {
    switch(roomNum)
    {
      case 0:
      cream=true;
      northDoor=true;
      southDoor=false;
      break;
      case 1:
      coffee=true;
      northDoor=true;
      southDoor=true;
      break;
      case 2:
      northDoor=true;
      southDoor=true;
      break;
      case 3:
      northDoor=true;
      southDoor=true;
      break;
      case 4:
      northDoor=true;
      southDoor=true;
      break;
      case 5:
      northDoor=false;
      southDoor=true;
      sugar=true;
      break;
      default:
      System.out.println("Something about a magical world...returning you to beginning");
    }
  }
  /**
  * Gets the adjective description of a room, based on the array of
  * @param  roomNum  The "number" of the room the user is trying to enter.
  * @return adjective  a String that has an adjective chosen from an array
  */
  public String getRoomDescription(int roomNum)
  {
    //adjectives that describe our wonderful teacher bill laboon
    String[] adjArray={"Inspirational", "Cool-Dude","Chili-Pepper","Smart", "Fun", "Hilarious"};
    return adjArray[roomNum];
  }
  
  public String getObjDescription(int roomNum){
	String[] objArray={"a statue of Bill Laboon", "Amazon's best-seller, \"A Friendly Introduction to Software Testing\" by THE Bill Laboon",
			"an autographed photo of Bill Laboon",  "\"Hackin' Fellow\" on repeat 'cause it's such an amazing song", "a broken record","RentACat cats"};
	return objArray[roomNum];
  }
  
  /**
  * Gets the adjective description of a room, based on the array of
  * @param  roomNum  The "number" of the room the user is trying to enter.
  * @return int  a int that corresponds to the object in the room
  */
  public int getObjectInRoom()
  {
    if (this.getSugar())
      return 1;
    else if (this.getCream())
      return 2;
    else if (this.getCoffee())
      return 3;
    else
      return 0;
  }
  public boolean getSugar()
  {
	  return this.sugar;
  }
  public boolean getCream()
  {
	  return this.cream;
  }
  public boolean getCoffee()
  {
	  return this.coffee;
  }
}
