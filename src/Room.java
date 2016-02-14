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
  int coffee=0;
  int cream=0;
  int sugar=0;
  int northDoor=0;
  int southDoor=0;
  /**
  * A constructor to create a room in the game using the "number" of the room
  * The player starts in room 0, and goes north to get into room 1, etc.
  *
  * @param  roomNum  The "number" of the room the user is trying to enter.
  */
  public Room(int roomNum)
  {
    populateRoom(roomNum);
    String adjective=getDescription(roomNum);
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
              cream=1;
              northDoor=1;
              break;
      case 1:
              coffee=1;
              northDoor=1;
              southDoor=1;
              break;
      case 2:
              northDoor=1;
              southDoor=1;
              break;
      case 3:
              northDoor=1;
              southDoor=1;
              break;
      case 4:
              northDoor=1;
              southDoor=1;
              break;
      case 5:
              northDoor=0;
              southDoor=1;
              sugar=1;
              break;
    }
  }
  /**
  * Gets the adjective description of a room, based on the array of
  * @param  roomNum  The "number" of the room the user is trying to enter.
  * @return adjective  a String that has an adjective chosen from an array
  */
  void populateRoom(int roomNum)
  {

  }
