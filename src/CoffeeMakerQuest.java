/**
* Write a description of class CoffeeMakerQuest here.
*
* @author Neel Kowdley <nkowdley@gmail.com>
* @version 1.1.0
*/
import java.util.*;
import java.io.*;
//import java.lang.*;

public class CoffeeMakerQuest
{
  public static void main(String[] args) throws Exception
  {
    System.out.println("Coffee Maker Quest v1.1");
    Actions();
    return;

  }
  public static void Actions()
  {
    Scanner sc = new Scanner(System.in);
    System.out.printf("INSTRUCTIONS (N,S,L,I,D,H) >" );
    char input = sc.next(".").charAt(0);
    System.out.println(input); //Print out input
    // switch(input)
    // {
    //   case "N":
    // }
    return;
  }
}
