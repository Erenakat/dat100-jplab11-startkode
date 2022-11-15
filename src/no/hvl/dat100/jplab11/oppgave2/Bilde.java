package no.hvl.dat100.jplab11.oppgave2;

import no.hvl.dat100.jplab11.common.TODO;

public class Bilde extends Tekst {

	protected int id;
	protected String bruker;
	protected String dato;
	protected String tekst;
	protected int likes;
	protected String url;	
	
	public Bilde(int id, String bruker, String dato, String tekst, String url) {
		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		this.tekst = tekst;	
		this.url = url;	
	}

	public Bilde(int id, String bruker, String dato, int likes, String tekst, String url) {
		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		this.likes = likes;
		this.tekst = tekst;	
		this.url = url;
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

	public void setDato(String dato) {
		this.dato = dato;
	}
	
	public int getLikes() {
		return likes;
	}

	public void setlikes(int likes) {
		this.likes = likes;
	}
	
	public String getBruker() {
		return bruker;
	}
	public void setbruker(String bruker) {
		this.bruker = bruker;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	@Override
	public String toString() {
		String str;
		str = "";
		str += "BILDE";
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
		str += (url);
		str += "\n";
		
		return str;
	}

	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
