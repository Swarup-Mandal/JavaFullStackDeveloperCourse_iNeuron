package lectures.Assignments.Assignment3;

import java.util.*;

class Players    //New added
{
	int numOfPlayers;
	
	int getNumOfPlayers(){
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Let's choose!! How many players do yo want play with?");
		numOfPlayers = sc1.nextInt();
		
		return numOfPlayers;
	}
}

class PlayerGuesses 
{
	int[] guesses;  //Array Declaration

	
	int[] getGuesses(int numOfPlayers){
		guesses= new int[numOfPlayers]; //Array Initialization-->noOfPlayers is the total array length
		for(int i=0;i<guesses.length;i++)
		{   
			Scanner sc2 = new Scanner(System.in);
			System.out.println("Player "+(1+i)+", guess a number in between 0-10.");
			guesses[i]= sc2.nextInt();
		    
		}
		return guesses;  //returning Array with Players guessed number
	}
}


class Unpire
{
	int players;
	int[] playerGuesses;
	int answer;
	int winner;
	
	void collectPlayers()
	{
		Players p = new Players();
		players = p.getNumOfPlayers();
	}
	
	void collectGuesses()
	{
		PlayerGuesses g = new PlayerGuesses();
		playerGuesses = g.getGuesses(players);
	}
	
	int answer()
	{
		Random r = new Random(); // new Remdom Class invoked for Random Guess Generation--->addaed
		answer = r.nextInt(11);
		
	    return answer;
	}
	
	void winner()
	{
		
		for(int i=0;i<playerGuesses.length;)
		{
			if(answer == playerGuesses[i])
			{
				winner=i;
				System.out.println("The winning number is: "+answer);
				System.out.println("Congrats to Player "+(i+1)+" !");
				break;
			}
			else 
			{
				System.out.println("The winning number is: "+answer);
				System.out.println("Oho!! Losers, please try again :)");
				break;
			}
		}
	}
}

public class GuesserGame 
{
	public static void main(String[] args)
	{
		Unpire game = new Unpire();
		game.collectPlayers();
		game.collectGuesses();
		game.answer();
		game.winner();
	}
}
