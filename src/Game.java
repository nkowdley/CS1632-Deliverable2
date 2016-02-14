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
  
	public Game(){
		
		Player p = new Player();
	  
		LinkedList house = new LinkedList<Room>();

		ListIterator<Room> moveRooms = house.listIterator();

		Room room0 = new Room(0);
		Room room1 = new Room(1);
		Room room2 = new Room(2);
		Room room3 = new Room(3);
		Room room4 = new Room(4);
		Room room5 = new Room(5);
		
		Room currentRoom;
	
	}

	public static void startGame(){
		
		house.add(room0);
		house.add(room1);
		house.add(room2);
		house.add(room3);
		house.add(room4);
		house.add(room5);
		
	}

	public static void Actions()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("INSTRUCTIONS (N,S,L,I,D,H) > ");
		String input = sc.nextLine();

		if (input.equalsIgnoreCase("N")){
			moveNorth();
		}
		else if (input.equalsIgnoreCase("S")){
			moveSouth();
		}
		else if (input.equalsIgnoreCase("L")){
			look();
		}
		else if (input.equalsIgnoreCase("I")) {
			p.showInventory();
		}
		else if (input.equalsIgnoreCase("D")) {
			p.drink();
		}
		else if (input.equalsIgnoreCase("H")){
			System.out.println("Enter \"N\" to go North, \"S\" to go South, \"L\" to Look for items, \"I\" for Inventory, \"H\" for Help, or \"D\" to Drink");
		}
		else
			System.out.println("What?");

		return;
	}
	  
	public static void moveNorth(){
		if (moveRooms.hasNext())
			currentRoom = moveRooms.next();
		else
			System.out.println("No north door exists.");
	}
	  
	public static void moveSouth(){
		if (moveRooms.hasPrevious())
			currentRoom = moveRooms.previous();
		else
			System.out.println("No south door exists.");
	}
	  
	public static void look(){
		int roomHas = currentRoom.getObjectInRoom();
		
		switch (roomHas){
			
			case 1: 
				p.getSugar();
			case 2:
				p.getCream();
			case 3:
				p.getCoffee();
			default:
				System.out.println("You don't see anything out of the ordinary.");
				
		}
			
	}

}
