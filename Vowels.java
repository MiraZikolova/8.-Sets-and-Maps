package sets9;

import java.util.*;
import java.io.*;

public class Vowels {
	public static void main(String[] args) throws Exception {
		File file = new File("src/sets9/Vowels.java");     //this is how we read the file
		if (file.exists()) {                                      // does it even exist?
			countVowels(file);
		} else {
			System.out.println("File does not exist");
		}

	}

	public static void countVowels(File file) throws Exception {
		Character[] keywordString = { 'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'};
		Set<Character> keywordSet = new HashSet<Character>(Arrays.asList(keywordString));
		int countVowels = 0;
		int countConsonants = 0;

	
			FileReader fr = new FileReader(file);                  //Scanner - nqma nextChar() -> FileReader
			BufferedReader br = new BufferedReader(fr);     //po-optimalno izpulnenie
			int c = 0;
			while((c = br.read()) != -1) {               //zapochwame da chetem    //ASCI kod
				char character = (char) c;               //casting
				if(character > 'a' && character < 'z'
						|| character > 'A' && character < 'Z') {         //ASCI
					if(keywordSet.contains(character)) {
						countVowels++;
					}else {
						countConsonants++;
					}
					}
				}
						
			System.out.println("Vowels: " + countVowels);
			System.out.println("Consonants: " + countConsonants);
			br.close();			
	}
}