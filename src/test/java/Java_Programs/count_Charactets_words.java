package Java_Programs;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class count_Charactets_words {
	static int linecount = 0;
	static int wordcount = 0;
	static int charcount = 0;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stu
		String filepath = "C:\\Users\\1030205\\OneDrive - Blue Yonder\\Documents\\Sireesha\\Sample\\samplefile.txt";
		try {
			BufferedReader reader = new BufferedReader(new FileReader(filepath));

			String line = reader.readLine();
			while (line != null) {
				linecount++;

				String words[] = line.split(" ");
				wordcount = wordcount + words.length;

				for (String word : words) {
					charcount = charcount + word.length();
				}
				line= reader.readLine();

			}
			System.out.println("the line count is " + linecount);
			System.out.println("the word count is " +wordcount);
			System.out.println("the character count is" +charcount);
		}
		
		
		

		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
