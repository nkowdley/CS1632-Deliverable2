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
      this.setNorthDoor();
      break;
      case 1:
      coffee=true;
      this.setNorthDoor();
      this.setSouthDoor();
      break;
      case 2:
      this.setNorthDoor();
      this.setSouthDoor();
      break;
      case 3:
      this.setNorthDoor();
      this.setSouthDoor();
      break;
      case 4:
      this.setNorthDoor();
      this.setSouthDoor();
      break;
      case 5:
      this.setSouthDoor();
      sugar=true;
      break;
      default:
      System.out.println("Something about a magical world.");
      //System.exit(100);
    }
  }
  
  public void setNorthDoor(){
	  this.northDoor = true;
  }
  
  public void setSouthDoor(){
	  this.southDoor = true;
  }
  
  public boolean getNorthDoor(){
	  return this.northDoor;
  }
  
  public boolean getSouthDoor(){
	  return this.southDoor;
  }
  
  /**
  * Gets the adjective description of a room, based on the array of
  * @param  roomNum  The "number" of the room the user is trying to enter.
  * @return adjective  a String that has an adjective chosen from an array
  */
  public String getRoomDescription(int roomNum)
  {
	String[] adjArray={"Inspirational", "Cool-Dude","Chili-Pepper","Smart", "Fun", "Hilarious"};
    //adjectives that describe our wonderful teacher bill laboon
    if ((roomNum < 6) && (roomNum >= 0))
	  return adjArray[roomNum];
    return "Error: Invalid room number";
  }
  
  public String getObjDescription(int roomNum){
	  
	String[] objArray={"a statue of Bill Laboon", "Amazon's best-seller, \"A Friendly Introduction to Software Testing\" by THE Bill Laboon",
			"an autographed photo of Bill Laboon",  "\"Hackin' Fellow\" on repeat 'cause it's such an amazing song", "a broken record","RentACat cats"};
	if ((roomNum < 6) && (roomNum >= 0)) 
	  return objArray[roomNum];

	return "Error: Invalid room number";
  }
  
  /**
  * Gets the adjective description of a room, based on the array of
  * @param  roomNum  The "number" of the room the user is trying to enter.
  * @return int  a int that corresponds to the object in the room
  */
  public int getObjectInRoom()
  {
    if (this.sugar)
      return 1;
    else if (this.cream)
      return 2;
    else if (this.coffee)
      return 3;
    else
      return 0;
  }
}
