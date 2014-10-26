package assignment01;


public class Sentence {
	
	/**
	 * Reverse the given string with a given length
	 * @param sentence Sentence to reverse
	 * @param sentenceLength Length of string
	 */
	public static void reverse(String sentence, int sentenceLength) {

		if (sentenceLength > 0) {
			System.out.print(sentence.substring(sentenceLength - 1));
			reverse(sentence.substring(0, sentenceLength - 1), --sentenceLength);
		} else {
			System.out.println();
		}
	}
	
	/**
	 * Reverse method with simpler params
	 * @param sentence Input sentence to reverse
	 */
	public static void reverse(String sentence) {

		int sentenceLength = sentence.length();
		if (sentenceLength > 0) {
			System.out.print(sentence.substring(sentenceLength - 1));
			reverse(sentence.substring(0, sentenceLength - 1));
		} else {
			System.out.println();
		}
	}
}