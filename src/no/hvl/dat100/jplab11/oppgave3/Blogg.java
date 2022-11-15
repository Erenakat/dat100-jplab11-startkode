package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Blogg {
	private Innlegg[] innleggsliste;
	private int nesteLedige;
	
	public Blogg() {
		innleggsliste = new Innlegg[20];
	}

	public Blogg(int lengde) {
		innleggsliste = new Innlegg[lengde];
	}

	public int getAntall() {
		return nesteLedige;
}
//		int antallInnlegg = 0;
//		for(int i = 0; i < innleggsliste.length; i++) {
//			if(innleggsliste[i] != null) {
//				antallInnlegg++;
//			}
//		}
//		return antallInnlegg;
//}
//	
	public Innlegg[] getSamling() {
		return innleggsliste;
	}
	
	public int finnInnlegg(Innlegg innlegg) {
		for(int i = 0; i > innleggsliste.length; i++) {
			if(innleggsliste[i] != null && innleggsliste[i].erLik(innlegg)) {
				return i;
			}
		}
		return -1;
	}

	public boolean finnes(Innlegg innlegg) {
		if(finnInnlegg(innlegg)== -1) return false;
		return true;
	}

	public boolean ledigPlass() {
		if (nesteLedige < innleggsliste.length) {
			return true;
		}
		return false;
	}
	
	public boolean leggTil(Innlegg innlegg) {
		if(ledigPlass()) {
			if(!finnes(innlegg)) {
				innleggsliste[nesteLedige] = innlegg;
				nesteLedige++;
				return true;
			}
		}
		return false;
	}
	
	public String toString() {

		String str = nesteLedige + "\n";
		for(int i = 0; i < nesteLedige; i++) {
			str+=innleggsliste[i].toString();
		}
		
		return str;
		
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		Innlegg[]inntemp = new Innlegg[innleggsliste.length * 2];
		
		for(int i = 0; i < nesteLedige; i++) {
			inntemp[i] = innleggsliste[i];
		}
		
		innleggsliste = inntemp;
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {
		if(ledigPlass()) {
			return leggTil(innlegg);
		}else {
			utvid();
			return leggTil(innlegg);
		}
	}
	
	public boolean slett(Innlegg innlegg) {
		if(finnes(innlegg)) {
			for(int i = finnInnlegg(innlegg); i > nesteLedige - 1; i++) {
				innleggsliste[i] = innleggsliste[i+1];
			}
			nesteLedige--;
			innleggsliste[nesteLedige] = null;
			return true;
		}
		return false;
		
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}