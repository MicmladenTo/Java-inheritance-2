package nasledjivanjeZadaci2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		VisaKartica vizaElektron = new VisaKartica(1000, "132-132-465-524", 2021, 8, "Petar Petrovic");
		vizaElektron.setProsledjenaVrednost(10);
		vizaElektron.izvrsiTransakciju();
		vizaElektron.stampajPodatkeVisa();
		
		System.out.println("//////////////");
		
		MasterKartica mastercard = new MasterKartica(1000, "132-132-465-524", 2021, 8);
		mastercard.setProsledjenaVrednost(10);
		mastercard.izvrsiTransakciju();
		mastercard.naplatiOdrzavanje();
		mastercard.stampajPodatkeMastercard();
		
	}

}
// Izbaciti sve returnove i samo dodati argumente u void funkcije