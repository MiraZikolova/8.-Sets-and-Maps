package maps10;

import java.util.Map;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Capitals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> countryToCapitalMap = new HashMap<String, String>() {{   //create a map
			put("Germany", "Berlin");
			put("Belarus", "Minsk");
			put("Denmark", "Copenhagen");
			put("France", "Paris");
			put("Greece", "Athens");
			put("Hungary", "Budapest");
			put("Italy", "Rome");
			put("Norway", "Oslo");
			put("Portugal", "Lisbon");
			put("Romania", "Bucharest");
			put("Russia", "Moscow");
			put("Spain", "Madrid");
			put("Sweden", "Stockholm");
			put("Switzerland", "Bern");
			put("Ukraine", "Kiev");
			put("Serbia", "Belgrade");
			put("Netherlands", "Amsterdam");
			put("Bulgaria", "Sofia");
		}};
		
		int points = 0;     //our score
		System.out.println("How many of the capitals of these famous countries do you know?");
		List<String> countries = new ArrayList(countryToCapitalMap.keySet());      // wzimsmw keys kato spisuk
		Collections.shuffle(countries);                                             //razburkwame
		Scanner sc = new Scanner(System.in);                                        //iskame da chetem otg na potrebitelq
		for(String country : countries) {                                           //za wsichki durjawi ot spisuka
			//Access keys/values in random order
			System.out.println("What is the capital of " + country + "?");
			String capital = sc.nextLine();                                         //saving the answer of our user
			if(capital.equals(countryToCapitalMap.get(country))){                   //correct answer
				points++;                                          
			}else {
				points--;
			}
		}
		System.out.println("You scored a total of " + points + " points");
	}

}
