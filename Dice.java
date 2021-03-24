package project12;

import java.util.Random;

public class Dice {
	public static final int DEFAULT_NUMBER_OF_SIDES=6;
	private int value;
	private int numberOfSides;
	private Random randomizer;
	
	public Dice() {
		this.randomizer = new Random();
		this.setNumberOfOptions(Dice.DEFAULT_NUMBER_OF_SIDES);
		this.setValue(this.roll());
	}// ending bracket of Dice method
	public int getValue() {
		return this.value;
	}// ending bracket of getValue method
	private void setValue(int newValue) {
		this.value=newValue;
	}// ending bracket of setValue method
	public int getNumberOfOptions() {
		return this.numberOfSides;
	}// ending bracket of getNumberOfOptions method
	private void setNumberOfOptions(int newNumberOfSides) {
		this.numberOfSides = newNumberOfSides;
	}// ending bracket of setNumberOfOptions method
	public int roll() {
		this.setValue(this.randomizer.nextInt(this.getNumberOfOptions())+1);;
		return this.getValue();
	}// ending bracket of roll method
}// ending bracket for class
