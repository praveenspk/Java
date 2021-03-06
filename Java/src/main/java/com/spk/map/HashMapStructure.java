package com.spk.map;

import java.util.HashMap;
import java.util.Iterator;
/**
 * @author Praveen
 *
 */
public class HashMapStructure  {
	/**
	 * @author s84119411
	 */
	public static void main(String[] args) {
		Country india = new Country("India", 1000);
		Country japan = new Country("Japan", 10000);
		Country france = new Country("France", 2000);
		Country russia = new Country("Russia", 20000);
		HashMap<Country, String> countryCapitalMap = new HashMap<Country, String>();
		countryCapitalMap.put(india, "Delhi");
		countryCapitalMap.put(japan, "Tokyo");
		countryCapitalMap.put(france, "Paris");
		countryCapitalMap.put(russia, "Moscow");
		System.out.println("India : " + india.hashCode());
		System.out.println("France : " + france.hashCode());
		System.out.println("Japan : " + japan.hashCode());
		System.out.println("Russia : " + russia.hashCode());

		Iterator<Country> countryCapitalIter = countryCapitalMap.keySet().iterator();// put debug point at this line
		while (countryCapitalIter.hasNext()) {
			Country countryObj = (Country) countryCapitalIter.next();
			String capital = countryCapitalMap.get(countryObj);
			System.out.println(countryObj.getName() + "----" + capital);
		}
	}
}