import java.util.Scanner;

public class Duration{
	public static void main(String[] args){
		
	/*
	 This program is meant to transform seconds into hours, minutes and seconds.
	*/
		int seconds;
		Scanner keyboard = new Scanner (System.in);
		
		System.out.println("Enter seconds ");
		seconds = keyboard.nextInt();
		
		int hours = (seconds/3600); 
		int minutes = (seconds -(3600*hours))/60;
		int secc = (seconds -(3600*hours)-(minutes*60));
		
		System.out.println("The seconds turned into hours, minutes and seconds is: " + hours
		+ ":" + minutes + ":" + secc);
	}
}