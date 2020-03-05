package com.spk.set;

public class Person implements Comparable<Person> {

	private String personName;
	private Integer personAge;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(String personName, Integer personAge) {
		super();
		this.personName = personName;
		this.personAge = personAge;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public Integer getPersonAge() {
		return personAge;
	}

	public void setPersonAge(Integer personAge) {
		this.personAge = personAge;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((personAge == null) ? 0 : personAge.hashCode());
		result = prime * result + ((personName == null) ? 0 : personName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (personAge == null) {
			if (other.personAge != null)
				return false;
		} else if (!personAge.equals(other.personAge))
			return false;
		if (personName == null) {
			if (other.personName != null)
				return false;
		} else if (!personName.equals(other.personName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Person [personName=" + personName + ", personAge=" + personAge + "]";
	}

	public int compareTo(Person o) {
		/*
		 * if (this.getPersonName() == o.getPersonName()) { return 0;
		 * 
		 * } else { return 1; }
		 */
		return this.personAge - o.personAge;
	}

}
