package com.jc.facade;

public class PostOfficeFacade {
	
	private LetterProcess letterProcess = new LetterProcessImpl();
	
	public void sendLetter(String context, String address){
		letterProcess.writeContext(context);
		letterProcess.fillEnvelope(address);
		letterProcess.sendLetter();
	}	
}
