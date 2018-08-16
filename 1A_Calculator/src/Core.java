import java.util.Scanner;
/* Calculator V1
 * Simple console calculator
 * 8/12/18 CJA
 */
public class Core {
	private static int userNumX;
	private static int userNumY;

	private static String calcMeth;

	static String[] additionVocab = new String[]{"add", "adding", "addition", "Add", "Adding", "Adition"};
	static String [] subtractionVocab = new String[] {"subtract", "subtracting", "subtraction", "Subtract", "Subtracting", "Subtraction"};
	static String [] multipcationVocab = new String[] {"multiply", "multiplication", "multiplying", "Multiply", "Multiplying", "Multiplication"};
	static String [] divisionVocab = new String[] {"divide", "dividing", "division", "Divide", "Dividing", "Division"};	

	public static void main(String []args) {
		//prompt
		System.out.println("Please type in calculation method:");
		//new Scanner to check calculation method
		Scanner sc = new Scanner(System.in);
		calcMeth = sc.nextLine(); 
		for (String match : additionVocab) {
			if (calcMeth.equals(match)) {

				System.out.println("Please type your first (whole) number:");
				userNumX = sc.nextInt();

				System.out.println("Please type your second (whole) number:");
				userNumY = sc.nextInt();

				System.out.println(userNumX + " + " + userNumY + " = " + addNums(userNumX, userNumY));

			}
		}
	}
	private static int addNums(int userNumX2, int userNumY2) {
		int sum = userNumX + userNumY;
		return sum;

	}
}
