package com.qibill.methods;

import java.util.List;
import java.util.Map;

import com.qibill.pets.Person;
import com.qibill.pets.Pet;

public class ExplicitTypeSpecification {
	static void f(Map<Person, List<Pet>> petPeople) {
	}

	public static void main(String[] args) {
		f(New.<Person, List<Pet>>map());
	}
} /// :~
