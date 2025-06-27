
import java.util.Scanner;
public class Account {
	Scanner scan = new Scanner(System.in);
	private int balance;
	public Account() {
	}
	
	public void userAct() {
		System.out.println("Что вы хотите сделать?");
		System.out.println("1. Положить деньги на счет.");
		System.out.println("2. Снять деньги со счета.");
		System.out.println("3. Посмотреть баланс.");
		System.out.println("4. Назад");
		System.out.println("5. Выход");
		int otv = scan.nextInt();
		switch(otv) {
			case 1:
				setBalance();
				userAct();
				break;
			case 2:
				decrBalance();
				userAct();
				break;
			case 3:
				getBalance();
				userAct();
				break;
			case 4:
				menuOption menu = new menuOption();
				menu.checkPas();
				break;
			case 5:
				System.out.println("Хорошего дня");
				break;
			default:
				System.out.println("Неверный ввод.");
				userAct();
			
		}	
		
	}
	public void setBalance() {
		System.out.println("Введите сумму пополнения: ");
		int y = scan.nextInt();
		balance += y;
		System.out.println("Текущий баланс: "+ balance);
		}
	public void decrBalance() {
		System.out.println("Сколько вы хотите снять?");
		int y = scan.nextInt();
		if (balance >= y) {
			balance -= y;
			System.out.println("Вы сняли: " + y + "." + " Текущий баланс: " + balance);
		} else {
			System.out.println("Недостаточно средств. Текущий баланс: " 
							+ balance + " Введите другую сумму." + "\n");
			
		}
	}
	public void getBalance() {
		System.out.println("Ваш баланс: "+ balance);
	}
	
}
