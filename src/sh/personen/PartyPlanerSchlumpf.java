package sh.personen;

import sh.personen.Schlumpf;
import sh.planen.Einladung;
import sh.planen.NichtEingeladenException;

public class PartyPlanerSchlumpf extends Schlumpf {
	
	protected Schlumpf[] gaeste = new Schlumpf[9];
	
	public PartyPlanerSchlumpf(){
		super("Paaty");
		gaeste[0] = new Schlumpf("Papa Schlumpf");
		gaeste[1] = new Schlumpf("Schlumpfine");
		gaeste[2] = new Schlumpf("Gargamel");
		gaeste[3] = new Schlumpf("Muffi Schlumpf");
		gaeste[4] = new Schlumpf("Jokey Schlumpf");
		gaeste[5] = new Schlumpf("Fauli Schlumpf");
		gaeste[6] = new Schlumpf("Schlaubi");
		gaeste[7] = new Schlumpf("Codi, der Java Programmierer");
		gaeste[8] = new Schlumpf("Azrael");
	}
	public void partyPlan() throws NichtEingeladenException{
		Einladung einladen = new Einladung();
		for(Schlumpf gast: gaeste) {
			try {
				einladen.einladen(gast);

			}catch(NichtEingeladenException e) {
				System.out.println("Gefangen... " );
				System.out.println("Folgendes ist passiert: " + e);				
			}
		}
		System.out.println("Jetzt kann die party losgehen");
	
	}
}
