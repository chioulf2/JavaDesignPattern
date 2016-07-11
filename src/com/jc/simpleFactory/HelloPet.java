package com.jc.simpleFactory;

public class HelloPet {
	public static void main(String[] args){
		PetFactory petFactory = new PetFactory();
		IPet dog = petFactory.getPet("Dog");
		dog.eat();
		
		IPet cat = petFactory.getPet("Cat");
		cat.eat();
	}
}
