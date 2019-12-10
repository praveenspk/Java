package com.spk.arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

class SortStudentsByRollNumber {

	public static Map<Integer, Student> listToMap(List<Student> students) {
		Map<Integer, Student> studentsMap = new TreeMap<Integer, Student>();

		for (Student student : students) {
			studentsMap.put(student.getRollNo(), new Student(student.getName(), student.getRollNo(), student.getEmail(),
					student.getMobile(), student.getBranch(), student.getAddrs()));
		}
		// Using Streams
		List<Integer> keyList = studentsMap.keySet().stream().collect(Collectors.toList());
		List<Student> valueList = studentsMap.values().stream().collect(Collectors.toList());
		System.out.println(keyList + " " + valueList);

		return studentsMap;

	}

	public static void main(String s[]) {
		List<Student> students = new ArrayList<Student>();
		students.add(new Student("Praveen", 15, "CSE", 9490137902L, "praveen@spk", "pulivendula"));
		students.add(new Student("Vardhan", 31, "ME", 9491067978L, "vardhan@spk", "kadapa"));
		students.add(new Student("Suresh", 22, "ECE", 9394194927L, "suresh@spk", "Pulivendula"));
		students.add(new Student("Balaji", 14, "MCA", 8954625122L, "bala@spk", "Nellore"));
		students.add(new Student("Siva", 12, "CSE", 9642221947L, "siva@spk", "venkatagiri"));
		students.add(new Student("Ratna", 25, "CSE", 9177935427L, "ratna@spk", "pulivendula"));
		students.add(new Student("Neelima", 16, "ECE", 9989861038L, "neelu@spk", "Kadapa"));
		System.out.println("List Sorted by Key as Rollno");
		System.out.println(students);
		System.out.println();
		System.out.println("List to Map");
		System.out.println(listToMap(students));
	}

}