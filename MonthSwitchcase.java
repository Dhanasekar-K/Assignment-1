package assignment;
import java.util.Scanner;
public class MonthSwitchcase {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter any number:");
		int day=scan.nextInt();
	        scan.close();
		switch(day)
		{
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("tuesday");
			break;
		case 3:
			System.out.println("wednesday");
			break;
		case 4:
			System.out.println("thursday");
			break;
		case 5:
			System.out.println("friday");
			break;
		case 6:
			System.out.println("saturday");
			break;
		case 7:
			System.out.println("sunday");
			break;
			default:
			System.out.println("invalid");
		}

	}

}
