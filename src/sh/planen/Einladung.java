package sh.planen;

import java.time.LocalDateTime;

import sh.personen.Schlumpf;

public class Einladung {
	public void einladen(Schlumpf schlumpf) throws NichtEingeladenException {
		if (schlumpf.soHeissIch().equals("Gargamel") || schlumpf.soHeissIch().equals("Azrael")) {
			throw new NichtEingeladenException();
		}
		System.out.println("Lieber " + schlumpf.soHeissIch() + " !komm doch bitte"
				+ " in 3 tagen zur party  im piltz Nummer 13 an der dritten Eiche von links"
				+ " Diese Einladung wurde erstellt am: " + LocalDateTime.now());
	}
}
