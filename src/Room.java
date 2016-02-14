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
  boolean northDoor=false;
  boolean southDoor=false;
  /**
  * A constructor to create a room in the game using the "number" of the room
  * The player starts in room 0, and goes north to get into room 1, etc.
  *
  * @param  roomNum  The "number" of the room the user is trying to enter.
  */
  public Room(int roomNum)
  {
    populateRoom(roomNum);
    getDescription(roomNum);
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
      case 1:
      cream=true;
      northDoor=true;
      southDoor=false;
      break;
      case 2:
      coffee=true;
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
      northDoor=true;
      southDoor=true;
      break;
      case 6:
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
  public String getDescription(int roomNum)
  {
    //adjectives that describe our wonderful teacher bill laboon
    String[] adjArray={"Inspirational", "Cool-Dude","Chili-Pepper","Smart", "Fun", "Hilarious"};
    return adjArray[roomNum];
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
