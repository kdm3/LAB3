import java.util.Scanner;

public class TablePowers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Learn your squares and cubes.");
		
		String answer= "y";
		
		while(answer.equalsIgnoreCase("y")){
			
		System.out.println("Please enter an integer");
		int initial =input.nextInt();
		System.out.println("Number\t Squared\t Cubed \n=======\t =======\t =======");
		
		for (int y=1; y <= initial; y++){
			int square = (y * y);
			int cube = (y * y * y);
			
			
			System.out.println(y +"\t " + square + "\t " + "\t" + cube );
		}
		
		System.out.println("Continue? Y/N");
		String garbage=input.nextLine();
		answer = input.nextLine();
		}
		
		System.out.println("Exiting squares and cubes.");
		
		input.close();
	}

}
