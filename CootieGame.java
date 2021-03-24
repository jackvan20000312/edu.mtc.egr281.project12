package project12;

//****************************************************************************************
//Author: Jacob Vaught       Modified: 11/17/20
//
//EGR-281  Project 12  			  Due: 11/18/20 6:00PM
//****************************************************************************************
//finished coding 11-17-2020

public class CootieGame {
	public static final java.util.Scanner 
	INPUT = new java.util.Scanner(System.in);
	
	private Dice dice;
	Cootie[] cooties;
	// Create the dice and Cooties.
	public CootieGame() {
		System.out.print("How many players are in the race? [2-4 Players]");
		int numberofplayers=INPUT.nextInt();
		cooties = new Cootie[numberofplayers];
		for(int i = 0; i < cooties.length; ++i) {
			System.out.print("Enter player # " + (i + 1) + "'s name: ");
			cooties[i] = new Cootie(INPUT.next());
		}// Ending bracket of for loop
		dice = new Dice();	
	}//Cootiegame ending bracket
	// Create the game
	public static void main(String[] args) {
		System.out.println("Welcome to Cootie.\n(A Game By Milton Bradley)");
		CootieGame game = new CootieGame();
		game.play();
	}//main method closing bracket
	// Play until someone wins
	public void play() {
		boolean isGameComplete=false;
		do {
		for(int i = 0; i < cooties.length; ++i) {
			Cootie bug=cooties[i];
			if(!(takeTurnAgain(bug))) {
				//go to next player
				System.out.println("\n");
			}else if((takeTurnAgain(bug))) {
				//play again
				--i;
				System.out.println("\n");
			}
		}
		}while(!isGameComplete);
	}//ending bracket of method play
	
	public void gameOverMenu(String currentplayer) {
		System.out.println();
		System.out.println("GAME OVER");
		System.out.println(currentplayer+" won!");
		playAgainPrompt();
	}// ending bracket of gameoverMenu
	
	public void playAgainPrompt() {
		System.out.println("Do you want to play again? (yes/no): ");
		String input = INPUT.nextLine();
		if(input.equals("yes")){
			CootieGame game = new CootieGame();
			game.play();
		}

	}// ending bracket for playAgainPrompt
	
	public boolean takeTurnAgain(Cootie bug) {
		System.out.println("#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#");
		System.out.println(bug.toString(bug));
		System.out.print(bug.getName()+", Hit enter to roll: ");
		INPUT.nextLine();
		dice.roll();
		System.out.print(bug.getName()+" rolled a " + dice.getValue());
		switch(dice.getValue()) {
		case 1:
			if(bug.isComplete()) {
				gameOverMenu(bug.getName());
			}
			return caseOne(bug);
		case 2:
			if(bug.isComplete()) {
				gameOverMenu(bug.getName());
			}
			return caseTwo(bug);
		case 3:
			if(bug.isComplete()) {
				gameOverMenu(bug.getName());
			}
			return caseThree(bug);
		case 4:
			if(bug.isComplete()) {
				gameOverMenu(bug.getName());
			}
			return caseFour(bug);
		case 5:
			if(bug.isComplete()) {
				gameOverMenu(bug.getName());
			}
			return caseFive(bug);
		case 6:
			if(bug.isComplete()) {
				gameOverMenu(bug.getName());
			}
			return caseSix(bug);
		default:
			System.out.println("ERROR CODE- Something you won't understand.\n ERROR Is In TakeTurn Method.");
			return false;
		}	
	}//ending bracket of method takeTurnAgain

	public boolean caseOne(Cootie bug) {
		System.out.println(" (body)");
		if(!bug.hasBody()) {
			//if bug doesn't have (part) add one.
			bug.addBody();
			if (!bug.hasBody()) {
				return false;
			}else {
				System.out.println(bug.getName()+" got a Body\n");
				return true;
			}
		}else {
			//if bug does have (part) don't add one.
			System.out.println(bug.getName()+" already has a body. "+bug.getName()+" forfeits an extra roll.\n");
			return false;
		}
	}//Ending bracket of method caseOne
	public boolean caseTwo(Cootie bug) {
		System.out.println(" (head)");
		if(!bug.hasHead()) {
			//if bug doesn't have body has one.
			bug.addHead();
			if (!bug.hasHead()) {
				return false;
			}else {
				System.out.println(bug.getName()+" got a Head\n");
				return true;
			}
		}else {
			//if bug does have body don't add one.
			System.out.println(bug.getName()+" already has a Head. "+bug.getName()+" forfeits an extra roll.\n");
			return false;
		}
	}//Ending bracket of method caseTwo
	public boolean caseThree(Cootie bug) {
		System.out.println(" (Antennae)");
		if(!bug.hasAntennae()) {
			//if bug doesn't have antennae add one.
		
			bug.addAntennae();
			if (!bug.hasAntennae()) {
				
				System.out.println("You Do Not Have A Head Yet.\n");
				return false;
			}else {
				System.out.println(bug.getName()+" got a Antennae\n");
				return true;
			}
		}else {
			//if bug does have antennae don't add one.
			System.out.println(bug.getName()+" already has a Antennae. "+bug.getName()+" forfeits an extra roll.\n");
			return false;
		}
	}//Ending bracket of method caseThree
	public boolean caseFour(Cootie bug) {
		System.out.println(" (eyes)");
		if(!bug.hasEyes()) {
			
			//if bug doesn't have eyes add  one.
			bug.addEyes();
			if (!bug.hasEyes()) {
				System.out.println("You Do Not Have A Head Yet.\n");
				return false;
			}else {
				System.out.println(bug.getName()+" got a set of Eyes\n");
				return true;
			}
		}else {
			//if bug does have eyes don't add one.
			System.out.println(bug.getName()+" already has Eyes. "+bug.getName()+" forfeits an extra roll.\n");
			return false;
		}
	}//Ending bracket of method caseFour
	public boolean caseFive(Cootie bug) {
		System.out.println(" (mouth)");
		if(!bug.hasMouth()) {
			//if bug doesn't have mouth add one.
			bug.addMouth();
			if (!bug.hasMouth()) {
				System.out.println("You Do Not Have A Head Yet.\n");
				return false;
			}else {
				System.out.println(bug.getName()+" got a Mouth\n");
				return true;
			}
		}else {
			//if bug does have mouth don't add one.
			System.out.println(bug.getName()+" already has a Mouth. "+bug.getName()+" forfeits an extra roll.\n");
			return false;
		}
	}//Ending bracket of method caseFive
	public boolean caseSix(Cootie bug) {
		System.out.println(" (leg)");
		if(!bug.hasSixLegs()) {
			//if bug doesn't have 6 legs add one.
			if (bug.hasAddedALeg()) {
				System.out.println(bug.getName()+" got a Leg\n");
				return true;
			}else {
				System.out.println("You Do Not Have A Head Yet.\n");
				return false;
			}
		}else {
			//if bug does have six legs don't add one.
			System.out.println(bug.getName()+" already has 6 legs. "+bug.getName()+" forfeits an extra roll.\n");
			return false;
		}
}//Ending bracket of method caseSix
}// ending bracket of class CootieGame