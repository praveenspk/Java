package com.spk.strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/**
 * @author Praveen
 *
 */
public class MostRepetedStringInlist {

	public static Map.Entry<String, Integer> getMostRepetedString(List<String> str) {
		Map<String, Integer> data = new HashMap<String, Integer>();
		Iterator<String> iterator = str.iterator();
		while (iterator.hasNext()) {
			String strdata = iterator.next();
			if (data.containsKey(strdata)) {
				data.put(strdata, data.get(strdata) + 1);
			} else {
				data.put(strdata, 1);
			}
		}
		Map.Entry<String, Integer> maxEntry = null;

		for (Map.Entry<String, Integer> entry : data.entrySet()) {
			if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0) {
				maxEntry = entry;
			}
		}
		return maxEntry;
	}

	public static void main(String[] args) {
		List<String> data = new ArrayList<String>();
		data.add("Vardhan");
		data.add("Vardhan");
		data.add("praveen");
		data.add("Thimothy");
		data.add("Kalavathi");
		data.add("Ratna");
//		data.add("aa");
		data.add("v");
		data.add("p");
		data.add("k");
		data.add("t");
		data.add("y");
		data.add("r");
		data.add("Vardhan");
		data.add("i");
		data.add("aa");
		data.add("m");
		data.add("aa");
		data.add("v");
		Map.Entry<String, Integer> soso = getMostRepetedString(data);
		System.out.println(soso.getKey() + " times" + soso.getValue());
		System.out.println("done");
	}
}