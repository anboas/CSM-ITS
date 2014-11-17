package Ch21_Stacks;
import java.util.Stack;

/*
 * This program shows how to use a stack to reverse a string
 * 
 */
public class StackReverseString {

	public static void main(String[] args) {

		Stack<Character> characterStack = new Stack<Character>();

		String str = "Hello";
		String header = "POPPING AND PRINTING ORIGINAL STRING IN REVERSE USING STACK";

		// PRINT ORIGINAL STRING
		System.out.println("\nORIGINAL STRING\n" + str + "\n");

		// PUSH STRING ONTO STACK
		for (int i = 0; i < str.length(); i++) {
			characterStack.push(str.charAt(i));
		}
		// Search for item in the stack - NOT ZERO BASED
		System.out.println("e is found at: " + characterStack.search('e'));
		System.out.println("H is found at: " + characterStack.search('H'));
		System.out.println("h is found at: " + characterStack.search('h'));
		// POPPING AND PRINTING ORIGINAL STRING IN REVERSE USING STACK
		System.out.println("\n" + header + "\n");
		while (!characterStack.isEmpty()) {
			System.out.print(characterStack.pop() + "\t");
		}
	}
}
