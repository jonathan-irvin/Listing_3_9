import java.util.Scanner;
public class Listing_3_9_Class {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the year you were born: ");
		int year = input.nextInt();
		
		System.out.print("Enter the month of the year you were born: ");
		int month = input.nextInt();
		
		System.out.print("Enter the day of the month you were born: ");
		int day = input.nextInt();
		
		System.out.print("\nYou were born in the year of the ");
		
		switch (year % 12){
		case 0:  System.out.println("monkey.")		break;
		case 1:  System.out.println("rooster."); 	break;
		case 2:  System.out.println("dog."); 		break;
		case 3:  System.out.println("pig."); 		break;
		case 4:  System.out.println("rat."); 		break;
		case 5:  System.out.println("ox."); 		break;
		case 6:  System.out.println("tiger."); 		break;
		case 7:  System.out.println("rabbit."); 	break;
		case 8:  System.out.println("dragon."); 	break;
		case 9:  System.out.println("snake."); 		break;
		case 10: System.out.println("horse."); 		break;
		case 11: System.out.println("sheep."); 
		}
		
		System.out.print("You are a ");
		
		switch (month){
		case 1:	if (day<20) {System.out.println("Capricorn."); 		break;}
				else 		{System.out.println("Aquarius."); 	break;}
		case 2:	if (day<19)	{System.out.println("Aquarius."); 	break;}
				else		{System.out.println("Pisces."); 	break;}
		case 3:	if (day<21)	{System.out.println("Pisces."); 	break;}
				else		{System.out.println("Aries."); 		break;}
		case 4:	if (day<20)	{System.out.println("Aries."); 		break;}
				else		{System.out.println("Taurus."); 	break;}
		case 5:	if (day<21)	{System.out.println("Taurus."); 	break;}
				else		{System.out.println("Gemini."); 	break;}
		case 6:	if (day<22)	{System.out.println("Gemini."); 	break;}
				else		{System.out.println("Cancer."); 	break;}
		case 7:	if (day<23)	{System.out.println("Cancer."); 	break;}
				else		{System.out.println("Leo."); 		break;}
		case 8:	if (day<24)	{System.out.println("Leo."); 		break;}
				else		{System.out.println("Virgo."); 		break;}
		case 9:	if (day<23)	{System.out.println("Virgo."); 		break;}
				else		{System.out.println("Libra."); 		break;}
		case 10: if (day<23)	{System.out.println("Libra."); 		break;}
				else		{System.out.println("Scorpio."); 	break;}
		case 11: if (day<22)	{System.out.println("Scorpio."); 	break;}
				else		{System.out.println("Sagittarius.");break;}
		case 12: if (day<22)	{System.out.println("Sagittarius.");}
				else		{System.out.println("Capricorn.");}
		}

	}

}
