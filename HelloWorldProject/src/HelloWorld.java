import java.util.Scanner;
/*
 * TODO: Name: Meade Havenstein
 * TODO: Date: 9/9/25
 * TODO: Class Period: 6
 * TODO: Program Description: ask the user for their name, age, favorite 3+ digit number, and GPA  (cumulative, weighted). The program will then print out the name, age based comment, grade based compliment, all multiples of the length of name until favorite number
 */
public class HelloWorld {

	public static void main(String[] args) {
		//TODO: Implement Program Requirements Here
		Scanner scanner = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = scanner.nextLine();
		System.out.println("What is your age?");
		Int age = scanner.nextInt();
		System.out.println("What is your favorite number that has more than 3 digits?");
		Int fav = scanner.nextInt();
		System.out.println("What is your GPA?");
		double gpa = scanner.nextDouble();
		
		System.out.println("Hello" + name);
		String congrats = "";
		if(age > 17)
			congrats = "Congradulations on being 18!";
		else
			congrats = 18 - age + " years until you turn 18!";
		System.out.println(congrats);

		String comp = "";
		if (GPA >= 4.5)
			comp = "Amazing job!";
		else if (GPA >= 4.0)
			comp = "Good job!";
		else if (GPA >= 3.5)
			comp = "Almost there!";
		else if (GPA >= 3.0)
			comp = "Keep trying!";
		else
			comp = "Do your best!";
		System.out.println(comp);

		for(int i = 0; i++; i < fav);
		{
			if
		}
	}

}//end class
