package nasledjivanjeZadaci2;

public class VisaKartica extends PlatnaKartica {
	
	private String ovlascenoLice;

	public String getOvlascenoLice() {
		return ovlascenoLice;
	}

	public void setOvlascenoLice(String ovlascenoLice) {
		this.ovlascenoLice = ovlascenoLice;
	}

	public VisaKartica(double suma, String brojKartice, int godinaIsteka, int mesecIsteka, String ovlascenoLice) {
		super(suma, brojKartice, godinaIsteka, mesecIsteka);
		this.ovlascenoLice = ovlascenoLice;
	}
	
	public double izvrsiTransakciju() {
			double provizija = (super.getProsledjenaVrednost() * 0.18);
		if (provizija < 4) {
			// Ne treba super.suma, jer je suma protected
			suma = suma - 4 - super.getProsledjenaVrednost();
		} else {
			suma = suma - provizija - super.getProsledjenaVrednost();
		}
		return suma;
	}
	
	public void stampajPodatkeVisa() {
		System.out.println("Visa card: "); super.stampajPodatke();
	}
	
}
//Napraviti klasu VisaKartica koja nasledjuje klasu PlatnaKartica
//•	 ovlaceno lice, cuva se ime i prezime osobe koja ima ovlascenje da podize novac u ekspozituri.
//•	getter i setter za ovlasceno lice
//•	konstruktor sa parametrima
//•	  implementira metodu izvrsiTransakciju,  tako da na prosledjenu sumu dodaje proviziju od 1.8% sume. Najmanja provizija moze biti $4.
//•	  implementira metodu koja stampa podatke o kartici u formatu:
//Visa Card: 4012-1239-1221-3381, 11/2019, $212
