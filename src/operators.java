import java.util.Scanner;
public class operators {
	public static void main(String args[]){
		Scanner Scan1 = new Scanner(System.in);
		
		int x;
		String y;
		System.out.println("Type a whole quantity");
		x = Scan1.nextInt();
		Scan1.nextLine();
		System.out.println("Type a single object");
		y = Scan1.nextLine();
		System.out.println("You have " + x + " " + y + "s");
	}
}
