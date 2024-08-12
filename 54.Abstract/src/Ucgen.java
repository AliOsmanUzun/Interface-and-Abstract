
public class Ucgen extends GeometrikSekil{
	
	// Eğer abstract bir class'ı miras alıyorsak onun içerisindeki abstract metodları override etmek zorundayız.
	// Miras alınan class içerisinde
	
	// Ucgen alanı : (Taban * Yükseklik) / 2
	
	private int yukseklik; 
	private int taban ; 
	private int cevre;
	
	public Ucgen() {
	}
	
	
	
	
	public Ucgen(int yukseklik, int taban , int cevre) {
		this.yukseklik = yukseklik;
		this.taban = taban;
		this.cevre=cevre;
		super.sekilIsim="Üçgen";
	}



	public void sekilBilgileri() {
	}
	@Override
	public void alanHesapla() { // artı olarak override ettiğimizde abstract keyword özellikleride gidiyor.
		int sonucAlan=(getTaban()*getYukseklik())/2;
		System.out.println(super.sekilIsim +" nin alanı : " +sonucAlan);
	}
	
	@Override
	public void cevreHesapla() {
	int sonucCevre=(getCevre()*3);
	System.out.println(super.sekilIsim + " nin çevresi : " + sonucCevre);
	}




	public int getYukseklik() {
		return yukseklik;
	}




	public void setYukseklik(int yukseklik) {
		this.yukseklik = yukseklik;
	}




	public int getTaban() {
		return taban;
	}




	public void setTaban(int taban) {
		this.taban = taban;
	}




	public int getCevre() {
		return cevre;
	}




	public void setCevre(int cevre) {
		this.cevre = cevre;
	}
	
	

}
