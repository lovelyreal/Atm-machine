import java.util.Scanner;public class menuOption extends Account{
	Scanner scan = new Scanner(System.in);
	public menuOption() {}
	
	public void checkPas() {
		System.out.println("Enter your ID and Password: ");
		int d = scan.nextInt();
		int pas = scan.nextInt();
		int[] user1IdPas = {12345, 12345};
		int[] user2IdPas = {123, 123};
		if (d == user1IdPas[0] && pas == user1IdPas[1]) {
			System.out.println("You succesfully loged in");
			userAct();
		} else {
			System.out.println("Incorrect password or ID");
			checkPas();
		}
	}
	
}
