package com.jc.facade;

public class Client {
	public static void main(String[] args){
		PostOfficeFacade postOfficeFacade = new PostOfficeFacade();
		postOfficeFacade.sendLetter("這封信要送給你", "台北市文山區萬盛街93號");
	}
}
