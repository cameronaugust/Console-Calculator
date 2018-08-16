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
	static String [] multiplicationVocab = new String[] {"multiply", "multiplication", "multiplying", "Multiply", "Multiplying", "Multiplication"};
	static String [] divisionVocab = new String[] {"divide", "dividing", "division", "Divide", "Dividing", "Division"};	

	public static void main(String []args) {
		//prompt
		//new Scanner to check calculation method
		checkCalcMeth();
	}

	private static void checkCalcMeth() {
		System.out.println("Please type in calculation method:");
		Scanner sc = new Scanner(System.in);
		calcMeth = sc.nextLine(); 

		for (String method : additionVocab) {
			if (calcMeth.equals(method)){
				Scanner addInput = new Scanner(System.in);
				System.out.println("Please type your first (whole) number:");
				userNumX = addInput.nextInt();

				System.out.println("Please type your second (whole) number:");
				userNumY = addInput.nextInt();

				System.out.println(userNumX + " + " + userNumY + " = " + addNums(userNumX, userNumY));
			}
		}

		for (String method0 : subtractionVocab) {
			if (calcMeth.equals(method0)){
				Scanner subtractInput = new Scanner(System.in);
				System.out.println("Please type your first (whole) number:");
				userNumX = subtractInput.nextInt();

				System.out.println("Please type your second (whole) number:");
				userNumY = subtractInput.nextInt();

				System.out.println(userNumX + " - " + userNumY + " = " + subtractNums(userNumX, userNumY));
			}
		}

		for (String method2 : multiplicationVocab) {
			if (calcMeth.equals(method2)){
				Scanner multiplyInput = new Scanner(System.in);
				System.out.println("Please type your first (whole) number:");
				userNumX = multiplyInput.nextInt();

				System.out.println("Please type your second (whole) number:");
				userNumY = multiplyInput.nextInt();

				System.out.println(userNumX + " mutliplied by " + userNumY + " = " + multiplyNums(userNumX, userNumY));
			}
		} 
		for (String method3 : divisionVocab) {
			if (calcMeth.equals(method3)){
				Scanner divideInput = new Scanner(System.in);
				System.out.println("Please type your first (whole) number:");
				userNumX = divideInput.nextInt();

				System.out.println("Please type your second (whole) number:");
				userNumY = divideInput.nextInt();

				System.out.println(userNumX + " divivded by " + userNumY + " = " + divideNums(userNumX, userNumY));
			} else {
				System.out.println("Error: invalid input!");
			}
		}
	}

	private static int subtractNums(int userNumX2, int userNumY2) {
		int sum = userNumX2 - userNumY2;
		return sum;
	}
	private static int addNums(int userNumX2, int userNumY2) {
		int sum = userNumX + userNumY;
		return sum;
	}
	private static int multiplyNums(int userNumX2, int userNumY2) {
		int sum = userNumX2 * userNumY2;
		return sum;
	}
	private static int divideNums(int userNumX2, int userNumY2) {
		int sum = userNumX / userNumY;
		return sum;

	}
}
