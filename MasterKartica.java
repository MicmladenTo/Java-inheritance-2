package nasledjivanjeZadaci2;

public class MasterKartica extends PlatnaKartica {

	public MasterKartica(double suma, String brojKartice, int godinaIsteka, int mesecIsteka) {
		super(suma, brojKartice, godinaIsteka, mesecIsteka);
	}
	
	public void izvrsiTransakciju(double prosledjenaVrednost) {
		double provizija = (super.getProsledjenaVrednost() * 0.15);
		suma = suma - provizija - super.getProsledjenaVrednost();
}
	
	public void naplatiOdrzavanje() {
		suma = suma - 2;
	}
	
	public void stampajPodatkeMastercard() {
		System.out.println("Master card: " + super.getMesecIsteka() + "/" + super.getGodinaIsteka() + ", "
							+ super.getBrojKartice() + ", $" + super.getSuma());
	}
	
}
//Napraviti klasu MasterKartica koja nasledjuje klasu PlatnaKartica
//•	  konstruktor sa parametrima
//•	  implementira metodu koja vrsi transakciju, tako da na prosledjenu sumu dodaje proviziju od 1.5 posto na sumu.
//•	  metoda naplatiOdrzavanje, koja sa racuna skida $2.
//•	  implementira metodu koja stampa podatke o kartici u formatu:
//Master Card: 12/2019, 4012-1239-1221-3381, $232
//u main funkciji, napraviti visa i master kartice i testirati funkcije
