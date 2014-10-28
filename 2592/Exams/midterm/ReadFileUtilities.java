package midterm;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;

public class ReadFileUtilities {

	/**
	 * Determines file size and returns how many records were in the file
	 * 
	 * @param fileName
	 * @return
	 * @throws IOException
	 */
	public static int readFileSize(String fileName) throws IOException {
		File fileIn = new File(fileName);
		int fileRecords = 0;
		@SuppressWarnings("unused")
		String line = "";
		BufferedReader br = null;

		if (fileIn.isFile()) {

			try {
				br = new BufferedReader(new FileReader(fileIn));
				while ((line = br.readLine()) != null) {
					fileRecords++;
				}
			} finally {
				if (br != null) {
					br.close();
				}
			}
		}
		return fileRecords;
	}

	/**
	 * Read file into a HashSet that is passed to the method
	 *
	 * @param names
	 * @param fileName
	 * @throws IOException
	 */
	public static Set<String> readFileIntoHashSet(String[] names, String fileName)
			throws IOException {
		File fileIn = new File(fileName);
		String line = "";
		BufferedReader br = null;

		Set<String> mySet = new LinkedHashSet<String>();


		if (fileIn.isFile()) {
			try {
				br = new BufferedReader(new FileReader(fileIn));
				while ((line = br.readLine()) != null) {
					mySet.add(line);
				}
			} finally {
				if (br != null) {
					br.close();

				}
			}
		}
		return mySet;
	}

	/**
	 * Read file into a String array that is passed to the method
	 * 
	 * @param names
	 * @param fileName
	 * @throws IOException
	 */
	public static void readFileIntoArray(String[] names, String fileName)
			throws IOException {
		File fileIn = new File(fileName);
		String line = "";
		BufferedReader br = null;
		int index = 0;

		if (fileIn.isFile()) {
			try {
				br = new BufferedReader(new FileReader(fileIn));
				while ((line = br.readLine()) != null) {
					names[index] = line;
					index++;
				}
			} finally {
				if (br != null) {
					br.close();
				}
			}
		}
	}

	/**
	 * Output generic array
	 * 
	 * @param array
	 */
	public static <E> void displayArray(E[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print("\n" + i +":\t" + array[i]);
		}
		System.out.println("\n");
	}
}
