import java.util.Scanner;

public class AnnualPayProblem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner talent = new Scanner(System.in);
		String name;
		int age;
		double annualPay;
		
		System.out.println("What is you name kind sir");
		
		while (!talent.hasNextLine()) {
			System.out.println("You entered a incorrect data type please try again");
			} 
		name = talent.nextLine();
		System.out.println(name);
		
		System.out.println("How old are you");
		 
		while (!talent.hasNextInt()) {
			System.out.println("You entered a incorrect variable please ");
		}
		age = talent.nextInt();
		System.out.println(age);
		
		System.out.println("what is your annual pay");
		
		while (!talent.hasNextDouble()) {
			System.out.println("You entered a incorrect variable please ");
		}
		annualPay = talent.nextDouble();
		System.out.println(annualPay);
		
		System.out.println("Your Name is: " + name + "\n" + "You're " + age + " years old " + "\n" + "and you're annual income is " + annualPay );
		}
	
		
	
	
		
	
		

	}


