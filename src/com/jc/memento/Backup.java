package com.jc.memento;

import java.util.Date;

public class Backup {
	final String state;
	final Date date;

	Backup(String state) {
		this.state = state;
		this.date = new Date();
	}
}
