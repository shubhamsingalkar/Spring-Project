package com.springcore.standalone.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {


	List<String> friends;
	Map<String, Integer> fees_structure;
	Properties properties; // Properties is class which extends HashTable class in Map interface



	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	public List<String> getFriends() {
		return friends;
	}

	public Map<String, Integer> getFees_structure() {
		return fees_structure;
	}

	public void setFees_structure(Map<String, Integer> fees_structure) {
		this.fees_structure = fees_structure;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	@Override
	public String toString() {
		return "Person [friends=" + friends + ", fees_structure=" + fees_structure + "]";
	}


}




