/**
* Write a description of class CoffeeMakerQuest here.
*
* @author Neel Kowdley <nkowdley@gmail.com>
* @version 1.1.0
*/
import java.util.*;
import java.io.*;

public class CoffeeMakerQuest
{
  public static void main(String[] args)
  {
    System.out.println("Coffee Maker Quest v1.1");
    System.out.println("Instructions for Coffee Maker Quest - ");
    System.out.println("You are a brave student trying to study for finals, but you need caffeine.");
    System.out.println("The goal of the game is to collect sugar, coffee, and cream so that you can study.");
    Actions();
    return;

  }
  public static void Actions()
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("INSTRUCTIONS (N,S,L,I,D,H) >");
    String input = sc.nextLine();
    //System.out.println(input); //Print out input

    if (input.equalsIgnoreCase("N")){
      //move north
    }
    else if (input.equalsIgnoreCase("S")){
      //move south
    }
    else if (input.equalsIgnoreCase("L")){
      //show what's in room
    }
    else if (input.equalsIgnoreCase("I")) {
      //show inventory
    }
    else if (input.equalsIgnoreCase("D")) {
      //drink
    }
    else if (input.equalsIgnoreCase("H")){
      System.out.println("Enter \"N\" to go North, \"S\" to go South, \"L\" to Look for items, \"I\" for Inventory, \"H\" for Help, or \"D\" to Drink");
    }
    else
    System.out.println("What?");

    return;
  }
}
