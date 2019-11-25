package com.spk.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class BasicOperations {

	public static void main(String[] args) {
		
		Map<Integer, String> mapHttpErrors = new HashMap<>();
		mapHttpErrors.put(200, "OK");
		mapHttpErrors.put(303, "See Other");
		mapHttpErrors.put(404, "Not Found");
		mapHttpErrors.put(500, "Internal Server Error");
		System.out.println(mapHttpErrors.size());
		System.out.println(mapHttpErrors);
		Map<Integer, String> mapErrors = new HashMap<>(mapHttpErrors);
		System.out.println(mapErrors);
		//LinkedHashMap
		Map<String, String> mapContacts = new LinkedHashMap<>();
		mapContacts.put("9769238175", "Tom");
		mapContacts.put("9014891321", "Peter");
		mapContacts.put("9845678912", "Mary");
		mapContacts.put("9981127421", "John");
		System.out.println(mapContacts);
		//TreeMap
		Map<String, String> mapLang = new TreeMap<>();
		mapLang.put(".c", "C");
		mapLang.put(".java", "Java");
		mapLang.put(".pl", "Perl");
		mapLang.put(".cs", "C#");
		mapLang.put(".php", "PHP");
		mapLang.put(".cpp", "C++");
		mapLang.put(".xml", "XML");
		if(mapLang.isEmpty()){
			System.out.println("No Map Elements");
		}
		System.out.println(mapLang);
		
		
		//getObject(key)
		String status301 = mapHttpErrors.get(500);
		System.out.println("301: " + status301);
		
		//containsKey()
		if (mapHttpErrors.containsKey("200")) {
			System.out.println("Http status 200");
			} 
				
		if (mapHttpErrors.containsValue("OK")) {
			System.out.println("Found status OK");
			}
		System.out.println(mapHttpErrors.get(500)+" "+mapContacts.put("9490137902", "Praveen"));
		System.out.println(mapContacts);
		Map<String,String> map=new TreeMap<>();
		
	}

}
