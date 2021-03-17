import java.util.Scanner;

public class NameAndInitialsProblem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner name = new Scanner(System.in);
		String firstName;
		String middleName;
		String lastName;
		
		char firstInitial, middleInitial, lastInitial;
		
		System.out.println("Write each part of your name after each enter, you will put your first name, middle name"
				+ " (if you don't have one just place a placeholder for now.) and a last name ");
		
		firstName = name.nextLine();
		middleName = name.nextLine();
		lastName= name.nextLine();
		
		firstInitial = firstName.charAt(0);
		middleInitial = middleName.charAt(0);
		lastInitial = lastName.charAt(0);
		
		System.out.println("You're First Name is: " + firstName + "\n" + "You're Middle Name is: " + middleName +
				"\n"+ "You're Last Name is: " + lastName); 
		
		System.out.println("You're First Initial is: " + firstInitial + "\n" + "You're Middle Initial is: " + middleInitial +
				"\n"+ "You're Last Initial is: " + lastInitial);
		
	}

}
