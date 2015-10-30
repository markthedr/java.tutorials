import java.util.Scanner;

public static void main(String[] args){
		String name, present, yourName;
		int age;
		Scanner inputString = new Scanner(System.in);
		Scanner inputNumber = new Scanner(System.in);
		
		System.out.print("What is the name of the gift giver? ");
		name = inputString.nextLine();
		System.out.print("Whhat is the present they gave you? ");
		present = inputString.nextLine();
		System.out.print("How old were you on your birthday? ");
		age = inputNumber.nextInt();
		System.out.print("What is your name? : ");
		yourName = inputString.nextLine();		
		System.out.println();
		System.out.println();
		System.out.println();

		System.out.println("Dear" + name + ",");
		System.out.println("thank you for the" + present);
		System.out.println("I'm already" + age + "old");
		System.out.println("being" + (age-1) + " ");
		System.out.println("Sincerly" + yourName);
	}
		
}		System.out.println("Dear " + name + ",");
		System.out.println("thank you for the " + present);
		System.out.println("I've just turned " + age + " old");
		System.out.println("Sincerly " + yourName);
}
