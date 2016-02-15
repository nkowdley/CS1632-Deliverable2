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
	public Player p = new Player();
	  
	public Room[] house = new Room[6];
	
	private Room currentRoom;
	private int i = 0;
	Scanner sc = new Scanner(System.in);
	
	
	public Game(){
	
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
		
		System.out.println("INSTRUCTIONS (N,S,L,I,D,H) > ");
		String input = sc.nextLine();

		if (input.equalsIgnoreCase("N")){
			this.moveNorth();
		}
		else if (input.equalsIgnoreCase("S")){
			this.moveSouth();
		}
		else if (input.equalsIgnoreCase("L")){
			this.look();
		}
		else if (input.equalsIgnoreCase("I")) {
			p.showInventory();
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
	  
	public void moveNorth(){
		if (currentRoom != house[5]){
			i++;
			currentRoom = house[i];
		}
		else
			System.out.println("No north door exists.");
	}
	  
	public void moveSouth(){
		if (currentRoom != house[0]){
			i--;
			currentRoom = house[i];
		}
		else
			System.out.println("No south door exists.");
	}
	  
	public void look(){
		int roomHas = currentRoom.getObjectInRoom();
		
		switch (roomHas){
			
			case 1: 
				p.getSugar();
				break;
			case 2:
				p.getCream();
				break;
			case 3:
				p.getCoffee();
				break;
			default:
				System.out.println("You don't see anything out of the ordinary.");
				
		}
			
	}

}
