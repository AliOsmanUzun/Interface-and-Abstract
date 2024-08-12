
public interface VeriTabani {
	
	// Interface java'da bir sınıfın hangi metotları kullanacağını belirten bir şablondur.
	// Sadece metod imzalarını içerir ( metod adı ve parametreleri ) 
	// Metotların body kısmı olmaz ( metodun bir içeriği olmaz ) {} <--- body kısmı yok
	// Metotlar sadece tanımlanır içerisinde kullanılmaz.
	// Bir sınıf , bir interface'i implements eder ( uygular ) ve interface'de tanımlanan tüm metodları kendisi tanımlar.
	// Implements ile bir nevi ınterface'deki metotları miras alıyor gibiyiz onları mantık aynı.
	// En önemli farklı orada tanımlı bir metod varken burada tanımsız bir metot var 
	// Biz bu metodu sıfırdan tanımlıyoruz.
	// Bir sınıfın metotlarının ne yapacağını belirtir neler yapacağını değil

	public void ekle();
	
	public void sil();
		
	public void guncelle();
	
	public void getir();
} 
