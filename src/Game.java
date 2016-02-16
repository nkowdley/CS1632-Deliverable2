/**
* Write a description of class CoffeeMakerQuest here.
*
* @author Neel Kowdley <nkowdley@gmail.com>
* @version 1.1.0
*/
import java.util.*;
import java.io.*;

public class Game
{
	//globals
	public Player p = new Player();
	  
	public Room[] house = new Room[6];
	
	private Room currentRoom;
	private int i = 0;
	Scanner sc = new Scanner(System.in);
	private boolean north, south;
	
	public Game(){
		//create the rooms in the house for the game
		Room room0 = new Room(0);
		Room room1 = new Room(1);
		Room room2 = new Room(2);
		Room room3 = new Room(3);
		Room room4 = new Room(4);
		Room room5 = new Room(5);

		house[0] = room0;
		house[1] = room1;
		house[2] = room2;
		house[3] = room3;
		house[4] = room4;
		house[5] = room5;
		currentRoom = house[i];
	}

	public void Actions()
	{
		//print out the current room details, and act on the users input
		System.out.println("\nYou see a " + currentRoom.roomAdj + " room.");
		System.out.println("You find " + currentRoom.objAdj + ".");
		if (currentRoom.northDoor)
			System.out.println("There is a door that leads north.");
		if(currentRoom.southDoor)
			System.out.println("There is a door that leads south.");
		
		System.out.println("\nINSTRUCTIONS (N,S,L,I,D,H) > ");
		String input = sc.nextLine();

		if (input.equalsIgnoreCase("N")){
			north = this.moveNorth();
		}
		else if (input.equalsIgnoreCase("S")){
			south = this.moveSouth();
		}
		else if (input.equalsIgnoreCase("L")){
			System.out.println(this.look());
		}
		else if (input.equalsIgnoreCase("I")) {
			System.out.println(p.showInventory());
		}
		else if (input.equalsIgnoreCase("D")) {
			p.drink();
			System.exit(0);
		}
		else if (input.equalsIgnoreCase("H")){
			System.out.println("Enter \"N\" to go North, \"S\" to go South, \"L\" to Look for items, \"I\" for Inventory, \"H\" for Help, or \"D\" to Drink");
		}
		else
			System.out.println("What?");
		
	}
	
	public void setCurrentRoom(Room r){
		//change the current room
		currentRoom = r;
	}
	  
	public boolean moveNorth(){
		//move the room to the room to the north
		if (currentRoom.getNorthDoor()){
			if (i < 5) i++;
			setCurrentRoom(house[i]);
			return true;
		}
		else
			System.out.println("No north door exists.");
		return false;
	}
	  
	public boolean moveSouth(){
		//move the current room to the room to the south if one exists
		if (currentRoom.getSouthDoor() == true){
			if (i >0) i--;
			setCurrentRoom(house[i]);
			return true;
		}
		else
			System.out.println("No south door exists.");
		return false;
	}
	  
	public String look(){
		//find the ingredient in the room
		int roomHas = currentRoom.getObjectInRoom();
		String retStr = "";
		
		switch (roomHas){
			
			case 1: 
				p.getSugar();
				retStr = "You found some sweet sugar!";
				break;
			case 2:
				p.getCream();
				retStr = "You found some creamy cream!";
				break;
			case 3:
				p.getCoffee();
				retStr = "You found some caffeinated coffee!";
				break;
			default:
				retStr = "You don't see anything out of the ordinary.";
				
		}
		
		return retStr;
			
	}

}
