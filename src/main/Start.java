package main;

import sh.personen.PartyPlanerSchlumpf;
import sh.planen.NichtEingeladenException;
import sh.personen.PartyPlanerSchlumpf;

public class Start {

	public static void main(String[] args) throws NichtEingeladenException {
		PartyPlanerSchlumpf patty = new PartyPlanerSchlumpf();
		System.out.println("In Schlumpfhause findet mal wieder eine party statt");
		System.out.println("Die Party wird geplant von " + patty.soHeissIch());

		patty.partyPlan();
		System.out.println(patty.soHeissIch() + "hat die Party geplant, aufräum soll jemand anderes... ");

	}

}
