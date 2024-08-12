
public class Dikdortgen extends GeometrikSekil{

	private double genişlik;
	private double uzunluk;
	
	public Dikdortgen() {
	}
	
	
	
	
	public Dikdortgen(double genişlik, double uzunluk) {
		this.genişlik = genişlik;
		this.uzunluk = uzunluk;
		super.sekilIsim="Dikdörtgen";
		
		
	}

	@Override
	public void alanHesapla() {
		double dikdortgenAlan= (getGenişlik()*getUzunluk());
		System.out.println(super.sekilIsim + " nin alanı : " + dikdortgenAlan);
	}

	@Override
	public void cevreHesapla() {
	double dikdortgenCevre=(getGenişlik()+getUzunluk())*2;
	System.out.println(super.sekilIsim + " nin çevresi : " + dikdortgenCevre);
	}




	public double getGenişlik() {
		return genişlik;
	}




	public void setGenişlik(double genişlik) {
		this.genişlik = genişlik;
	}




	public double getUzunluk() {
		return uzunluk;
	}




	public void setUzunluk(double uzunluk) {
		this.uzunluk = uzunluk;
	}
	
	

	
}
