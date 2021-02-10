package nasledjivanjeZadaci2;

public class PlatnaKartica {

	protected double suma;
	private String brojKartice;
	private int godinaIsteka;
	private int mesecIsteka;
	private double prosledjenaVrednost;
	
	
	
	public double getProsledjenaVrednost() {
		return prosledjenaVrednost;
	}
	public void setProsledjenaVrednost(double prosledjenaVrednost) {
		this.prosledjenaVrednost = prosledjenaVrednost;
	}
	public double getSuma() {
		return suma;
	}
	public String getBrojKartice() {
		return brojKartice;
	}
	public int getGodinaIsteka() {
		return godinaIsteka;
	}
	public int getMesecIsteka() {
		return mesecIsteka;
	}
	public PlatnaKartica(double suma, String brojKartice, int godinaIsteka, int mesecIsteka) {
		super();
		this.suma = suma;
		this.brojKartice = brojKartice;
		this.godinaIsteka = godinaIsteka;
		this.mesecIsteka = mesecIsteka;
	}
	
	// Ova metoda moze da menja sumu, jer je javna, a u istoj klasi kao varijabla suma,
	// inaèe je ne bismo mogli menjati (nemamo setter)
	public double dodajSredstva() {
		return suma = suma + prosledjenaVrednost;
	}
	
	public double izvrsiTransakciju() {
		return suma = suma - prosledjenaVrednost;
	}
	
	public void stampajPodatke() {
		System.out.println(brojKartice + ", " + mesecIsteka + "/" + godinaIsteka+ ", " + "$" + suma);
	}
	
}
//Napraviti klasu PlatnaKartica koja ima
//•	  atribut suma  - cuva trenutnu sumu novca na kartici u dolarima
//•	  atribut broj kartice  primer: 4012-1239-1221-3381
//•	  atribut godina - godina do kada vazi kartica
//•	  atribut mesec-  mesec do kada vazi kartica
//•	  konstruktor sa parametrima
//•	  gettere za sve atribute, bez settera
//•	   metodu dodajSredstva koja povecava sumu za unetu vrednost
//•	  metodu izvrsiTransakciju koja skida prosledjenu vrednost sa racuna.
//•	  metodu koja stampa podatke o kartici u formatu:
//	  4012-1239-1221-3381, 11/2019, $212
