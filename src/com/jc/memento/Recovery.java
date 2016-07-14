package com.jc.memento;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Recovery {
	private List<Backup> backups = new ArrayList<Backup>();

	void add(Backup backup) {
		backups.add(backup);
	}

	Backup retrieve(Date date) {
		for (Backup backup : backups) {
			if (backup.date.equals(date)) {
				backups.remove(backup);
				return backup;
			}
		}
		return null;
	}
}
