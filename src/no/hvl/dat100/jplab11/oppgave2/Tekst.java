package no.hvl.dat100.jplab11.oppgave2;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Tekst extends Innlegg {
	protected int id;
	protected String bruker;
	protected String dato;
	protected String tekst;
	protected int likes;
	
	public Tekst () {
		
	}
	
	public Tekst(int id, String bruker, String dato, String tekst) {
		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		this.tekst = tekst;
	}
	
	public Tekst(int id, String bruker, String dato, int likes, String tekst) {
		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		this.likes = likes;
		this.tekst = tekst;		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTekst() {
		return tekst;
	}
	public void setTekst(String tekst) {
		this.tekst = tekst;
	}
	
	public String getDato() {
		return dato;
	}

	public void setdato(String dato) {
		this.dato = dato;
	}
	
	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}
	
	public String getBruker() {
		return bruker;
	}
	public void setruker(String bruker) {
		this.bruker = bruker;
	}

	@Override
	public String toString() {
		String str;
		str = "";
		str += "TEKST";
		str += "\n";
		str += Integer.toString(id);
		str += "\n";
		str += (bruker);
		str += "\n";
		str += (dato);
		str += "\n";
		str += Integer.toString(likes);
		str += "\n";
		str += (tekst);
		str += "\n";
		
		return str;	
	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
			
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
