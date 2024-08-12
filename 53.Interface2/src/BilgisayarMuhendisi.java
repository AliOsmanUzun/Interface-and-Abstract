

public class BilgisayarMuhendisi extends BaseMuhendis implements IMuhendis  {


public BilgisayarMuhendisi() {
}




public BilgisayarMuhendisi(String isim, String soyisim, double tecrube, double maas, String[] diller) {
	setIsim(isim);
	setSoyisim(soyisim);
	setTecrube(tecrube);
	setMaas(maas);
	setDiller(diller);
}

@Override
	public void bilgileriYazdir() {
	System.out.println("İsim : " + getIsim());
	System.out.println("Soyisim : " + getSoyisim());
	System.out.println("Tecrübe : " + getTecrube()); 
	System.out.println("Maaş : " + getMaas());
	System.out.print("Diller : ");
	// Dizi'deki elemanları teker teker çıktısını vermek istiyorsam dizi içerisinde dönmem gerekiyordu.
	// Bunuda foreach ile yapıyordum.
	
	for (String dil : getDiller() ) { // Diller dizisi'nin her bir elemanı üzerinde dön ve her döndüğün elemanı
							       // String veri tipindeki dil isimli değişken içerisinde tut.
		System.out.print(dil + " , ");
	}
	System.out.println("Askerlik Durumu : " + getAskerlikDurum());
	}

@Override
public void askerlikYapildiMi(boolean deger) {
	if (deger) { // deger parametresi true ise 
	setAskerlikDurum("Askerlik yapıldı");
	} else { // deger parametresi false ise
     setAskerlikDurum("Askerlik yapılmadı");              
	}
}

}
