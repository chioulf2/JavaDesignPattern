package com.jc.simpleFactory;

public class PetFactory {
	// 用String傳!
	public IPet getPet(String petType) {
		if (petType == null) {
			return null;
		}
		if (petType.equals("Dog")) {
			return new Dog();
		} else if (petType.equals("Cat")) {
			return new Cat();
		} else {
			return null;
		}
	}
}
