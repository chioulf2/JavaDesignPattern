package com.jc.facade;

public class LetterProcessImpl implements LetterProcess{

	@Override
	public void writeContext(String context) {
		System.out.println("填寫內容:"+context);
	}

	@Override
	public void fillEnvelope(String address) {
		System.out.println("填寫地址:"+address+"，然後封上信封");
	}

	@Override
	public void sendLetter() {
		System.out.println("寄出去囉！");
	}
	
}
