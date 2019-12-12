package com.spk.map;

import java.util.Comparator;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;
/**
 * @author Praveen
 *
 */
public class TreeMap_Test {
	static class ComparatorByName implements Comparator<CityReport> {

		public int compare(CityReport o1, CityReport o2) {
			return o1.city.compareTo(o2.city);
		}
	}

	static class ComparatorByNumber implements Comparator<CityReport> {

		@Override
		public int compare(CityReport o1, CityReport o2) {
			return (int) (o1.counter - o2.counter);
		}
	}

	public static void main(String[] args) {

		String cities = "Delhi,Agra,Bihar,UP,Delhi,Agra,Bihar,UP,Delhi,Bihar,Delhi,Agra,Delhi";

		TreeMap<String, Long> groupByCitiesMap = Stream.of(cities.split(","))
				.collect(Collectors.groupingBy(s -> s, TreeMap::new, Collectors.counting()));
		// System.out.println(groupByCitiesMap);

		TreeMap<String, CityReport> treeMap = new TreeMap();
		for (String city : cities.split(",")) {
			CityReport cityReport = new CityReport(city);
			if (treeMap.containsKey(city)) {
				treeMap.computeIfPresent(city, (key, val) -> {
					val.counter += 1;
					return val;
				});
				System.out.println(treeMap);
			} else {
				treeMap.put(city, cityReport);
				// System.out.println(treeMap);
			}
		}

	}

}
