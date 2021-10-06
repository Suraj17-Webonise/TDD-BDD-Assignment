import java.util.Scanner;

public class Password_Validation {

	public static void main(String[] args) {
		final int num_upper_key = 1;
		final int num_lower_key = 2;
		final int num_digit = 3;
		int upperCount = 0;
		int lowerCount = 0;
		int digitCount = 0;
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Password for Validation");
		String input = scn.nextLine();
		scn.close();
		int length = input.length();

		for (int i = 0; i < length; i++) {
			char ch = input.charAt(i);
			if (Character.isUpperCase(ch))
				upperCount++;
			else if (Character.isLowerCase(ch))
				lowerCount++;
			else if (Character.isDigit(ch))
				digitCount++;

		}
		if (upperCount >= num_upper_key && lowerCount >= num_lower_key && digitCount >= num_digit)
			System.out.println("The entered password is valid");
		else {
			System.out.println("Password entered is Invalid : ");
			if (upperCount < num_upper_key)
				;
			System.out.println("Atlest one upperCase letter is mandatory");
			if (lowerCount < num_lower_key)
				;
			System.out.println("Atleast two LowerCase letters are mandatory");
			if (digitCount < num_digit)
				System.out.println("Atleast three digits are mandatory");
		}
	}
}
