package com.jc.prototype;

public class Client {
	private static int MAX_COUNT = 5;

	public static void main(String[] args) {
		Mail mail = new Mail(new AdvTemplate());
		mail.setTail("OO銀行版權所有");
		for (int i = 0; i < Client.MAX_COUNT; i++) {
			Mail cloneMail = mail.clone();
			cloneMail.setAppellation(String.valueOf(i) + " 先生(女士)");
			cloneMail.setReceiver(i + "@google.com");
			sendMail(cloneMail);
		}
	}

	private static void sendMail(Mail mail) {
		System.out.println("標題:" + mail.getSubject() + "\t收件人: " + mail.getReceiver() + "\t....發送成功!");
	}
}
